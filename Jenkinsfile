pipeline{
  agent any
  tools{
    maven 'devops_maven'
  }
  triggers{
    githubPush()
  }
  enviroment{
    POM="jugandoArreglos/pom.xml"
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
          junit 'jugandoArreglos/target/surefire-reports/*.xml'
        }
      }
    }
    stage('Empaquetado'){
      steps{
        archiveArtifacts artifacs: 'jugandoArreglos/target/*.jar', fingerprint:true
      }
    }
  }
}
