pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('user-account-example-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/sabrieker/user-account-example.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}