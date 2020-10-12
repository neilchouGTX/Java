import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String[] monthEng = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		int[] days = {31,0,31,30,31,30,31,31,30,31,30,31};
		int month;
		int year;
		month = scanner.nextInt();
		year = scanner.nextInt();
		if(month !=2){
			System.out.println(monthEng[month-1] + " " + year + " had " + days[month-1] + " Days");
		}
		else{
			if(year%4 == 0){
				if(year%100== 0){
					if(year%400 == 0)
						System.out.println("February " + year + " had 29 Days");
					else
						System.out.println("February " + year + " had 30 Days");
				}
				else
					System.out.println("February " + year + " had 29 Days");
			}
			else
				System.out.println("February " + year + " had 30 Days");
		}
	}
}