public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Florin");
        Person p2 = new Person("Florin");

        System.out.println(p1.getName()==p2.getName());
    }
}