class Cercle extends Form2D implements IAction{
    private double rayon;

    
    public Cercle(double rayon) {
        this.rayon = rayon;
    }
	 public double surface() {
        return Math.PI * rayon * rayon;
    }

    public double perimetre() {
        return 2 * Math.PI * rayon;
    }
    public void dessiner()
    {

		System.out.println("Dessiner un cercle de rayon: " + rayon);
	}
}
