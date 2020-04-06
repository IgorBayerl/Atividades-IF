import java.util.*;

public class Programa9 {

	public static void main(String[] args) {

		double c = 0;
		double f;
		System.out.println("Centigrados | Farenheit");
		for (double x = 0; x<41; x++) {
			f = ( 9 * c + 160 ) / 5;
			System.out.println("|    "+ c +"    |   " + f+"    | ");
			c++;
			
		}
	}

}