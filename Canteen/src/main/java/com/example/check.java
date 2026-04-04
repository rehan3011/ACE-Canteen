package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class check
 */
@WebServlet("/check")
public class check extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public check() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		Long orderTime= (Long) session.getAttribute("orderTime");
		long currentTime= System.currentTimeMillis()/1000;
		response.setIntHeader("Refresh", 1);
		
		
		
		if(orderTime==null) {
			session.setAttribute("orderTime", currentTime);	
			orderTime=currentTime;
		}
		Date now = new Date(orderTime*1000);
		//HTML
		
		out.print("""
		<!DOCTYPE html>
		<html lang="en">
		<head>
		    <meta charset="UTF-8">
		    <meta name="viewport" content="width=device-width, initial-scale=1.0">
		    <title>ACE Canteen</title>

		    <style>
		        * {
		            margin: 0;
		            padding: 0;
		            box-sizing: border-box;
		            font-family: Arial, sans-serif;
		        }

		        body {
		            height: 100vh;
		            display: flex;
		            justify-content: center;
		            align-items: center;
		            background: linear-gradient(135deg, #1e3c72, #2a5298);
		        }

		        .card {
		            background: #4b6aa3;
		            padding: 50px 60px;
		            border-radius: 25px;
		            text-align: center;
		            width: 500px;
		            color: white;
		            box-shadow: 0 10px 25px rgba(0,0,0,0.2);
		        }

		        .card h1 {
		            font-size: 36px;
		            margin-bottom: 20px;
		        }

		        .card p {
		            font-size: 18px;
		            margin-bottom: 30px;
		            opacity: 0.9;
		        }

		        .btn {
		            display: inline-block;
		            padding: 18px 40px;
		            background: #4CAF50;
		            color: white;
		            text-decoration: none;
		            font-size: 20px;
		            border-radius: 40px;
		            font-weight: bold;
		            transition: 0.3s;
		        }

		        .btn:hover {
		            background: #43a047;
		            transform: scale(1.05);
		        }

		        .note {
		            margin-top: 25px;
		            font-size: 16px;
		            opacity: 0.9;
		        }
		    </style>
		</head>

		<body>

		    <div class="card">
		        <h1>ACE Canteen</h1>
		         """);
		out.print("<p>Your order was Placed at: "+now+"</p>");
		
		if(orderTime!=null) {
			long diff= (currentTime-orderTime);
			
			if(diff>300) {
				out.println("<p> YOU GOT A FREE MEAL!!</p>");
					
					out.print("<a href='SessionEndServlet' class='btn'>Back Home</a>");
			}
			else {
				long remaining = 300-diff;
				out.println("<p>You have to wait "+remaining+" seconds.</p>");
			}
			
			
		}

		  out.print("""      

		        <div class="note">5 Mins or it's FREE!</div>
		    </div>

		</body>
		</html>
		""");
		
		
		
		
		
		//HTML
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
