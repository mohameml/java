

public class OperationsGeneriques {

    public <T> T maximum(T a, T b) {
        if (a instanceof Comparable && b instanceof Comparable) {
            Comparable<T> compA = (Comparable<T>) a;
            if (compA.compareTo(b) < 0) {
                return b;
            } else {
                return a;
            }
        }
        return null;
    }
    
}
