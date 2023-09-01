
public enum MyColor {
    RED("Rouge", "FF0000"),
    Green("Vert", "00FF00"),
    Black("Noir", "000000"),
    Yellow("Jaune", "01F210"),
    Blue("blue", "0000FF");

    private String name;

    public String getName() {
        return this.name;
    }

    private String codeHexa;

    public String getCodeHexa() {
        return this.codeHexa;
    }

    private MyColor(String name, String codeHexa) {
        this.name = name;
        this.codeHexa = codeHexa;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
