public class apprenant {
    
    public  static void main(String args[]){
    System.out.print("heeey Apprenant");
    }
    String nomApprenant;
    String prenomApprenant;
    //date date_naissance;
    String adresseApprenant;
    int numeroTele;
    int numClasseApprenant;
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
int getNumeroTele(){
    return numeroTele;
}

void setnumeroTele(int teleApp){
    numeroTele=teleApp;
}
//---------------------------------------------------
void numlCasseApprenant(int numClasseApp){
    numClasseApprenant=numClasseApp;
}

}
