package at.ac.fhcampuswien;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        // input your solution here
        Scanner sc = new Scanner(System.in);
        double max = 0;

        for (int i = 1; ; i++) {
            System.out.printf("Number " + i + ": "); //format string
            double num1 = sc.nextDouble();
            if (num1 <= 0 && i == 1) {
                System.out.println("No number entered.");
                break;
            } else if (num1 <= 0) {
                System.out.println("The largest number is " + String.format("%.2f", max));
                break;
            } else if (num1 > max) {
                max = num1;
            }
        }
    }


    //todo Task 2
    public void stairs() {
        // input your solution here
        int rows, number = 1;

        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        rows = scan.nextInt();
        if (rows <= 0){
            System.out.println("Invalid number!");
        }
        for(int i =1; i <=rows; i++){
            for(int j= 1; j <= i; j++){
                System.out.print(number +" ");
                ++number;
            }
            System.out.println();
        }
    }

    //todo Task 3
    public void printPyramid() {
        // input your solution here
        int rows = 6;
        int i, space, k = 0;

        for (i = 1; i <= rows; ++i, k =0) {
            for (space = 1; space <= rows - i; ++space) {
                System.out.print(" ");
            }
            while (k != 2 * i - 1) {
                System.out.print("*");
                k++;
            }

            System.out.println();
        }
    }


    //todo Task 4
    public void printRhombus(){
        // input your solution here
        Scanner scan=new Scanner(System.in);

        System.out.print("h: ");
        int h = scan.nextInt();
        System.out.print("c: ");
        char c = scan.next().charAt(0);
        if (h % 2 == 1){
            for(int row =0; row <= h / 2; row = row +1) {
                for (int row2 = row; row2 < h / 2; row2 = row2 +1) {
                    System.out.print(" ");
                }
                for (int difference = - row; difference <= row; difference = difference +1) {
                    System.out.print((char)(c - Math.abs(difference)));
                }
                System.out.println();
            }
            for (int row = h /2; row > 0; row = row - 1){
                for (int rowForRow2 =row; rowForRow2 <= h /2; rowForRow2 = rowForRow2 +1){
                    System.out.print(" ");
                }
                for (int difference = -row + 1; difference < row; difference = difference+ 1) {
                    System.out.print((char)(c - Math.abs(difference)));
                }
                System.out.println();
            }
        } else if (h % 2 ==0) {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 5
    public void marks() {
        Scanner scanner = new Scanner(System.in);
        int mark;
        int sum = 0;
        int count = 1;
        int negative = 0;

        do{
            System.out.print("Mark " + count + ": ");
            mark = scanner.nextInt();

            if(mark >0 && mark < 6){
                sum += mark;
                count++;

                if(mark == 5){
                    negative++;
                }
            } else {
                if (mark != 0){
                    System.out.println("Invalid mark!");
                }
            }
        }while(mark != 0);
        count--;
        float average = 0;
        if (sum > 0){
            average = (float) sum/count;
        }
        System.out.println("Average: " + String.format("%2f", average));
        System.out.println("Negative marks: " + negative);
    }



        // input your solution here

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        int sum =0;
        System.out.print("n: ");
        int number = scan.nextInt();

        while(number !=1 && number != 4){
            while (number !=0 ) {
                sum += Math. pow(number % 10, 2);
                number /=10;
            }
            number = sum;
            sum = 0;
        }
        if (number == 1) {
            System.out.println("Happy number!");
        } else{
            System.out.println( "Sad number!");
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}