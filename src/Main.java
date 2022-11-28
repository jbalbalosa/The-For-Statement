public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("The For Statement");
        System.out.println("");

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,2));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,3));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,4));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,5));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,6));

        for(int loop = 0; loop < 10; loop++ ){
            System.out.println("Loop " + loop + " Hello!");
        }

        //using the for statement, call the calculateInterest method with
        //the amount of 10000 with an interestRate of 1,2,3,4,5,6,7. and 8
        //and print the results to the console window.

        for (int loop = 2; loop < 9; loop++){
            System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,loop));
        }

        //How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%

        System.out.println("looping back");
        for (int loop = 8; loop > 1; loop--){
            System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,loop));
        }
        System.out.println("*****************************");
        System.out.println("");

        //Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // number of prime numbers found
        //if that count is 3 exit the for loop
        //hint: use the break; statement to exit

        int countPrimeNumber = 0;
        for (int loop=0; loop <50; loop++){
            if(isPrime(loop)){
                countPrimeNumber +=1;
                System.out.println("It is a prime number: " + loop);
                if (countPrimeNumber == 10){
                    System.out.println("Exit Loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        for (int i=2; i<= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

}