package pxu.edu.vn.bangve;

	public class app {
		    public static void main(String[] args) {
		        LoginView view = new LoginView();
		        LoginController control = new LoginController(view);
		        // goi ham login
		        control.login();
		    }
	}
