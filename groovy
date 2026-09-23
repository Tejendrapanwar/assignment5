pipeline { 
    agent any

    stages {

        stage('clone Repository') {
            steps {
                git branch:'develop',
                credentialsId: 'github-token',
                url: 'https://github.com/Tejendrapanwar/assignment5.git'
            }
        }
        stage('Show Files') {
            steps {
                sh 'pwd'
                sh 'ls -la'
            }
        }

    }
}   
