pipeline {
  agent any
  stages {
    stage('Printing Message') {
      steps {
        echo 'Starting Build'
      }
    }
    stage('Build') {
      steps {
        git 'https://github.com/elAoula/My.git'
      }
    }
    stage('Print Done Message') {
      steps {
        echo 'The build is done'
      }
    }
  }
}