pipeline {
    agent any

    tools {
        maven "MAVEN"
        jdk "JDk"
    }

    stages {

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

    }
}
