package pxu.edu.vn.bangve;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController {
    private LoginView view;
 
    public LoginController(LoginView view) {
        this.view = view;
    }
 
    public void login() {
        while (true) {
            LoginModel user = view.getUserInfo();
            if (checkLogin(user)) {
                view.showMessage("success!");
                break;
            } else {
                view.showMessage("wrong username or password!");
            }
        }
    }
 
    private boolean checkLogin(LoginModel user) {
        if ((user.getUserName().equals("admin")) 
                && (user.getPassword().equals("admin"))) {
            return true;
        }
        return false;
    }
 
    public LoginView getView() {
        return view;
    }
 
    public void setView(LoginView view) {
        this.view = view;
    }
}
