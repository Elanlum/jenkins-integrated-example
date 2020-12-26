pipeline {
    agent any

    stages {
        stage ('Build') {
            sh '/gradelew clean build'
        }

        stage ('Test') {
            sh '/gradelew clean test'
        }
    }
}