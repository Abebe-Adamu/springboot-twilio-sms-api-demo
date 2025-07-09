#A simple REST API built with Spring Boot and Java to send SMS messages using Twilio.

Tech Stack:

Java 17,Spring Boot, Maven, Twilio, Java SDK

Setup Instructions:

Clone the repository:


Open src/main/resources/application.properties and update the Twilio credentials:
twilio.account.sid=YOUR_SID
twilio.auth.token=YOUR_AUTH_TOKEN
twilio.phone.number=+1234567890

Run the application:
./mvnw spring-boot:run

Send SMS Endpoint:

Method: POST
URL: http://localhost:8080/api/sms/send
Content-Type: application/json

Example Request Body:
{
"to": "+1234567890",
"message": "Hello from Spring Boot!"
}


Notes:
For Twilio trial accounts, you can only send SMS to verified phone numbers.
Always collect user consent (opt-in) before sending messages.
