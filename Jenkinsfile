pipeline{
    agent any
    environment{
        registryCredential = 'docher_hub'
    }
    tools {
        maven 'M3'
        nodejs 'nodejs'
    }
    stages{
        stage("Checkout"){
            steps{
                echo "GIT CHECKOUT STAGE"
                git branch: 'jenkins', url: "https://github.com/carlosmz87/Practica1_Devops.git"
            }
        }
        
        stage("Deploy Backend"){
            steps{
                echo "DEPLOY"
                echo "DEPLOY BACKEND"
                echo "PUSH BACKEND IMAGE"
                script{
                    docker.withRegistry('',registryCredential){
                        dockerImageB.push("$BUILD_NUMBER")
                        dockerImageB.push("latest")
                    }
                }
                
            }
        }
         stage("Deploy Frontend"){
            steps{
                echo "DEPLOY FRONTEND"
                echo "PUSH FRONTEND IMAGE"
                script{
                    docker.withRegistry('',registryCredential){
                        dockerImageF.push("$BUILD_NUMBER")
                        dockerImageF.push("latest")
                    }
                }
                
            }
        }
    }
}