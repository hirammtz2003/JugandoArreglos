pipeline{
  agent any
  tools{
    maven 'devops_maven'
  }
  triggers{
    githubPush()
  }
  environment{
    POM="JugandoArreglos/pom.xml"
  }
  stages{
    stage('Descarga'){
      steps{
        git url:'https://github.com/hirammtz2003/JugandoArreglos.git', branch:'main'
      }
    }
    stage('Compilacion'){
      steps{
        sh 'mvn -f $POM -B package'
      }
    }
    stage('Prueba'){
      steps{
        sh 'mvn -f $POM test'
      }
      post{
        always{
          junit 'JugandoArreglos/target/surefire-reports/*.xml'
        }
      }
    }
    stage('Empaquetado'){
      steps{
        archiveArtifacts artifacts: 'JugandoArreglos/target/*.jar', fingerprint:true
      }
    }
  }
}
