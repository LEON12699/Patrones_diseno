package designpatterns.chainResponsibility;


import java.util.HashMap;
import java.util.Map;

public class Server {

    private final Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean login(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("Authorization has been succesful");
            return true;
        }
        return false;
    }

    public void register(String email,String password){
        users.put(email, password);
    }


    public boolean hasEmail(String email){
        return users.containsKey(email);
                
    }
    
    public boolean isValid(String email,String password){
        return users.get(email).equals(password);
                
    }
}
