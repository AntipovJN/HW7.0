public class App {
    public static void main(String[] args) {
        Pair pair = Pair.of(123, "hello");
        Pair pair2 = Pair.of(123, "hello");

        System.out.println(pair.equals(pair2));
        System.out.println(pair.hashCode() == pair2.hashCode());

        Storage<Integer, String> storage = new Storage<>();
        storage.put(1, "first line");
        storage.put(2, "second line");
        storage.put(3, "first line");
        storage.put(4, "second line");
        storage.put(5, "first line");
        storage.put(6, "second line");
        storage.put(7, "first line");
        storage.put(8, "second line");
        storage.put(9, "first line");
        storage.put(10, "new line");
        System.out.println(storage.getLength() + " - storage length");
        storage.put(11, "array was increased");
        System.out.println(storage.getValue(11));
        System.out.println(storage.getLength() + " - storage capacity");

    }
}
