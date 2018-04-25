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
    stage('CleanPackage Script') {
      steps {
        sh 'clean package'
      }
    }
    stage('Completed') {
      parallel {
        stage('Completed') {
          steps {
            echo 'Work completed'
          }
        }
        stage('SendEmail') {
          steps {
            mail(subject: 'Blue Ocean ', body: 'AmineMygitPipeLine / master', bcc: 'el.amine.aoula@cgi.com', from: 'el.amine.aoula@cgi.com', to: 'el.amine.aoula@cgi.com')
          }
        }
      }
    }
    stage('Mail was sent also') {
      steps {
        echo 'Mail was sent '
      }
    }
  }
}