#!/bin/bash
docker_user=$1
echo "$docker_user"
docker build -t $docker_user/${JOB_NAME}:${BUILD_NUMBER} .
docker tag $docker_user/${JOB_NAME}:${BUILD_NUMBER} $docker_user/${JOB_NAME}:latest
docker images