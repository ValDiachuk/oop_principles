package access_modifiers.package2;

import access_modifiers.package1.BMW;
import access_modifiers.package1.Honda;
import access_modifiers.package1.Toyota;

public class TestPackage2 {

    public static void main(String[] args) {
        Honda h1 = new Honda();

        // Tesla t1  = new Tesla(); cannot be accessed asit is default class

        BMW b1 = new BMW();


    }
}
