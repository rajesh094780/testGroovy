pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                pipeline=load 'test.groovy'
                
            
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
    
