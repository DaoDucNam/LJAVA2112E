package Buoi5;

public class BT6 {
    public static void main(String[] args) {
        System.out.println(new BT6().add("ducnam"));
        System.out.println(new BT6().add("vietha"));
        System.out.println(new BT6().add("tuanminh"));
    }

    public String add(String str) {
        if (str.length() < 3) {
            return str;
        }
        if (str.substring(str.length() - 3).equalsIgnoreCase("ing")) {
            return str + "ly";
        }
        return str + "ing";
    }
}
