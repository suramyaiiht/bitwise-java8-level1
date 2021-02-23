package java9.mod.modapp2;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static boolean checkPrime(int no)
	{
           /* your code to generate prime number */
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of users id to create:");
		int no=Integer.parseInt(scanner.nextLine());
		Set<UnixUser> userSet=new HashSet<UnixUser>();
/* your code to accept user details and store them in a set */
		
		Stream<UnixUser> userStream1=userSet.stream();
		Stream<UnixUser> userStream2=userSet.stream();
/* your code to filter super & ordinary user and them in list */
		int start=1000;
/* your code to assign user id to each user */
        System.out.println(String.format("%-10s %-15s %-20s %-15s","User Id","Employee Id","User Name","User Type"));
       /* code to display super user list */
    /* code to display ordinary user list */
	}
}
