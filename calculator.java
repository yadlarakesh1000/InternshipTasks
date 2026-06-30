
import java.util.Scanner;
public class calculator{
  public void add(int a,int b){
    int sum =a+b;
     System.out.println("Sum is :"+sum);
  }
    public void add(int...a){
            int sum=0;
          for(int i=0;i<a.length;i++){
              sum+=a[i];
          }
          System.out.println("Sum is :" +sum);
    }

  public void subtract(int a,int b){
        double difference =(double) a-(double)b;
     System.out.println("Difference is :" + difference);
  }
    public void subtract(int...b){
            double diff=b[0];
          for(int i=1;i<b.length;i++){
              diff-=(double)b[i];
          }
          System.out.println("Difference is :" +diff);
    }
    public void multiplication(int a, int b) {
    double product = (double) a * (double) b;
    System.out.println("Product is :" + product);
}

public void multiplication( int... b) {
    double product = (double) b[0];
    for (int i = 1; i < b.length; i++) {
        product *= (double) b[i];
    }
    System.out.println("Product is :" + product);
}

public void divide(int a, int b) {
    double quotient = (double) a / (double) b;
    System.out.println("Quotient is :" + quotient);
}

public void divide( int... b) {
    double quotient = (double) b[0];
    for (int i = 1; i < b.length; i++) {
        quotient /= (double) b[i];
    }
    System.out.println("Quotient is :" + quotient);
}

 public static void main(String[] args) {


        calculator c = new calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Thank You!");
                break;
            }

            sc.nextLine();

            System.out.print("Enter numbers separated by space: ");
            String input = sc.nextLine();

            String[] str = input.split(" ");
            int[] arr = new int[str.length];

            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            switch (choice) {
                case 1:
                    c.add(arr);
                    break;

                case 2:
                    c.subtract(arr);
                    break;

                case 3:
                    c.multiplication(arr);
                    break;

                case 4:
                    c.divide(arr);
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }

        sc.close();
    }
}