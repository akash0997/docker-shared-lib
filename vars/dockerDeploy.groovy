def call (docker_user,external_port,internal_port)
{
    def script_content = libraryResource 'dockerDeploy.sh'
    writeFile file: './dockerDeploy.sh', text: script_content
    sh """
    bash dockerDeploy.sh $docker_user $external_port $internal_port
    """  
}
