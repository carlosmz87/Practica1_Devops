pipeline{
    agent any
    stages{
        stage("Checkout"){
            steps{
                echo "CHECKOUT"
                git branch: 'jenkins', url: "https://github.com/carlosmz87/Practica1_Devops.git"
            }
        }
        stage("Test"){
            steps{
                echo "BACKEND TEST"
                dir('backend'){
                    bat "mvn clean install test"
                }

            }
        }
        stage("Build"){
            steps{
                echo "BUILD"
                sh './m'
            }
           
        }
        stage("Deploy"){
            steps{
                echo "DEPLOY"
                
            }
        }
    }
}