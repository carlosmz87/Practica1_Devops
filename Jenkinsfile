pipeline{
    agent any
    stages{
        stage("Checkout"){
            steps{
                echo "CHECKOUT"
                git branch: 'dev', url: "https://github.com/carlosmz87/Practica1_Devops.git"
            }
        }
        stage("Build"){
            steps{
                echo "BUILD"
            }
           
        }
        stage("Test"){
            steps{
                echo "TEST"
            }
        }
        stage("Deploy"){
            steps{
                echo "DEPLOY"
                
            }
        }
    }
}