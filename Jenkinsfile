pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
            def c=load 'test.groovy'
                c.firstTest()
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
    
