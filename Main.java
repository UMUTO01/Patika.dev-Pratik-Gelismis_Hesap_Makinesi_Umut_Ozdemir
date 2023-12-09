import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int temprature = 0;
        int total = 0;
        int remiender = 0;

        System.out.println("Please enter the number that should be checked for palindrom" );

        int aragon =  scan.nextInt();

        temprature = aragon;

        while (aragon>0){

            remiender = aragon%10;

            total  = ( total *10)+ remiender;

            aragon = aragon / 10;

        }
        if(temprature == total){
            System.out.println("Palindrome sayisi");
        }
        else System.out.println("Palindrome degil");



        }

    }
