import java.util.Scanner;
public class Average {
    public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);
    double x, y, average;

    System.out.println("write  one valor");
    x = sc.nextDouble();
    System.out.println("White other valor");
    y = sc.nextDouble();
    average = (x + y) / 2.0;
    System.out.println("The average is:" + average);
    sc.close();
    }
}
