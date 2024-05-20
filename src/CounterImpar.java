import java.util.Scanner;

public class CounterImpar {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the amount of numbers needed: cate numere vrei gen din nou XD: ");
            int limit = scanner.nextInt();
            int counter = 0;

            System.out.println(ImparSearcher(limit, counter));

        }
        public static int ImparSearcher(int limit, int counter){
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < limit; i++){
                int number = scanner.nextInt();
                if(number % 2 == 1 ){
                    counter = counter + i;
                }
            }
            return counter;
        }
}
