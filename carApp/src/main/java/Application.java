public class Application {
    public static void main(final String[] args) {
        final String modele = "Sedan";
        final String couleur = "Sedan";
        Voiture maVoiture = new Voiture(modele, couleur);

        final int ageConducteur = 20;
        final String john = "John";
        Conducteur moi = new Conducteur(john, ageConducteur);

        moi.demarrerVoiture(maVoiture);
        maVoiture.accelerer();
        final int vitesse = 80;
        moi.changerVitesse(maVoiture, vitesse);
        maVoiture.ralentir();
        final int nouvelleVitesse = 30;
        moi.changerVitesse(maVoiture, nouvelleVitesse);
        moi.arreterVoiture(maVoiture);
        System.out.println("fini");
    }
}
