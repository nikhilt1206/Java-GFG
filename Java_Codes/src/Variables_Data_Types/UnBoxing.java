package Variables_Data_Types;
import java.util.*;
public class UnBoxing {
    public static void main(String[] args){
        Character ch ='a';
        char a = ch;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(24);
        int num = arrayList.get(0);
        System.out.println(num);
    }
}
