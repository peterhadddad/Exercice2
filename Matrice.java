import java.util.Arrays;

//Peter El-Hadad 20206705
//La classe matrice permet de creer des Matrice
public class Matrice{
    public int Nligne;
    public int Ncolonne;
    private double[][] tableau;
    

    
    //Constructeur pour une matrice de taille Nlignes x Mcolonnes
    //remplie de zéros
    public Matrice(int lignes, int cols){
        this.Nligne=lignes;
        this.Ncolonne=cols;
        tableau = new double[lignes][cols] ;
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < cols; j++) {
                tableau[i][j] = 0;
            }
        
        }
        
  } 


  //Additionne la valeur n dans toutes les cellules de la matrice
  //(modifie la matrice actuelle)
  public void additionnerScalaire(double n){
    for (int i = 0; i < this.Nligne; i++) {
        for (int j = 0; j < this.Ncolonne; j++) {
            tableau[i][j] +=n;
     }
   }
   
}

//Multiplie toutes les cellules par un scalaire
//(modifie la matrice actuelle)
public void multiplierScalaire(double n){
    for (int i = 0; i < this.Nligne; i++) {
        for (int j = 0; j < this.Ncolonne; j++) {
            tableau[i][j]*=n;
   }
  }
 }


 //Fait le produit matriciel entre deux matrices
 //(crée une *nouvelle matrice* de la bonne taille, ne modifie
 //pas les deux matrices originales)
public Matrice dotProduct(Matrice m){
    
    Matrice matriceMultiplier=new Matrice(this.Nligne,this.Ncolonne);
    for(int i=0; i<2; i++){
        for(int j=0; j<2; j++){ 
            matriceMultiplier.setCell(i, j, m.tableau[i][j]*tableau[i][j]);
        }
        
      }
     
      return matriceMultiplier;
    }

//Accesseur pour la cellule à une ligne/colonne donnée
 public double getCell(int ligne, int col){
     return tableau[ligne][col];
 }

 //Mutateur pour la cellule à une ligne/colonne donnée
 public void setCell(int ligne, int col, double valeur){
    tableau[ligne][col]=valeur;
 }

 //getLine(int ligne) Retourne un nouveau vecteur contenant la Nième ligne
 public Vecteur getLine(int ligne){
     Vecteur lignesMatrice= new Vecteur(tableau[ligne]);
     return lignesMatrice;
    
 }

//agrandirTab(double[] tab) Cette fonction permet d'aggrandir le tableau
 public static double[] agrandirTab(double[] tab) {

        
    double temp[]= new double[tab.length+1];
    for(int i=0;i<tab.length;i++){
         temp[i]=tab[i];
    }
    tab=temp;
    return tab;
    
}

//getColonne(int colonne) Retourne un nouveau vecteur contenant la Nième colonne
 public Vecteur getColonne(int colonne){
     double[] tableauColonne=new double [0];
     for(int i=0;i<this.Ncolonne;i++){

         //permet d'agrandir le tableau et met les valeurs de la colonne specifique
        tableauColonne=agrandirTab(tableauColonne);
        tableauColonne[tableauColonne.length-1]=tableau[i][colonne];
     }
     Vecteur ColonneMatrice= new Vecteur(tableauColonne);
     return ColonneMatrice;
 }


// afficher() Affiche la matrice sur la console, chaque ligne entre crochets [ ]
 public void afficher(){
    for(int i=0;i<this.Nligne;i++){
        String matrice="[  ";
        for(int j=0;j<this.Ncolonne;j++){
            if (j<this.Ncolonne-1){
                matrice+=tableau[i][j]+" ";
            }
            else{
                matrice+=tableau[i][j]+"  ]";
            }
        }System.out.println(matrice);
         matrice="";
    }
}

// copierTab permet de copier une matrice
public static double[][] copierTab(double[] tab) {
    return tab.clone();
}


//Matrice transposer() Retourne une version transposée de la matrice
//(sans modifier la matrice actuelle)
public Matrice transpose(){
    
    double[][]matriceCopier=new double[this.Nligne][this.Ncolonne];
    for(int i = 0; i<this.Nligne;i++){
        for(int j = 0; j<this.Ncolonne;j++){
            matriceCopier[i][j] = 0;
            for(int k = 0; k<2 ;k++){
            matriceCopier[i][j]=tableau[j][i];
            }
       }
    }   
 tableau=matriceCopier;
 Matrice matriceTransposer= new Matrice(this.Nligne,this.Ncolonne);
 return matriceTransposer;
}
        
public static Matrice identite(int n){
    Matrice identiteMatrice= new Matrice(n,n);
    return identiteMatrice;
}
}












   

    
    

