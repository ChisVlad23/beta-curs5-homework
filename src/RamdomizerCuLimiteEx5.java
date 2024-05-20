import java.util.Random;
import java.util.Scanner;

//5) rescrieti functia de la 4 cu urmatoarea modificare: functia va primi si un numar maxim de donatii. Cand acesta se termina, campania se va incheia
public class RamdomizerCuLimiteEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu numarul maxim de donatii: ");
        int target = scanner.nextInt();

        System.out.println("Vlad pentru donatii a strans: " + targetReacher(target));
    }

    public static int targetReacher(int target){
        Random random = new Random();
        int randomNumber = random.nextInt(1000);

        int currentMoneyReached = 0;
        for ( int i = 0; i < target; i++){
        currentMoneyReached = currentMoneyReached + randomNumber;
        }
        return currentMoneyReached;
    }
}