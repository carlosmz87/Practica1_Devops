pipeline{
    agent any
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
        stage("Test Backend"){
            steps{
                echo "TEST"
                echo "BACKEND TEST"
                dir('backend'){ 
                    sh "mvn test"
                }
            }
        }
        stage("Build jar"){
            steps{
                echo "BUILD"
                echo "BACKEND BUILD"
                echo "BACKEND BUILD JAR"
                dir('backend'){ 
                    sh 'mvn clean install -DskipTests'
                }
            }
        }
        stage("Docker Backend"){
            steps{
                echo "BACKEND BUILD DOCKER IMAGE"
                dir('backend'){ 
                    script{
                        dockerImageB = docker.build "carlosmz87/springcrudback"
                    }
                }
            }
        }
        stage("Deploy Backend"){
            steps{
                echo "DEPLOY"
                echo "DEPLOY BACKEND"
                echo "PUSH BACKEND IMAGE"
                script{
                    sh "docker login -u carlosmz87 --password-stdin lote69zona21"
                    sh "docker push carlosmz87/springcrudback:${BUILD_NUMBER}"
                    sh "docker push carlosmz87/springcrudback:latest"
                }
            }
        }
        stage("Build Front"){
            steps{
                echo 'FRONTEND BUILD'
                echo 'FRONTEND BUILD PROYECT'
                dir('frontend'){
                    sh 'npm install'
                    sh 'npm run ng build --prod'
                }
            }
        }
        stage("Docker Frontend"){
            steps{
                echo "FRONTEND BUILD DOCKER IMAGE"
                dir('frontend'){
                    script{
                        dockerImageF = docker.build "carlosmz87/springcrudfront"
                    }
                }
            }
        }
        stage("Deploy Frontend"){
            steps{
                echo "DEPLOY"
                echo "DEPLOY FRONTEND"
                echo "PUSH FRONTEND IMAGE"
                script{
                    sh "docker login -u carlosmz87 --password-stdin lote69zona21"
                    sh "docker push carlosmz87/springcrudfront:${BUILD_NUMBER}"
                    sh "docker push carlosmz87/springcrudfront:latest" 
                }
            }
        }
    }
}