Spring MVC example showing how to use two models plus a multipart file upload in a single form
by Steve Saporta
Dec 19 2013

This example builds on my [updated MVC "hello world" example](https://github.com/sasaporta/springmvcshell). Here we see how to use a single form to:
- Read and write fields from two separate classes
- Include a file upload control using Spring's MultipartFile interface

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
- You should see a form that prompt for some fields from the Student model, some fields from the Employee model, and a file to upload.
- When you submit the form, you should see the Student and Employee values you entered, as well as the name and size of the uploaded file.