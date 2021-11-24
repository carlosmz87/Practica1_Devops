pipeline{
    agent any
    tools {
        maven 'M3'
        nodejs 'nodejs'
    }
    environment{
        DOCKERHUB_CREDENTIALS = credentials('docker_hub')
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
        stage("Deploy App"){
            steps{
                echo "DEPLOY"
                echo "LOGIN DOCKERHUB"
                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
                echo "PUSH FRONTEND IMAGE"
                sh 'docker push carlosmz87/springcrudback:latest'
                sh 'docker push carlosmz87/springcrudback:$BUILD_NUMBER'
                sh 'docker push carlosmz87/springcrudfront:latest'
                sh 'docker push carlosmz87/springcrudfront:$BUILD_NUMBER'
            }
        }
    }
    post{
        always{
            sh 'docker logout'
        }
    }
}