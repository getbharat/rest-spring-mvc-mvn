# rest-spring-mvc-mvn
## This repository demonstrates the use of rest template which is used to make a http call to another rest service.
* The projects use spring and maven, both the projects are packaged as war.
* Deploy alert using tomcat, you can choose any available port to run the tomcat.
* Deploy related-info using tomcat, but make sure tomcat port should be 8091 as it is hardcoded in alert which makes a http call using rest template. 
* If you see the call to related-info, you can see that we can define the response type, in this case, it is `List<String>`.
* Access the alert end point using``http://localhost:{PORT}/alert/v1/get/{docGuid}``.
