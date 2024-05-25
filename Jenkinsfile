pipeline {
    agent {
        docker {
            image 'maven:3.8.5-jdk-11' // Ensure the Maven image has JDK 11 to match your project requirements
            args '-v /var/run/docker.sock:/var/run/docker.sock' // Optional: only if you need to run Docker inside Docker
        }
    }
    environment {
        GIT_URL = 'https://github.com/bertheMoussa/plugin_test_vide.git'
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'plugin_test_vide', url: env.GIT_URL
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }
    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
        cleanup {
            script {
                def containerName = "my-app-container"
                sh "docker stop ${containerName} || true"
                sh "docker rm ${containerName} || true"
            }
        }
    }
}