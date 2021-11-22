pipeline{
    agent any
    tools {
        maven 'M3'
    }
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
                    sh "mvn test"
                }
            }
        }
        stage("Build"){
            steps{
                echo "BUILD"
                dir('backend'){ 
                    sh 'mvn clean install -DskipTests'
                }
                
                
            }
           
        }
        stage("Deploy"){
            steps{
                echo "DEPLOY"
                
            }
        }
    }
}