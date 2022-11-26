package access_modifiers.package1;

public class TestPackage1 {

    public static void main(String[] args) {
        Honda h1 = new Honda();

        System.out.println(h1); // location is access_modifiers.package1.Honda@1b6d3586

        Tesla t1 =new Tesla();
        Toyota to1 = new Toyota();
        BMW b1 = new BMW();

    }
}
