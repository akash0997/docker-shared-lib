def call (docker_user)
{
    println (docker_user)
    def script_content = libraryResource 'dockerBuild.sh'
    writeFile file: './dockerBuild.sh ', text: script_content
    sh 'pwd && ll && bash ./dockerBuild.sh "$docker_user"'
}
