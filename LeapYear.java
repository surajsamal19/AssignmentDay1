import java.util.Scanner;
public class LeapYear{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("Eneter your year");
int year = input.nextInt();
if(year%4 == 0)
System.out.println("Year is a leap Year");
else if(year%100 == 0)
System.out.println("Year is not a leap year");
else if(year%400 == 0)
System.out.println("Year is a leap year");

}
}
