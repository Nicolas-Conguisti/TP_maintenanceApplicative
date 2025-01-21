public class Voiture {
    private String modele;
    private String couleur;
    private int vitesse;

    private static final int ACCELERATION = 10;
    private static final int VITESSE_MIN = 0;
    private static final int VITESSE_MAX = 120;

    public Voiture(final String model, final  String color) {
        this.modele = model;
        this.couleur = color;
        this.vitesse = VITESSE_MIN;
    }

    public int getVitesse() {
        return this.vitesse;
    }

    public void accelerer() {

        if (vitesse + ACCELERATION <= VITESSE_MAX) {
            vitesse += ACCELERATION;
            // afficher détails
            System.out.println("Modèle : " + modele);
            System.out.println("Couleur : " + couleur);
            System.out.println("Vitesse actuelle : " + vitesse);
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void ralentir() {
        if (vitesse - ACCELERATION >= VITESSE_MIN) {
            vitesse -= ACCELERATION;
            // afficher détails
            System.out.println("Modèle : " + modele);
            System.out.println("Couleur : " + couleur);
            System.out.println("Vitesse actuelle : " + vitesse);
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
}

