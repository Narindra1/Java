public class Main
 {
    public static void main(String[] args) 
    {
        
        Carree carre = new Carree(5);
        System.out.println("Carree:");
        System.out.println("Surface: " + carre.surface());
        System.out.println("Périmètre: " + carre.perimetre());
        carre.dessiner();

        
        Cercle cercle = new Cercle(4);
        System.out.println("\nCercle:");
        System.out.println("Surface: " + cercle.surface());
        System.out.println("Périmètre: " + cercle.perimetre());
        cercle.dessiner();
    }
}
