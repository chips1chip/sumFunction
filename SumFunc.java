import java.util.Scanner;
public class SumFunc{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int sum=add(num1, num2);
System.out.println("the sum is "+ sum);
sc.close();
}
public static int add(int num1, int num2){
return num1+num2;
}
}