pipeline {
    agent any

    stages {
        stage('Git Clone1') {
            steps {
                git credentialsId: 'GithubLogin', url: 'https://github.com/akshat-raj09/API_Automation_Using_REST_Assured'
            }
        }
        
        stage('Unit Test1') {
            steps {
                echo 'Inside Unit Test1 Stage'
            }
        }
        
        stage('Build1') {
            steps {
                echo 'Inside Build1 Stage'
            }
        }
        
        stage('QA1') {
            steps {
                build 'QA'
            }
        }
    }
}
