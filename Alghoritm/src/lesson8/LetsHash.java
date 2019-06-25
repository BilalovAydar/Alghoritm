package lesson8;

public class LetsHash {
    public static void main(String[] args) {
        Hash hash = new Hash();
        for (int i = 0; i < 10; i++) {
            hash.insert(new Link(i + 20));
        }

        hash.display();
        System.out.println(hash.findData(28).getKey());
    }
}
