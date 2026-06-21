import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        int n;
        float c=0;
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter  Index");
        index=sc.nextInt();
        System.out.println("Enter  N");
        n=sc.nextInt();
        try{
            System.out.println("Result : "+c);
        }

        catch (ArithmeticException e) {
            System.out.println("Divided by ZERO issue.......!!!!!!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Issue");}

        }
    }

