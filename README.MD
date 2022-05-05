# Free Ledgers - Free Oauth2 Authorization Server
This server provides basic authentication service for the Free Ledger project(https://github.com/paris0120/freeledgers). 

This server must be online before any user can log in.

The default username is 'user' and password is 'password'. Both can be modified in the property file.

The username and password are used to check client server status and used by client servers to connect this registration server.

If you changed the Eureka server's settings, you need to change the eureka.client.serviceUrl.defaultZone property accordingly in the setting file.

The setting file is located in src/resources/eureka-server.yml.