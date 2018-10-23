pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                def thing = load 'test.groovy'
                echo thing.doStuff()
                
            
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
    
