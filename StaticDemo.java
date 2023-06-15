public class StaticDemo{
public static int staticvariable = 30;
public int instantvariable = 10;
static{
System.out.println("Static block is executed successfully");
}
public static void staticMethod(){
System.out.println("The static method is executed");
System.out.println("The static variable is" +staticvariable);
}
public void instanceMethod(){
System.out.println("The instance Method is executed");
}
public static void main(String args[]){
StaticDemo obj = new StaticDemo();
obj.instanceMethod();
staticMethod();

}
}
