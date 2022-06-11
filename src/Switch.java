import javax.swing.JOptionPane;

public class Switch {

	public static void main(String[] args) {
		//usar switch em vez de varios if's
		//String day = "Saturday";
		String today = JOptionPane.showInputDialog("What day is today?");
		
		//Se o utilizador utilizar letra minuscula, este metodo irá dar uppercase na primeira letra
		//substring(index start[0] e index final, neste caso [1]
		String day = today.substring(0,1).toUpperCase() + today.substring(1);
		
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
