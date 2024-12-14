package Input_Output_Java;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Buffered_Reader {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enetr a string : ");
        String s = br.readLine();
        System.out.println("You enetered : " +s);

    }
}
