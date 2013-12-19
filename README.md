Spring MVC updated "hello world" example
by Steve Saporta
Dec 19 2013

TO BE UPDATED!

This is an updated version of [mkyong's excellent Spring 3 MVC Hello World Example](http://www.mkyong.com/spring3/spring-3-mvc-hello-world-example/). My version includes a few enhancements:
- Works out of the box with Eclipse Juno and Tomcat 7
- Maven standard directory structure
- Spring version 4.0.0.BUILD-SNAPSHOT rather than 3.0.5.RELEASE
- No need to append "welcome" to the URL to see the "hello world" page
- Project and classpath settings work with Tomcat 7 and Java 1.7

Here are instructions for importing and running the project in Eclipse Juno with Tomcat 7:
- Open a shell or DOS command window.
- Change directory to your Eclipse workspace.
- Clone the Git repo:

    git clone git@github.com:sasaporta/springmvcgoodness.git

- Open Eclipse.
- Select *File | Import* from the menu.
- Expand *General* and select *Existing Projects into Workspace*. Click *Next*.
- Browse to the *springmvcgoodness* subfolder of your Eclispe workspace and click *OK*.
- Click *Finish*.
- Right-click *springmvcgoodness* in Eclipse's Project Explorer and select *Run As | Run on Server*.
- Click *Finish*.
- Restart the server if prompted to do so.
- You should see a "hello world" page.