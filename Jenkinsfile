pipeline{
    agent any
    stages{
        
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
