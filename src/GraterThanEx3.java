import java.util.Scanner;

public class GraterThanEx3 {
    //scrieti o functie care primeste un sir de numere intregi si un alt numar intreg. Returnati toate numerele mai mari decat numarul primit
    public static void main(String[] args) {
        System.out.println("Adauga limita de numere ");
        int[] sir = {1, 5, 8, 12, 3, 7, 9};
        System.out.println("Introdu un numar pivot: ");

        Scanner scanner = new Scanner(System.in);
        int pivot = scanner.nextInt();
        System.out.println(grater(pivot, sir));
    }

    public static int grater(int pivot, int[] sir) {
        for (int number : sir) {
            if (number > pivot) {
                return number;
            }
        }
        return 0;
    }
}
