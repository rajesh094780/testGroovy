pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                thing = load 'test.groovy'
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
    
