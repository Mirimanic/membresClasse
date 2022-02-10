public class App {
    public static void main(String[] args) throws Exception {
        
        /*
        Compteur obj1 = new Compteur();
        Compteur obj2 = new Compteur(); 
        Compteur obj3 = new Compteur();
        System.out.println("id obj "+ obj1.getId());
        System.out.println("id obj "+ obj2.getId()); 
        System.out.println("id obj "+ obj3.getId());
        System.out.println("dernier id cree : "+Compteur.getIdMax());   
        */

        
        Compteur_lire_clavier obj1LC = new Compteur_lire_clavier();
        Compteur_lire_clavier obj2LC = new Compteur_lire_clavier(); 
        Compteur_lire_clavier obj3LC = new Compteur_lire_clavier();

        
        System.out.println("id obj "+ obj1LC.get_LC_Id());
        System.out.println("id obj "+ obj2LC.get_LC_Id()); 
        System.out.println("id obj "+ obj3LC.get_LC_Id());
        System.out.println("dernier id cree : "+Compteur_lire_clavier.get_LC_IdMax()); 
      
        
        
    }
}
