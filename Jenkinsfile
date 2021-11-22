pipeline{
    agent any
    environment{
        dockerImage =''
    }
    tools {
        maven 'M3'
    }
    stages{
        stage("Checkout"){
            steps{
                echo "GIT CHECKOUT STAGE"
                git branch: 'jenkins', url: "https://github.com/carlosmz87/Practica1_Devops.git"
            }
        }
        stage("Test"){
            steps{
                echo "TEST STAGE"
                echo "BACKEND TEST"
                dir('backend'){ 
                    sh "mvn test"
                }
            }
        }
        stage("Build_jar"){
            steps{
                echo "BUILD STAGE"
                echo "BACKEND BUILD"
                echo "BACKEND BUILD JAR"
                dir('backend'){ 
                    sh 'mvn clean install -DskipTests'
                }
            }
        }
        stage("Docker_backend"){
            steps{
                echo "BACKEND BUILD DOCKER IMAGE"
                dir('backend'){ 
                    script{
                        dockerImage = docker.build "carlosmz87/springcrudback"
                    }
                }
            }
        }
        stage("Docker_frontend"){
            steps{
                echo "FRONTEND BUILD DOCKER IMAGE"
                dir('frontend'){
                    script{
                        dockerImage = docker.build "carlosmz87/springcrudfront"
                    }
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