def call (docker_user)
{
    println (docker_user)
    def script_content = libraryResource 'dockerBuild.sh'
    writeFile file: './dockerBuild.sh ', text: script_content
    sh 'pwd && ls && bash dockerBuild.sh "$docker_user"'
}
