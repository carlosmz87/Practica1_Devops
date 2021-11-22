pipeline{
    agent any
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
        stage("Docker_frontend"){
            steps{
                echo "FRONTEND BUILD DOCKER IMAGE"
                dir('frontend'){
                    sh 'ng build --prod' 
                    script{
                        dockerImage = docker.build "frontend/carlosmz87/springcrudfront"
                    }
                }
            }
        }
        stage("Docker_backend"){
            steps{
                echo "BACKEND BUILD DOCKER IMAGE"
                dir('backend'){ 
                    script{
                        dockerImage = docker.build "backend/carlosmz87/springcrudback"
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