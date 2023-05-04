pipeline{
    agent any
    stages{
        stage('checkout'){
            steps{
                
        checkout scm
            }
        }
        stage('Build'){
            steps{
                sh './gradlew build'
            }
        }
        stage('Test'){
            steps{
                sh './gradlew test'
            }
        }
    }
}
