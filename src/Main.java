import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // nombre aléatoire entre 1 et 100
        int randomNumber = (int)(Math.random() * 100) + 1;
       for(int i = 0; i <=10; i++){
           Scanner scanner = new Scanner(System.in);
           System.out.print("Saisissez un nombre entier svp : ");
           int nombreUtilisateur = scanner.nextInt();
           if(randomNumber < nombreUtilisateur){
               System.out.print("Nombre\n" +
                       "proposé plus grand");
           } else if (randomNumber > nombreUtilisateur) {
               System.out.print("Nombre proposé plus\n" +
                       "petit");
           } else{
               System.out.print("Bravoooooo! vous avez gagnez");
           }
           if(i == 9){
               System.out.print("Desoléééééééé, vous avez perdu!");
           }
       }
    }
}
