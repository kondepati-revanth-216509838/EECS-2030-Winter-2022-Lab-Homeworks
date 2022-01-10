import java.util.Scanner;
public class LoginCredentials {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String login = "smithj09";
		String password = "JohnsCookie1996";
		
		System.out.print("Login:");
		String givenLogin = input.nextLine();

		System.out.print("Password:"); 
		String givenPassword = input.nextLine();
		
		if (login.equals(givenLogin) && password.equals(givenPassword)) {
			System.out.println("Welcome!");
		} else {
			System.out.println("Access Denied");
		}
	}

}
