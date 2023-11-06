

public class Main {
    public static void main(String[] args) {
        
        OperationsGeneriques operations = new OperationsGeneriques();

        Integer maxEntier = operations.maximum(5, 10);
        System.out.println("Maximum des entiers : " + maxEntier);
        
        Double maxDouble = operations.maximum(3.5, 8.9);
        System.out.println("Maximum des doubles : " + maxDouble);
        
        String maxString = operations.maximum("abc", "xyz");
        System.out.println("Maximum des chaînes : " + maxString);
    }
}
