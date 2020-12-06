def call ()
{
    def script_content = libraryResource 'dockerDeploy.sh'
    writeFile file: './dockerDeploy.sh', text: script_content
    sh 'bash ./dockerDeploy.sh'   
}
