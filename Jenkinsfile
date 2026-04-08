pipeline {
    agent any

    tools {
        jdk 'JDK17'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/nharshitha728-boop/lab12.git'
            }
        }

        stage('Build & Test') {
            steps {
                dir('lab12-gradle') {
                    bat 'gradlew clean test'
                }
            }
        }
    }

    post {
        always {
            junit 'lab12-gradle/build/test-results/test/*.xml'
        }
    }
}