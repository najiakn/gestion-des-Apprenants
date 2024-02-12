
//import classe Scanner
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        admin Admin = new admin();
        Scanner scan = new Scanner(System.in) ;
        
        int choix ;
        while(true){
             System.out.println("=====Application Enaa Management=====");
             System.out.println("1. Gestion Des Apprenants");
             System.out.println("2. Gestion Des Classes");
             System.out.println("3. Quitter");
             System.out.print("Entrer votre choix: ");
             
             if (scan.hasNextInt()){
                 choix= scan.nextInt();
                 switch (choix) {
                   case 1:
                         Admin.gestionApprenants();
                   break;
                   case 2:
                         Admin.gestionClasses();
                   break;
                   case 3:
                       System.out.println("Programme terminé.");
                       scan.close();
                       System.exit(0);
                       break;
                   default:
                       System.out.println("Choix invalide  réessayer.");
             }
             }else {
                System.out.println("entrer une nombre.");
                scan.next();
             }
              
         }
 
     }
 }


