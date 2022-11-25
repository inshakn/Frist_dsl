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
    
             shell('echo hi')
            '''reverse_file = load 'palindrome.groovy'
            print(reverse_file)'''
  }

}
