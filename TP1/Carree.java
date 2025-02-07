class Carree extends Form2D implements IAction{
    private double cote;

    
    public Carree(double cote) {
        this.cote = cote;
    }
	 public double surface() {
        return cote*cote;
    }

    public double perimetre() {
        return 4* cote;
    }
    public void dessiner()
    {

		System.out.println("Dessiner un carré de côté: " +cote);
	}
}
