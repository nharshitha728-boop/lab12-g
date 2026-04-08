pipeline {
    agent any

    stages {
        stage('Build & Test') {
            steps {
                // We use the wrapper so we don't even need to configure Gradle in Jenkins
                bat 'gradlew clean test'
            }
        }
    }

    post {
        always {
            // This finds the XML reports wherever they are in the workspace
            junit '**/build/test-results/test/*.xml'
        }
    }
}