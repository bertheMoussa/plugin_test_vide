pipeline {
    agent {
        docker {
            image 'maven:3.8.5-jdk-11' // Ensure the Maven image has JDK 11 to match your project requirements
            args '-v /var/run/docker.sock:/var/run/docker.sock' // Optional: only if you need to run Docker inside Docker
        }
    }
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/bertheMoussa/plugin_test_vide.git', branch: 'plugin_test_plein'
            }
        }

        stage('Build') {
            steps {
                script {
                    // Run Maven build
                    sh 'mvn clean install'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Run Maven tests
                    sh 'mvn test'
                }
            }
        }

        stage('Package') {
            steps {
                script {
                    // Package the application
                    sh 'mvn package'
                }
            }
        }
        
        stage('Deploy') {
            steps {
                script {
                    // Placeholder for deployment step
                    echo 'Deploying application...'
                }
            }
        }
    }

    post {
        success {
            echo 'Build, test, and package completed successfully.'
        }
        failure {
            echo 'Build, test, or package failed.'
        }
    }
}