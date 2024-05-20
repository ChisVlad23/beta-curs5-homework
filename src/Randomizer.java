//scrieti o functie care primeste un numar intreg reprezentand targetul de donatii. Donatiile se vor face cu ajutorul obiectului Random. Primim donatii pana cand ajungem la suma dorita. Cand ajungem la suma dorita afisam un mesaj de succes.
import java.util.Random;
import java.util.Scanner;

public class Randomizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu numarul de bani doriti: ");
        int target = scanner.nextInt();
        if(targetReacher(target) == true){
            System.out.println("Ai ajuns la suma dorita");
        }
        }

        public static boolean targetReacher(int target){
        int sumaCurenta = 0;
            Random random = new Random();
        while (sumaCurenta < target) {
            int randomNumber = random.nextInt(target);
            sumaCurenta = sumaCurenta + randomNumber;
            System.out.println("Un om a donat: " + randomNumber);
            randomNumber = random.nextInt(target - sumaCurenta);

        }
        if (sumaCurenta == target) {
            return true;
        }
        return false;
        }
    }
