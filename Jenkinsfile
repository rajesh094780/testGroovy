pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                node {
                    def thing = load 'test.groovy'
                    echo thing.doStuff()
                }
                
            
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
    
