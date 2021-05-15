## Running Jenkins

`./gradlew docker dockerRun`

Jenkins will then be available at [http://localhost:8082](http://localhost:8082).

* 'Build' seed-job and it will generate 'user-account-example-job'. 
* 'Build' user-account-example-job job and it will Build an Test [User Account API](https://github.com/sabrieker/user-account-example). You can view at Pipeline section.