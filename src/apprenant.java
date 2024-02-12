import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class apprenant {
    
    public  static void main(String args[]){
    System.out.print("heeey Apprenant");
    }
    String nomApprenant;
    String prenomApprenant;
    String dateNaissance;
    String adresseApprenant;
    String numeroTele;
    int numClasseApprenant;
    int getNumClasseApprenant(){
        return numClasseApprenant;
    }
    //-----------------------------
    String getDateNaissance(){
        return dateNaissance;
    }

    void setDateNsetaissance(String daten){
        dateNaissance=daten;
    }
//-------------------------------------------
    String getNomApprenant(){
        return nomApprenant;
    }

    void setNomApprenant(String nomApp){
       nomApprenant=nomApp;
    }
//-----------------------------------------
void setPrenomApprenant(String prenomApp){
    prenomApprenant=prenomApp;
}

String getPrenomApprenant(){
    return prenomApprenant;
}
//--------------------------------------------
String getAdresseApprenant(){
    return adresseApprenant;
}

void setAdresseApprenant(String adresseApp){
    adresseApprenant=adresseApp;
}
//-------------------------------------------------
String getNumeroTele(){
    return numeroTele;
}

void setnumeroTele(String teleApp){
    numeroTele=teleApp;
}
//---------------------------------------------------
void setNumlCasseApprenant(int numClasseApp){
    numClasseApprenant=numClasseApp;
}

static String tapez(){ 
    Scanner scan1 = new Scanner(System.in) ; 
    return scan1.nextLine();
   
    
} 
 
public void saisirApprenant() { 
    String nom,prenom,adress,tele,date;
    int num;
    System.out.println(":::::Informations de l'apprenant :::::"); 
    System.out.println("Nom :");
    nom=tapez();
    setNomApprenant(nom);
    System.out.println("prenom :"); 
    prenom=tapez();
    setPrenomApprenant(prenom);
    System.out.println("telephone :"); 
    tele=tapez();


    while (!tele.matches("(\\+212|0(6|7))([ \\-_/]*)(\\d[ \\-_/]*){8}")) {
        System.out.println("Invalid phone number format");
        tele = tapez();
        }
        setnumeroTele(tele);
        System.out.println("Adresse :"); 
        adress=tapez();
        setAdresseApprenant(adress);
        System.out.println("Date de naissance : yyyy-mm-dd"); 
            date=tapez();
            String[] tab = date.split("-");
            LocalDate birthDate = LocalDate.of(Integer.parseInt(tab[0]), Integer.parseInt(tab[1]), Integer.parseInt(tab[2]));
            if (birthDate.isAfter(LocalDate.now().minusYears(18))){
                while (tab.length != 3 || 
                     ((Integer.parseInt(tab[0]) > 2006) || 
                    (Integer.parseInt(tab[1]) < 1 || Integer.parseInt(tab[1]) > 12) ||
                    (Integer.parseInt(tab[2]) < 1 || Integer.parseInt(tab[2]) > 31))) {
                            System.out.println("Invalid date of birth format or year must be 2006 or later.");
                            date = tapez();
                            tab = date.split("-");
                        }
                    }
                    setDateNsetaissance(date);
                    
                    System.out.println("Numero de classe :"); 
                    num=Integer.parseInt(tapez());
                    setNumlCasseApprenant(num);
                    
                    }
                    
            
                    @Override
                    public String toString(){
                         String methodeAfficher;
                         methodeAfficher= "Nom de l'apprenant est :"+nomApprenant+"\n"+
                             "prenom de l'apprenant est :"+prenomApprenant+"\n"+
                              "numero de tele de l'apprenant est :"+numeroTele+"\n"+
                              "Adresse de l'apprenant est :"+adresseApprenant+"\n"+
                              "Date de naissance de l'apprenant est :"+dateNaissance+"\n"+
                              "N classe de l'apprenant est:"+numClasseApprenant+"\n" ;
                         return methodeAfficher;
                    }
                    public void ajouterApprenant(ArrayList<apprenant> apprenantList){
                        apprenantList.add(this);
                        System.out.println("add avec success");
                    }
                    public void afficherApprenant(ArrayList<apprenant> apprenantList){
                        int size= apprenantList.size();
                        System.out.println("**********************************************************************");
                        for (int i =0; i<size ; i++){
                        System.out.println(apprenantList.get(i).toString());
                        System.out.println("----------------------------------------------------------------------");
                        }
                        System.out.println("**********************************************************************");
                    }
                    public void modifierApprenant(ArrayList<apprenant> apprenantList){
                        String nom;
                        String prenom;
                        int size= apprenantList.size();
                        System.out.println("Entrer le nom  que vous modifier");
                        nom = tapez();
                        System.out.println("Entrer le prenom  que vous modifier");
                        prenom = tapez();
                        int existe =0;
                        for (int i =0; i<size ; i++){
                            if (apprenantList.get(i).getNomApprenant().equals(nom) && apprenantList.get(i).getPrenomApprenant().equals(prenom)){
                                apprenantList.get(i).saisirApprenant();
                                existe = 1;
                                break;
                            }
                        }
                        
                        if (existe == 1) {
                        System.out.println("Modifier avec success.\n");
                        } else {
                        System.out.println("L'apprenant n'existe pas \n");
                        }
                    }
                    public void supprimerApprenant(ArrayList<apprenant> apprenantList){
                        String nom;
                        String prenom;
                        int size= apprenantList.size();
                        System.out.println("Entrer le nom  que vous supprimer");
                        nom = tapez();
                        System.out.println("Entrer le prenom  que vous supprimer");
                        prenom = tapez();
                        int existe =0;
                        for (int i =0; i<size ; i++){
                            if (apprenantList.get(i).getNomApprenant().equals(nom) && apprenantList.get(i).getPrenomApprenant().equals(prenom)){
                                apprenantList.remove(i);
                                existe = 1;
                                break;
                            }
                        }
                        
                        if (existe == 1) {
                        System.out.println("supprimer  avec success.\n");
                        } else {
                        System.out.println("L'apprenant n'existe pas \n");
                        }
                    }
                    public int rechercheApprenant (ArrayList<apprenant> apprenantList){
        
                        int m = apprenantList.size();
                        for (int i = 1; i < m ; i++) {
                            apprenant temp = apprenantList.get(i);
                        int j = i - 1;
                            while (j >= 0 && apprenantList.get(j).getNomApprenant().compareTo(temp.getNomApprenant()) > 0) {
                                apprenantList.set(j + 1, apprenantList.get(j));
                                j--;
                            }
                            apprenantList.set(j + 1, temp);
                        }
                        
                        System.out.print("Enter le nom  recherche : ");
                        String nomRecherche = tapez();
                        System.out.print("Enter le prenom a recherche : ");
                        String prenomRecherche = tapez();
                        int l = 0;
                        int r = apprenantList.size()-1;
                        int mil;
                        
                            while (l <= r){
                                mil = (l+r)/2;
                                String milnom     = apprenantList.get(mil).getNomApprenant();
                                String milprenom  = apprenantList.get(mil).getPrenomApprenant();
                                
                                if(milnom.equals(nomRecherche) && milprenom.equals(prenomRecherche)){
                                  return mil;
                                } 
                                if (milnom.compareTo(nomRecherche) < 0 ||
                                   (milnom.equals(nomRecherche) && milprenom.compareTo(prenomRecherche) < 0)){
                                  l = mil + 1;
                                }else {
                                  r = mil - 1;
                                }
                                
                            }
                            return -1;
                    }
                    
                    
                       
    }
        

