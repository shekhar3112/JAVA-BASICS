import java.util.Scanner;

class Pallindrom{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        int r,sum=0,temp;
        temp=n;

        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }

        if (temp==sum){
        System.out.println(temp+" is not pallindrome");
        }

        else 
        System.out.println(temp+" is not pallindrome");
    }
}