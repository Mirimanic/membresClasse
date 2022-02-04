public class Compteur_lire_clavier {

  
    /*-- start  Constructor --*/
    public Compteur_lire_clavier()
    {
        nbObjet_LC_Actuel = nbObjet_LC_cree_Dernier;
        nbObjet_LC_cree_Dernier++;
    }
    /*-- End  Constructor --*/

     

    public int get_LC_Id() {     return nbObjet_LC_Actuel;    }
 
    public static int get_LC_IdMax() {      return nbObjet_LC_cree_Dernier-1;   }

    private static int nbObjet_LC_cree_Dernier ;
    private int nbObjet_LC_Actuel;

    static
    {   
            System.out.println("Veuillez rentrer le numero inital des objet : ");
            do{  nbObjet_LC_cree_Dernier = Clavier.lireInt();
          }
        while(nbObjet_LC_cree_Dernier <=0);   
    }
}
    

