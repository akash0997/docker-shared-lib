#!/bin/bash
pwd
docker_user = $1
docker build -t $docker_user/${JOB_NAME}:${BUILD_NUMBER} .
docker tag $docker_user/${JOB_NAME}:${BUILD_NUMBER} $docker_user/${JOB_NAME}:latest
docker images