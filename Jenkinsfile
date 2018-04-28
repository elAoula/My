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
        isUnix()
        tool 'maven35'
      }
    }
    stage('CleanPackage Script') {
      steps {
        echo 'CompleteStep'
      }
    }
    stage('Completed') {
      steps {
        echo 'Work completed'
      }
    }
    stage('Mail was sent also') {
      steps {
        echo 'Mail was sent '
      }
    }
  }
}