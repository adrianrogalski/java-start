package typy_generyczne;

public class Test {
    public static void main(String[] args) {
        Pair pair1 = new Pair(1, "abc");
        Pair pair2 = new Pair("abvd", 2.6);
        Pair pair3 = new Pair(2,4.1);


    }

    public static <T> void printPair(T obj) {
        System.out.println(obj.toString());
    }
}
