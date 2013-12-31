A simple test harness I use with Spring Roo. 

Fire up the Roo shell and run: 
 script --file pre-setup.roo
 script --file domain.roo
 script --file post-setup.roo

Start the Roo web app with Maven
 mvn jetty:run
 
Then do exploratory tests in a browser. 