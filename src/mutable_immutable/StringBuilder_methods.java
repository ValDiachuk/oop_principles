package mutable_immutable;

public class StringBuilder_methods {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Alex");
        System.out.println(sb);

        sb.append("ander");
        System.out.println(sb);

        sb.append(123);
        sb.append(true);
        sb.append(5.3);
        sb.append('$');

        System.out.println(sb);
        sb.insert(0, "xxx");

        sb = sb.reverse();

        System.out.println(sb);
    }
}
