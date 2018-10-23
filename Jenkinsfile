pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                def pipeline=load 'test.groovy'
                pipeline.firstTest()
            
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
    
