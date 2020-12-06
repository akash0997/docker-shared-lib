def call ()
{
    def scriptDir = WORKSPACE + '@libs/shared-lib'
    sh "$scriptDir/dockerBuild.sh"
//    sh '''
//     pwd
//     docker build -t akash97/${JOB_NAME}:${BUILD_NUMBER} .
//     docker tag akash97/${JOB_NAME}:${BUILD_NUMBER} akash97/${JOB_NAME}:latest
//     docker images
//     '''
}
