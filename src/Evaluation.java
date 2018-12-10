import java.util.Scanner;
public class Evaluation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation myEquation = new QuadraticEquation(a,b,c);

        if(myEquation.getDiscriminant()>0){
            System.out.println("The Equation has two roots are" + myEquation.getRoot1() +"\t" + myEquation.getRoot2());
        }
        else  if (myEquation.getDiscriminant() == 0){
            System.out.println("The Equation has one root is " + myEquation.getRoot1());
        }
        else System.out.println("The Equation has no real root");


    }
}
