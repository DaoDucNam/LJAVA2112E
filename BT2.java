package Buoi5;

public class BT2 {
    public static void main(String[] args){
        String sample = "vietnamnet.com";
        for(int i =0; i<sample.length();i++){
            int count =0;
            boolean runner = false;
            for (int j=0;j<i;j++){
                if(sample.charAt(i)==sample.charAt(j)){
                    runner = true;
                    break;
                }
            }
            if(runner){
                continue;
            }
            else{
                for (int k = i; k<sample.length();k++){
                    if(sample.charAt(i)==sample.charAt(k)){
                        count++;
                    }
                }
            }
            System.out.println(sample.charAt(i)+" co "+ count+ " chu");
        }
    }


}