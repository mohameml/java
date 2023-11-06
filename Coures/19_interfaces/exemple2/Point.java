

// Et voici une version (partielle...) de la classe Point qui réalise l'interface Deplacable
public class Point implements Deplacable {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // Puisque la classe Figure réalise l'interface Deplacable
    // il faut que toutes les méthodes déclarée dans l'interface
    // soit implémentées par la classe
    @Override
    public double getX() {
        return this.x;
    }
    @Override
    public double getY() {
        return this.y;
    }
    @Override
    public void positionner(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void translater(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    // on peut bien sûr munir la classe d'autres méthodes que celles déclarées dans l'interface :
    void symetrieOrigine() {
        x = -x;
        y = -y;
    }

    @Override
    public toString() {
        return "Point (" + x + ", " + y + ")";
    }
}
