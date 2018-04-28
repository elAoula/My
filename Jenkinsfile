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
    stage('Test') {
      steps {
         sh 'make check'
         junit 'reports/**/*.xml'
      }
    }
    stage('Completed') {
      steps {
        echo 'Work completed Test have been run'
      }
    }
    stage('Mail was sent also') {
      steps {
        echo 'Mail was sent '
      }
    }
  }
}
