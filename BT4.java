package Buoi5;

public class BT4 {
    public static void main(String[] args) {
        String sample = "vietnam";
        for (int i = 0; i <sample.length() ; i++) {
            if(sample.charAt(0) == sample.charAt(i)){
                String str = Character.toString(sample.charAt(i));
                sample =  sample.replace(str, "$");
                System.out.println(sample);
            }
        }
    }
}