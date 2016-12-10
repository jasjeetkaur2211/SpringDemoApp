# SpringDemoApp
Developed to build a basic spring web application which java dispatcher and decoupled html files. No jsp used. 
Also setup a bower file for javascript library dependency management.

1. Download the project.
2. Run bower on the src/main/webapp/WEB-INF/pages folder. This will download all the required javascript libraries.
3. Run maven on the root folder.
4. Deploy on tomcat server. Tested on V9 of tomcat. Earlier versions might have a problem since this is built on java 8


What I wanted to do is:
1. Use Spring MVC as a REST backend. It has some rest end points. Added mock models and  
2. Spring MVC is setup in a way to serve the html files in the src/main/webapp/WEB-INF/pages folder. 
3. Use Bower to manage the front end dependencies. 
4. Separate front end and backend completely. No dependency on a jsp or a framework dependent language.



