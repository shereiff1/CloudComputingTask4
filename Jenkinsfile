pipeline {
    agent any

    tools {
        maven 'Maven 3.9'
        jdk   'JDK 25'
    }

    stages {

        stage('Clone Repository') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/shereiff1/CloudComputingTask4.git'
            }
        }

        stage('Build') {
            steps {
                dir('CloudComputingTask4') {
                    bat 'mvn clean compile -B'
                }
            }
        }

        stage('Run Unit Tests') {
            steps {
                dir('CloudComputingTask4') {
                    bat 'mvn test -B'
                }
            }
            post {
                always {
                    junit 'CloudComputingTask4/target/surefire-reports/*.xml'
                }
            }
        }
    }

    post {
        success { echo 'All tests passed!' }
        failure { echo 'Build or tests failed. Check the logs above.' }
    }
}
