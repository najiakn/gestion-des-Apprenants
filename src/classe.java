public class classe {
    public static void main (String args[]){
    System.out.print("heeeeey");
}


int numClasse;
String nomClasse;
int effectif;
//setters
void setNom(String nom){
    nomClasse=nom;

}
String getNom(){
    return nomClasse;
}

int getNum(){
return numClasse;
}
void setNum(int num){
   /*  if(num<=2){
        numClasse=num;
    }
    else {
        System.out.println("desole le nombre est invalide");
    }
    */
    numClasse=num;
}
int getEffectif(){
    return effectif;
}

void setEffectif(int effec){
    effectif=effec;
}

}