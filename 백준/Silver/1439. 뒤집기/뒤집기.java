import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(0) && str.charAt(i-1) == str.charAt(0)){
                count++;
            }
        }
        System.out.println(count);
    }
}