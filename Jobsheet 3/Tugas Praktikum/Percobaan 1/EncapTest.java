public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");

        encap.setAge(35);
        System.out.println("age (input 35) : " + encap.getAge());

        encap.setAge(12);
        System.out.println("age (input 12) : " + encap.getAge());
    }
}
