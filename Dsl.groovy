SCM_REPO = 'https://github.com/inshakn/first_dsl.git'
job("example_DSLjob"){
  description("first DSL job at ${new Date()}")
  scm{
    git{
          remote {
                    name('origin')
                    url('${SCM_REPO}')
                        }
                        branch("main")
          }
    
  }
  steps{
      shell('echo hello insha')
  }

}
