pipeline {
    agent any

    stages {
        stage ('Build') {
          steps {
            script {
              sh '/gradelew clean build'
            }
          }
        }

        stage ('Test') {
          steps {
            script {
              sh '/gradelew clean test'
            }
          }
        }
    }
}