pipeline{
    agent{
        label "node"
    }
    stages{
        stage("Build"){
            steps{
                echo "========executing Build========"
            }
            post{
                always{
                    echo "========always========"
                }
                success{
                    echo "========Build executed successfully========"
                }
                failure{
                    echo "========A execution Build========"
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
                echo "========executing Deploy========"
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