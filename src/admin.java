
import java.util.ArrayList;
import java.util.Scanner;
public class admin {
    
   public ArrayList<apprenant> apprenantList ; 
   public ArrayList<classe> classeList ;
   
   public admin() {
        this.apprenantList = new ArrayList<>();
        this.classeList = new ArrayList<>();
    }
   

// une fonction qui contient une le menu de gére les apprenants   
   
   
   public void gestionApprenants(){
       
       
       Scanner scan = new Scanner(System.in) ;
       int choice ;
       while(true){
            System.out.println("=====Application Enaa Management=====");
            System.out.println("1. Ajouter un  Apprenant ");
            System.out.println("2. Afficher des Apprenants ");
            System.out.println("3. Modifier un  Apprenant ");
            System.out.println("4. Supprimer un  Apprenant ");
            System.out.println("5. Rechercher un  Apprenant ");
            System.out.println("6. Quitter");
            System.out.print("Entrer votre choix: ");

            apprenant apprenant = new apprenant();
            if(scan.hasNextInt()){
                choice= scan.nextInt();
                    switch (choice) {
                    case 1:
                              apprenant.saisirApprenant();
                              apprenant.ajouterApprenant(apprenantList);
                              break;
                    case 2:
                              apprenant.afficherApprenant(apprenantList);
                              break;
                    case 3:
                              apprenant.modifierApprenant(apprenantList);
                              break;
                    case 4:
                              apprenant.supprimerApprenant(apprenantList);
                              break;
                    case 5:
                              int res = apprenant.rechercheApprenant(apprenantList);
                              if (res == -1){
                                System.out.println("Apprenant ne se trouve pas  ");
                              }else{
                                System.out.println("Apprenant se trouve a :"+res);
                                System.out.println(apprenantList.get(res));
                              }
                              break;
                    case 6:
                            System.out.println("back to menu");
                            return;
                    default:
                            System.out.println("Choix invalide  réessayer.");
                    }
            }else{
                    System.out.println("entrer une nombre.");
                    scan.next();
            }
             
        }

    }
    
    // une fonction qui contient une le menu de gere les classes
    
    
     public void gestionClasses(){
        
       Scanner cl = new Scanner(System.in) ;
       int choice ;
       while(true){
            System.out.println("=====Application Enaa Management=====");
            System.out.println("1. Ajouter un  Classe ");
            System.out.println("2. Afficher les Classes ");
            System.out.println("3. Modifier un  Classe ");
            System.out.println("4. Supprimer un  Classe ");
            System.out.println("5. Afficher les apprenant par Classe ");
            System.out.println("6. Quitter");
            System.out.print("Entrer votre choix: ");
            
            classe classe = new classe ();
            if (cl.hasNextInt()){
                choice= cl.nextInt();
               switch (choice) {
                case 1:
                        classe.saisirClasse();
                        classe.ajouterClass(classeList);
                          break;
                case 2:
                        classe.afficherClass(classeList);
                          break;
                case 3:
                        classe.modifierClass(classeList);
                          break;
                case 4:
                        classe.supprimerClass(classeList);
                          break;
                case 5: 
                    classe.afficherApprenantsParClasse(apprenantList);
                    break;
                case 6:
                    System.out.println("back to menu");    
                    return;
                default:
                        System.out.println("Choix invalide  réessayer.");
            }
            }else{
               System.out.println("entrer une nombre.");
               cl.next();
            }
            
             
        }

    }
    
}
