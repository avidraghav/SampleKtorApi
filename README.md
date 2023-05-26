# SampleKtorApi
To deploy the project/api follow the below given steps:
1. Clone the repository in your local machine and open the project in any recent version of IntelliJ Idea.
2. Currently two ports are defined. 8080 - HTTP Port and 8443 - HTTPS Port. You don't need to change them unless any application is already running in these ports in your local machine.
3. Click on the Run button in the IDE and the api will be deployed on above defined ports in your local machine.

Note -  The HTTPS port is just for demonstration purposes on how to deploy an SSL port with KTOR, you won't be actually using it to get the response on the android app
as the SSL certificate used will not match any certificate in your Physical device's Certificate Authority.

To use the deployed api in an Android app which is installed on a physical device:

To set the Base Url if you are using a Mac:
1. Open the terminal and type `ipconfig getifaddr en0` then press enter to get the IP address of your local machine. Copy this address.
2. In your android app where you will be mentioning the BASE_URL for making api request paste the above obtained IP address along with the HTTP Port
in the following format `http://IP_ADDRESS:HTTP_PORT`
3. For example if you the IP address is `192.128.1.23` and the HTTP port where the api is hosted is
`8080` then your BASE_URL will be `http://192.128.1.23:8080`
4. If you want to use the HTTPS port then use the format `https://IP_ADDRESS:HTTP_PORT`

To set the base URL if you are using a Windows machine:
1. Open the terminal and type `ipconfig` then press enter to get the IP address of your local machine. Copy this address.
2. In your android app where you will be mentioning the BASE_URL for making api request paste the above obtained IP address along with the HTTP Port
in the following format `http://IP_ADDRESS:HTTP_PORT`
3. For example if you the IP address is `192.128.1.23` and the HTTP port where the api is hosted is
`8080` then your BASE_URL will be `http://192.128.1.23:8080`
4. If you want to use the HTTPS port then use the format `https://IP_ADDRESS:HTTP_PORT`

Currently there is only one endpoint defined called `demo_response`. So the complete url for the HTTP network request will look like
`http://192.168.1.23:8080/demo_response`
