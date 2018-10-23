pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                GroovyShell shell = new GroovyShell()
                def execute = shell.parse(new File('test.groovy'))
                execute.firstTest()
                
            
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
    
