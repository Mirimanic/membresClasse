public class Compteur
{   
    /*-- start  Constructor --*/
    public Compteur()
    {
        nbObjet_cree_Dernier++;
        System.out.println("Objet cree n : " + nbObjet_cree_Dernier);
        nbObjet_Actuel = nbObjet_cree_Dernier;
    }
    /*-- End  Constructor --*/

    public int getId() {     return nbObjet_Actuel;    }
 
    public static int getIdMax() {      return nbObjet_cree_Dernier;   }

    private static int nbObjet_cree_Dernier = 0;
    private int nbObjet_Actuel;
}