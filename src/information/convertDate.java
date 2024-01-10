package information;
import java.text.DateFormatSymbols;
import java.util.Scanner;

public class convertDate {

		public static void main(String[] args) {
			
			//Ask the user to enter a short date in the format YYYY-MM-DD....
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter shortDate as(2024-01-27):");
			String shortDate = scanner.nextLine();
			int year = Integer.parseInt(shortDate.substring(0,4));
			int month = Integer.parseInt(shortDate.substring(5,7));
			int day = Integer.parseInt(shortDate.substring(8));
			String monthName = new DateFormatSymbols().getMonths()[month - 1];
			System.out.println("Full date : " + monthName + " " + day + ", " + year);
			 scanner.close();
		}

	

}

