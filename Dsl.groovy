job("example_DSLjob"){
  description("first DSL job at ${new date()}")
  triggers{
    scm('* * * * *')
  }
  steps{
      shell('echo hello insha')
  }

}
