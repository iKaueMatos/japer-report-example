pipeline {
  agent any

  stages {
    stage('Build Docker Image') {
      steps {
        sh 'echo "Executando o comando Docker Build"'
      }
    }

    stage('Push Docker Image') {
      steps {
        sh 'echo "Executando o comando Docker Push Image"'
      }
    }
  }
}