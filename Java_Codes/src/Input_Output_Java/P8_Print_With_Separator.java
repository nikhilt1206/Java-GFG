package Input_Output_Java;
import java.util.Scanner;
public class P8_Print_With_Separator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String sep =sc.nextLine();
        System.out.println(a+sep+b);
    }
}
