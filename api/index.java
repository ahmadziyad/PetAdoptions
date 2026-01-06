package api;

import com.vercel.java.RequestHandler;
import com.vercel.java.RequestInfo;
import com.vercel.java.ResponseInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Index implements RequestHandler {
    private static ConfigurableApplicationContext context;
    private static DispatcherServlet dispatcherServlet;
    
    static {
        // Initialize Spring Boot application context
        System.setProperty("server.servlet.context-path", "/api");
        context = SpringApplication.run(com.example.adoptions.AdoptionsApplication.class);
        WebApplicationContext webContext = (WebApplicationContext) context;
        dispatcherServlet = new DispatcherServlet(webContext);
    }

    @Override
    public void handleRequest(RequestInfo requestInfo, ResponseInfo responseInfo) throws IOException {
        try {
            HttpServletRequest request = requestInfo.getRequest();
            HttpServletResponse response = responseInfo.getResponse();
            
            dispatcherServlet.service(request, response);
        } catch (Exception e) {
            responseInfo.getResponse().setStatus(500);
            responseInfo.getResponse().getWriter().write("Internal Server Error: " + e.getMessage());
        }
    }
}