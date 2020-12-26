pipeline {
    agent any

    stages {
        stage ('Build') {
          steps {
            gradlew('clean', 'build')
          }
        }

        stage ('Test') {
          steps {
            gradlew('clean', 'test')
          }
        }
    }
}

def gradlew(String... args) {
    sh "./gradlew ${args.join(' ')} -s"
}