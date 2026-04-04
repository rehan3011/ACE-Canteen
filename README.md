# ACE-Canteen
ACE Canteen is small dynamic web page that provides a order for free if the time taken by the order is more than 5 mins

**Features of the WEB PORTEL**

1. Maintains a Session per User.
2. As soon as the button 'HOME' is pressed the Session end servlet triggers and it invalidate the session and redirects the user to the first page.

**THIS IS THE WELCOME PAGE**
<img width="2559" height="1267" alt="Screenshot 2026-04-04 130742" src="https://github.com/user-attachments/assets/d542e2d9-7981-45d6-b193-a269469c52e8" />
**THIS IS  THE SERVLET THAT CALCULATES THE LOGIC**
   <img width="2559" height="1289" alt="Screenshot 2026-04-04 130806" src="https://github.com/user-attachments/assets/ba93cfa5-ba55-46b8-9d75-f8238d0c6b01" />
**IF THE ORDER TAKES MORE THAN 5 MINS IT WILL SHOW THE "FREE SAMOSA BLOCK OF HTML" INSIDE THE SERVLET**
<img width="2559" height="1290" alt="Screenshot 2026-04-04 131221" src="https://github.com/user-attachments/assets/95eb66c5-54bc-43bc-ab17-3a900ced68ba" />

if we click the "BACK HOME" button the request is taken by the SessionEndServlet and invalidate the session and redirects to the welcome page :)
