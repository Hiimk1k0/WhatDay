import javax.swing.JOptionPane;

public class Switch {

	public static void main(String[] args) {
		//use switch instead of various if's
		//String day = "Saturday";
		String today = JOptionPane.showInputDialog("What day is today?");
		
		//if user uses Upper cases or lower cases, this method string day ... will change it to first upper and lower the rest.
		//substring(index start[0] and index final, in this case [1])
		//substring(1).lower will lower case the rest of the letters of this string
		String day = today.substring(0,1).toUpperCase() + today.substring(1).toLowerCase();
		
		switch(day) {
			case "Sunday":System.out.println("Today is Sunday");
			break;
			case "Monday":System.out.println("Today is Monday");
			break;
			case "Tuesday":System.out.println("Today is Tuesday");
			break;
			case "Wednesday":System.out.println("Today is Wednesday");
			break;
			case "Thursday":System.out.println("Today is Thursday");
			break;
			case "Friday":System.out.println("Today is Friday");
			break;
			case "Saturday":System.out.println("Today is Saturday");
			break;
			default: System.out.println(day+" isn't a day, please try again");
		}
	}

}
