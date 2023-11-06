/**

Cette interface spécifie la notion abstraite d'objet déplaçable.
Toute classe qui implémente l'interface Deplacable
doit pouvoir retourner une position (en 2D)
et fournir des services de modification de la position 

*/
interface Deplacable {
    double getX();
    double getY();
    void positionner(double x, double y);
    void translater(double dx, double dy);
}


