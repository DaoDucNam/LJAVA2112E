package Buoi5;

public class DemString
{
    public static void main(String[] args) {
        String str = "dem ky tu";
        int[] dem = new int[str.length()];
        int i, j;

        char string[] = str.toCharArray();

        for(i = 0; i <str.length(); i++) {
            dem[i] = 1;
            for(j = i+1; j <str.length(); j++) {
                if(string[i] == string[j]) {
                    dem[i]++;

                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
        }

        System.out.println("dem ky tu");
        for(i = 0; i <dem.length; i++) {
            if(string[i] != ' ' && string[i] != '0')
                System.out.println(string[i] + "-" + dem[i]);
        }
    }
}
