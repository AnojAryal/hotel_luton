package MainApplication;

import Frontend.Dashboard;
public class MainApplication {
public static void main (String[] args) {
	try {
		Dashboard window =new Dashboard();
		window.setVisible(true);
	}catch (Exception e) {
		e.printStackTrace();
	}
}
 }