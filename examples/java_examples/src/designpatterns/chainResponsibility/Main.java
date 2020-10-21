package designpatterns.chainResponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void main(String[] args) throws IOException {
        server = new Server();
        server.register("admin@example.com", "123");
        server.register("user@example.com", "1234");

        Middleware middleware = new ControlMiddleware(2);
        
            middleware.linkWith(new UserExistsMiddleware(server)).
                    linkWith(new RoleMiddleware());

        server.setMiddleware(middleware);
        
        boolean access;
        do {
            System.out.println("Enter email :");
            String email = reader.readLine();
            System.out.println("Enter your password :");
            String password = reader.readLine();
            access= server.login(email, password);
            
            
        } while (!access);
        
    }

}
