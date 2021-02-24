import java.util.Scanner;

public class SumOfFourPrimes {

    static int a = 0, b = 0;

    // function to check if a number
    // is prime or not
    static boolean isPrime(int x)
    {

        for (int i = 2; i <= x/2; i++)

            // if any divisor found
            // then non prime
            if (x % i == 0)
                return false;

        // if no divisor is found
        // then it is a prime
        return true;
    }

    // Function to get remaining two prime numbers
    static void SumOfTwoPrimes(int x)
    {

        // iterates to check prime
        // or not
        for (int i = 2; i <= x / 2; i++) {

            // calls function to check
            // if i and x-i is prime
            // or not
            if (isPrime(i) && isPrime(x - i)) {

                a = i;
                b = x - i;

                // if two prime numbers
                // are found, then return
                return;
            }
        }
    }

    // function to generate 4 prime
    // numbers adding up to n
    static void Generate(int n)
    {

        if (n <= 7){
            System.out.println("Impossible");
            return;
        }

        // if it is odd then 2 and 3
        // are first two of sequence
        if (n % 2 != 0) {

            // calls the function to get the
            // other two prime numbers
            // considering first two primes
            // as 2 and 3 (Note 2 + 3 = 5)
            SumOfTwoPrimes(n - 5);

            System.out.println("2 3 " + a + " " + b);
        }

        // if it is even then 2 and 2 are
        // first two of sequence
        else {

            /// calls the function to get the
            // other two prime numbers
            // considering first two primes as
            // 2 and 2 (Note 2 + 2 = 4)
            SumOfTwoPrimes(n - 4);

            System.out.println("2 2 " + a + " " + b);
        }
    }


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

       while (true){
           System.out.print("Enter the number: ");
            int n = scanner.nextInt();

            if(n == 0) return;

               Generate(n);
        }

    }
}
