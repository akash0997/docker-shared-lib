#!/bin/bash
container_id=$(docker ps -qf "name=${JOB_NAME}") && [ -z $container_id ] && echo "Container not running" || (docker stop $container_id && docker rm $container_id)
docker run -p 5000:8000 --name ${JOB_NAME} -d akash97/${JOB_NAME}:latest