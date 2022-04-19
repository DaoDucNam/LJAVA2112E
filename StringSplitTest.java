package Buoi5;


    public class StringSplitTest {
        public static void main(String args[]) {
            String s = " ;Nam; Nam1; Nam2; Nam3, Nam4; Nam5;;Nam6;Nam7d; Nam8; ;Nam9d;Nam10;Nam11;Nam12";
            //String[] strs = s.split("[,\\s\\;]");
            String[] strs = s.split("[,\\;]");
            System.out.println("Substrings length:"+strs.length);
            for (int i=0; i < strs.length; i++) {
                System.out.println("Str["+i+"]:"+strs[i]);
            }
        }
    }

