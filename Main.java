import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double height;
        double weight;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your height in meters: ");
        height = input.nextDouble();
        
        System.out.print("Please enter your body weight in kg: ");
        weight = input.nextDouble();
        
        //burada index adında bir değişken tanımlamadım çünkü daha sonra kullanmayacağım.
        System.out.println("Your body mass index is: "+ ((weight)/(height*height)));
    }
}
