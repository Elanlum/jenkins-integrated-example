pipeline {
    agent any

    tools {
      gradle "GRADLE_LATEST"
    }

    stages {
        stage ('Build') {
          steps {
            sh 'gradle clean build'
          }
        }

        stage ('Test') {
          steps {
            sh 'gradle clean test'
          }
        }
    }
}