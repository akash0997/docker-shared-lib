def call() {
    withCredentials([usernamePassword(
            credentialsId: "docker-cred",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
       sh '''
                docker login --username ${USER} --password ${PASS}
                docker push akash97/${JOB_NAME}:${BUILD_NUMBER}
                docker push akash97/${JOB_NAME}:latest
            '''
    }
}