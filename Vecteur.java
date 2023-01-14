import java.util.Arrays;
//La classe matrice permet de creer des Vecteur
public class Vecteur {
    public double[] vecteur;
    

    //Vecteur(double[] elements) Constructeur avec en paramètre un tableau d'éléments de type
    //double
    public Vecteur(double[] elements){
        this.vecteur=elements;
    }

    //setElement(int index, double valeur) Permet de changer la valeur à l'index donné (commence à 0,
    //comme dans un tableau)
    public void setElement(int index, double valeur){
        double[] nouveauTab=copierTab(this.vecteur);
        nouveauTab[index]=valeur;
        this.vecteur=nouveauTab;
    }
    //dotProduct(Vecteur v) Calcule le produit scalaire avec un autre vecteur
    public double dotProduct(Vecteur v){
        double somme=0;
        if(v.vecteur.length != this.vecteur.length){
            System.err.println("Erreur dans les dimensions des vecteurs");
            return Double.NaN;
        }
        else{
            for (int i = 0; i < v.vecteur.length; i++) {
            somme+=this.vecteur[i] * v.vecteur[i];
        }
    
    }
    return somme;
}

//copierTab(double[] tab) copie le vecteur
public static double[] copierTab(double[] tab) {
    return tab.clone();
}

//getElement(int index)   Retourne la valeur à l'index demandé
public double getElement(int index){
        
        return this.vecteur[index];
    }

//afficher() Affiche le contenu du vecteur entres accolades sur la console.
    public void afficher(){
        String tableau="{";
        for(int i=0;i<this.vecteur.length;i++){
            if (i<this.vecteur.length-1){
                tableau+=this.vecteur[i]+" , ";
            }
            else{
                tableau+=this.vecteur[i]+"}";
            }
           
        }
        System.out.println(tableau);
    }




}
