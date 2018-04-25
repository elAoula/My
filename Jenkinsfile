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
        sh 'ping -c 2 localhost'
      }
    }
    stage('Print Done Message') {
      steps {
        echo 'The build is done'
      }
    }
  }
}