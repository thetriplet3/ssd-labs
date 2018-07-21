package mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ServletDemo extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException{


        Cookie c1 = new Cookie("c1","anything");
        Cookie c2 = new Cookie("c2","anything");


        c1.setMaxAge(60*60); //1 hour
        c2.setMaxAge(60*60); //1 hour


        //Cannot read without https
        c2.setSecure(true);
        

        //Cannot read from javascript
        response.addHeader("Set-Cookie","name=c3; HttpOnly");



        response.addCookie(c1);
        response.addCookie(c2);



    }
}
