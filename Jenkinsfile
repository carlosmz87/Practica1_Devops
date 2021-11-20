pipeline{
    agent any
    stages{
        stage("Build"){
            steps{
                script{
                    dockerImage = docker.build "carlosmz87/springcrudfront:latest"
                    dockerImage = docker.build "carlosmz87/springcrudback:latest"
                }
            }
           
        }
        stage("Test"){
            steps{
                echo "========executing Test========"
            }
        }
        stage("Deploy"){
            steps{
                script{
                    docker.withRegistry('','6ded101a-9ee4-4add-8efa-4bb15a91a536'){
                        docker.push("$BUILD_NUMBER")
                        dockerImage.push("latest")
                    }
                }
            }
        }
    }
}