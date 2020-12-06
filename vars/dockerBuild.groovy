def call ()
{
    def script_content = libraryResource 'dockerBuild.sh'
    writeFile file: './dockerBuild.sh', text: script_content
    sh 'bash ./dockerBuild.sh'
}
