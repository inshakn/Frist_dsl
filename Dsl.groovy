SCM_REPO = 'https://github.com/inshakn/first_dsl.git'
job("example_DSLjob"){
  description("first DSL job at ${new Date()}")
  scm{
    git{
          remote {
                    url('${SCM_REPO}')
                        }
                        branch("main")
          }
    
  }
  steps{
    script {
                def userInput = input(
                 id: 'userInput', message: 'Enter path of test reports:?', 
                 parameters: [
                 [$class: 'TextParameterDefinition', defaultValue: 'None', description: 'Path of config file', name: 'Config'],
                 [$class: 'TextParameterDefinition', defaultValue: 'None', description: 'Test Info file', name: 'Test']
                ])
                echo ("IQA Sheet Path: "+userInput['Config'])
                echo ("Test Info file path: "+userInput['Test'])
                              
                }
  }

}
