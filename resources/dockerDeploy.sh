#!/bin/bash
docker_user=$1
echo $docker_user
external_port=$2
internal_port=$3
container_id=$(docker ps -qf "name=${JOB_NAME}") && [ -z $container_id ] && echo "Container not running" || (docker stop $container_id && docker rm $container_id)
docker run -p $external_port:$internal_port --name ${JOB_NAME} -d $docker_user/${JOB_NAME}:latest
docker ps | grep ${JOB_NAME}
docker logs ${JOB_NAME}
test=$(curl localhost:$external_port)
if [[ $test == "Hello World, testing Docker container" ]]; then
   echo "Test successful"
else
  echo "Test failed"
fi