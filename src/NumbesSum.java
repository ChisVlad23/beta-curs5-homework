import java.util.Scanner;

public class NumbesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of numbers needed: cate numere vrei gen: ");
        int limit = scanner.nextInt();
        int sumOfNumbers = 0;

        System.out.println(Sum(limit, sumOfNumbers));

    }
    public static int Sum(int limitare, int sum){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < limitare; i++){
            int inputNumber = scanner.nextInt();
            sum = sum + inputNumber;
        }
        return sum;
    }
}
