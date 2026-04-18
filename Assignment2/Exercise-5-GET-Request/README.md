Exercise-5 Result:
A Spring MVC application was successfully developed to demonstrate the handling of an HTTP GET request.
A controller class was created using the @Controller annotation, and a request mapping was defined using @GetMapping("/register").
When the /register URL was accessed, the controller method returned a logical view name, which was resolved to a JSP page using the InternalResourceViewResolver.
The JSP page (register.jsp) displayed a Course Registration Form in the browser.
The application was deployed on Apache Tomcat 9.0, and the GET request was handled correctly, confirming proper controller mapping, view resolution, and server configuration.