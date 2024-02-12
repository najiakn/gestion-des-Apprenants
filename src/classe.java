
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class classe {
   int numClasse;
   String nomClasse;
   int effictif;

        public int getNumClasse() {
            return numClasse;
        }

        public String getNomClasse() {
            return nomClasse;
        }

        public int getEffictif() {
            return effictif;
        }

        public void setNumClasse(int numClasse) {
            this.numClasse = numClasse;
        }

        public void setNomClasse(String nomClasse) {
            this.nomClasse = nomClasse;
        }

        public void setEffictif(int effictif) {
            this.effictif = effictif;
        }
        
        static String tapez(){ 
            Scanner scan = new Scanner(System.in) ; 
            return scan.nextLine();
        }
        
        public void saisirClasse() {
            int num;
            String nom;
            int eff;
            System.out.println(":::::Informations de la classe :::::");
            System.out.println("Numero de classe :");
            num = Integer.parseInt(tapez());
            setNumClasse(num);
            System.out.println("Nom de la classe :");
            nom = tapez();
            setNomClasse(nom);
            System.out.println("Effectif de la classe :");
            eff = Integer.parseInt(tapez());
            setEffictif(eff);
        }
        
   @Override
        public String toString() {
        String methodeAfficher;
        methodeAfficher = "Numero de classe :" + numClasse + "\n" +
             "Nom de la classe :" + nomClasse + "\n" +
             "Effectif de la classe :" + effictif + "\n";
        return methodeAfficher;
        }
        
       public void ajouterClass(ArrayList<classe> scan){
            scan.add(this);
            System.out.println("Classe ajouter avec success");
        }
       
       public void afficherClass(ArrayList<classe> scan){
            int size= scan.size();
            System.out.println("**********************************************************************");
            for (int i =0; i<size ; i++){
            System.out.println(scan.get(i).toString());
            System.out.println("----------------------------------------------------------------------");
            }
            System.out.println("**********************************************************************");
        }
       
        public void modifierClass(ArrayList<classe> scan){
            int numeroRechercher;
            int size= scan.size();
            System.out.println("Entrer le n° classe que vous modifier");
            numeroRechercher = Integer.parseInt(tapez());
            int existe =0;
            for (int i =0; i<size ; i++){
                if (scan.get(i).getNumClasse() == numeroRechercher){
                    scan.get(i).saisirClasse();
                    existe = 1;
                    break;
                }
            }

            if (existe == 1) {
            System.out.println("Modifier avec success.\n");
            } else {
            System.out.println("La classe n'existe pas \n");
            }
        }
        
        public void supprimerClass(ArrayList<classe> classeList){
            int numeroSupprimer;
            int size= classeList.size();
            System.out.println("Entrer le n° classe que vous supprimer");
            numeroSupprimer = Integer.parseInt(tapez());
            int existe =0;
            for (int i =0; i<size ; i++){
                if (classeList.get(i).getNumClasse() == numeroSupprimer){
                    classeList.remove(i);
                    existe = 1;
                    break;
                }
            }

            if (existe == 1) {
            System.out.println("supprimer avec success.\n");
            } else {
            System.out.println("La classe n'existe pas \n");
            }
        }
        
        
        public void afficherApprenantsParClasse(ArrayList<apprenant> apprenantList){
           int existe = 0;
           int size= apprenantList.size();
           
           System.out.println("Entrez le numéro de la classe pour afficher les apprenants : ");
           int numeroClasse = Integer.parseInt(tapez());
           
           System.out.println("Apprenants de la classe " + numeroClasse + " est :");
                for (int i =0; i<size; i++){
                     if (apprenantList.get(i).getNumClasseApprenant() == numeroClasse){
                         System.out.println(apprenantList.get(i).toString());
                         existe = 1;
                     }
                 }
           
           if(existe != 1)
             System.out.println("Aucun apprenant trouvé pour cette classe " );
           
        }
        

    
}