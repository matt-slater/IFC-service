# IFC-service

Updated my old [FixedCalendar](https://github.com/matt-slater/FixedCalendar) into a web service using Spring Boot. I switched this project to Spring Boot when I learned about it because Spring Boot makes it so easy to get a working REST service set up. You don't have to worry about configuring Tomcat, as it is included with Spring Boot. All of the scaffolding and boilerplate code is removed from the process. You can just focus on the business logic.

Here I moved all of my various if statements for checking the days and months to enums and my own IFCDate object. I am still using ThreeTen-Extra's InternationalFixedDate, but my controller code is more sussinct. My code is properly organized. Instead of attaching each attribute to the request, Spring encodes my IFCDate object into a JSON object and attaches it to the response automatically. Nice!

In this project, I chose not to include a front end because I wanted it to be available to anyone as a service. I plan to integrate this service into my personal website to display to my visitors.
