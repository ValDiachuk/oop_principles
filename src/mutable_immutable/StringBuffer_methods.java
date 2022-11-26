package mutable_immutable;

public class StringBuffer_methods {
    public static void main(String[] args) {


        // String Buffer is senchronized
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        sb.insert(6, "snowy ");
        System.out.println(sb);
    }
}
