package Variables_Data_Types;
import java.util.*;
class Points {
    int x;
    int y;
}
public class Non_Primitive_as_Reference {
    public static void main(String[] args){
        Points p1 = new Points();
        p1.x=10;
        p1.y=20;
        Points p2=p1;
        p2.x=30;
        System.out.println(p1.x);
        System.out.println(p2.x);
    }
}
