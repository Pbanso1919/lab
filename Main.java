import java.util.Scanner;
class Number{
    public static void main(String[] args) {
        Scanner in = new
                Scanner(System.in);
        System.out.println("Input a number:");
        int n = in.nextInt();
        if(n>0)
        {
            System.out.println("Number is positive");
        }
        else if(n<0)
        {
            System.out.println("NUmber is negative");
        }else
        {
            System.out.println("Number is zero");
        }
    }
}