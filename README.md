# ACE-Canteen
ACE Canteen is small dynamic web page that provides a order for free if the time taken by the order is more than 5 mins

**Features of the WEB PORTEL**

1. Maintains a Session per User.
2. As soon as the button 'HOME' is pressed the Session end servlet triggers and it invalidate the session and redirects the user to the first page.

**THIS IS THE WELCOME PAGE**

<img width="2559" height="1149" alt="Screenshot 2026-05-21 094543" src="https://github.com/user-attachments/assets/d7dc6e03-84b5-410e-9b79-83e95313fa12" />

**THIS IS  THE SERVLET THAT CALCULATES THE LOGIC**

<img width="2559" height="1141" alt="Screenshot 2026-05-21 094608" src="https://github.com/user-attachments/assets/e09efeef-ae66-46ab-a9d2-70a65a0d671c" />

   
**IF THE ORDER TAKES MORE THAN 5 MINS IT WILL SHOW THE "FREE SAMOSA BLOCK OF HTML" INSIDE THE SERVLET**

<img width="2559" height="1145" alt="Screenshot 2026-05-21 094628" src="https://github.com/user-attachments/assets/135f0dff-be1c-4e46-a30c-113ae44766fb" />

if we click the "BACK HOME" button the request is taken by the SessionEndServlet and invalidate the session and redirects to the welcome page :)
