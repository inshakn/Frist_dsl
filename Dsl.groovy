job("first DSL job"){
description("First DSL job created on ${date}")
    scm{
           git("https://github.com/inshakn/Frist_dsl.git","master")
    }
    triggers{
        scm('* * * * *')
    }
    steps{
        shell (echo 'Hello from Dsl.groovy')
        
    }
}