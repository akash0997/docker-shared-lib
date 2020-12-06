def call (user,pass)
{
   sh '''
      docker login --username ${user} --password ${pass}
      docker push akash97/${JOB_NAME}:${BUILD_NUMBER}
      docker push akash97/${JOB_NAME}:latest
     '''
}
