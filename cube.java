import java.util.Scanner;
 class Cube{
    public static void main(String[] args) {
        Scanner s = new
                Scanner(System.in);
        System.out.println("Enter the  number:");
        int num = s.nextInt();
        int cube = num * num * num;
        System.out.println("The cube of given number is:" +cube);

    }
}