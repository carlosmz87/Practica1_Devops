pipeline{
    agent any
    stages{
        stage("Build"){
            steps{
                script{
                    dockerImage = docker.build "carlosmz87/curso-devops"
                }
            }
            post{
                always{
                    echo "========always========"
                }
                success{
                    echo "========Build executed successfully========"
                }
                failure{
                    echo "========Build execution Build========"
                }
            }
        }
        stage("Test"){
            steps{
                echo "========executing Test========"
            }
            post{
                always{
                    echo "========always========"
                }
                success{
                    echo "========Test executed successfully========"
                }
                failure{
                    echo "========Test execution failed========"
                }
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
            post{
                always{
                    echo "========always========"
                }
                success{
                    echo "========Deploy executed successfully========"
                }
                failure{
                    echo "========Deploy execution failed========"
                }
            }
        }
    }
    post{
        always{
            echo "========always========"
        }
        success{
            echo "========pipeline executed successfully ========"
        }
        failure{
            echo "========pipeline execution failed========"
        }
    }
}