import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter two numbers: ");
        try {
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();

            int a = Math.min(num1, num2);
            int b = Math.max(num1, num2);

            System.out.println(num1 + " " + num2 + " " + CountCycle(a, b));
        }catch (Exception e){
            System.out.println("Please enter right numbers. (" + e.getMessage() + ")");
        }
    }

    public static int CountCycle(int a, int b){
        int count, max=0;
        while(a <= b){
            count = 1;
            int num = a;

            while(num != 1){
                if(num % 2 == 0){
                    num = num/2;

                }else{
                    num = 3 * num + 1;
                }
                count++;
            }
            max = Math.max(count, max);
            a++;
        }
        return max;
    }
}


