pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
            node{
            def common = load "test.groovy"
            common.example1()
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
    