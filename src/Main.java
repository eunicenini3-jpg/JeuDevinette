import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // nombre aléatoire entre 1 et 100
        int randomNumber = (int)(Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        //Saisie du nombre de l'utilisateur
        for(int i = 0; i < 10; i++){
            System.out.print("Saisissez un nombre entier svp : ");
            int nombreUtilisateur = scanner.nextInt();

            // comparaison et affichage des résultats
            if(randomNumber == nombreUtilisateur){
                System.out.println("Bravoooooo! vous avez gagné");
                break;

            } else if(randomNumber > nombreUtilisateur){
                System.out.println("Nombre proposé plus petit");

            } else{
                System.out.println("Nombre proposé plus grand");
            }
            if(i == 9){
                System.out.println("Désolée, vous avez perdu!");
            }
        }
        scanner.close();
    }
}
