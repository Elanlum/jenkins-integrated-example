pipeline {
    agent any

    stages {
        stage ('Build') {
          steps {
            gradle('clean', 'build')
          }
        }

        stage ('Test') {
          steps {
            gradle('clean', 'test')
          }
        }
    }
}