pipeline {
    tools {
        maven 'Maven 3.9.0'
    }

    agent any

    environment {
        registry = "utka4sh/mini_project"
        credentialID = "dockerhub"
        dockerImage = ""
    }

    stages {
        stage('Initalize'){
            steps{
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage('Build and test') {
            steps {
                sh 'mvn clean install'
            }

            post {
                success {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        
        stage('Build docker image'){
            steps {
                script{
                    dockerImage = docker.build(registry + ":latest")
                }
            }
        }

        stage('Push image to dockerhub'){
            steps{
                script{
                    docker.withRegistry('', credentialID) {
                        dockerImage.push()
                    }
                }
            }
        }

        stage('Deploy') {
            steps {
                ansiblePlaybook colorized:true,
                installation: 'Ansible',
                inventory: 'inventory',
                playbook: 'playbook.yml'
            }
        }
    }
}