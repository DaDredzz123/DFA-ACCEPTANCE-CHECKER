import java.util.Scanner;
public class LabAct1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter binary number: ");
		String input = scan.nextLine();
		
		
		int state = 0;
		
		for (char ch : input.toCharArray()) {
			if (ch == '0') {
				if (state == 0 || state == 1) {
					state =	1;
				}else if (state == 2) {
					state = 1;
				}
			}else if (ch == '1') {
				if(state == 0) {
					state = 0;
					}else if (state == 1) {
						state = 2;
					}else if (state == 2) {
						state = 0;
					}
				}else {
					System.out.println("Invalid Number! 0 and 1 are allowed.")
				   ;
					 	return;
				}
			}
			if (state == 2) 
				System.out.println("OUTPUT: ACCEPTED");
			else 
				System.out.println("OUTPUT: DENIED");
			}
				
		}

	


