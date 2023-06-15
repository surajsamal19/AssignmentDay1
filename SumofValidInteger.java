import java.util.Scanner;
public class SumOfValidInteger{
static int count = 0;
public static void invalidIntegerCount(){
Scanner input = new Scanner(System.in);
try{
System.out.println("Enter your first integer value");
int a = input.nextInt();
System.out.println("Eneterv your second integer value");
int b = input.nextInt();
System.out.println("Enter your sum of integer");
int sum = a+b ;
}
catch(Exception e){
count++;
System.out.println("Invalid Input try again");

}
}
 
public static void main(String args[]){
invalidIntegerCount();
System.out.println("Invalid Integer count" +count);
}
}
