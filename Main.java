import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner inputs = new Scanner(System.in);

    System.out.println("Enter First integer:");
    int num1 = inputs.nextInt();

    System.out.println("Enter Second integer:");
    int num2 = inputs.nextInt();

    System.out.println("Enter Third integer:");
    int num3 = inputs.nextInt();

    int largest;

    if (num1 > num2 && num1 > num3) {
      largest = num1;
    }

    else if (num2 > num1 && num2 > num3) {
      largest = num2;
    } else {
      largest = num3;
    }

    System.out.println("Max is: " + largest);

  }

}
