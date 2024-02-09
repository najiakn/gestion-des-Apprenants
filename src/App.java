
//import classe Scanner
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //creation objet:instanciation de class classe
        classe classe1;
        //reserver espace dans la memoire
        classe1= new classe();
        //remplir les attributs de objclasse
        classe1.nomClasse="uni";
        classe1.numClasse=1;
        classe1.effectif=25;
//----------------------------deference entre les classes est la valeur des attributs

        //creation 2 eme classe 
        classe classe2;
        classe2 = new classe();
        classe2.nomClasse="oro";
        classe2.numClasse=2;
        classe2.effectif=24;
        //---------------------------------------
        System.out.println(classe1.nomClasse);
        System.out.println(classe1.numClasse);
        System.out.println(classe1.effectif);

        System.out.println(classe2.nomClasse);
        System.out.println(classe2.numClasse);
        System.out.println(classe2.effectif);
        //-------------------------------------------------
        //modifier la valeur de nom 
        classe2.setNom("orojackson");
//afficher la valeur
        classe2.getNom();
        
        
        System.out.println(classe2.getNom());
        //scanner 
        //creation scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("entrer un nombre");
        //tapez scanner
        classe2.setNum(classe2.numClasse =scan.nextInt()); 
        //afficher scanner
        
    }
}

