
public class App {
    public static void main(String[] args) {

        MyColor myCol = MyColor.Black;
        MyColor mycol2 = MyColor.Black;

        if (myCol == mycol2) {
            System.out.println("Same");
            System.out.println(myCol.getName() + " " + myCol.getCodeHexa());
        }

        for (MyColor c : MyColor.values()) {
            System.out.println(c);
        }

    }
}