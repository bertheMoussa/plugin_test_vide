pipeline {
    
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/bertheMoussa/plugin_test_vide.git', branch: 'plugin_test_vide'
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