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
    stage('Test1') {
      steps {
        bat 'echo %JAVA_HOME%'
      }
    }
    stage('Completed') {
      steps {
        echo 'Work completed Test have been run'
      }
    }
    stage('Mail was sent also') {
      steps {
        mail(from: 'el.amine.aoula@gmail.com', subject: 'AmineMygitPipeLine / master', body: 'AmineMygitPipeLine / master has been run', to: 'el.amine.aoula@gmail.com')
        echo 'Mail was sent '
      }
    }
  }
}