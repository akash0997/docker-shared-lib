def call (docker_user)
{
    println (docker_user)
    def script_content = libraryResource 'dockerBuild.sh'
    writeFile file: './dockerBuild.sh', text: script_content
    sh 'cat dockerBuild.sh && bash ./dockerBuild.sh'
}
