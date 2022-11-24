job("example_DSLjob"){
  description("first DSL job at ${new Date()}")
  triggers{
    scm('* * * * *')
  }
  steps{
      shell('echo hello insha')
  }

}
