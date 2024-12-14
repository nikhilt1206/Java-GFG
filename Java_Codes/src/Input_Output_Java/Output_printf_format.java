package Input_Output_Java;
import java.util.*;
public class Output_printf_format {
    public static void main(String[] args){
        int x=100,y=200;
        System.out.format("Value of x is %d\n",x);
        double d =Math.PI;
        System.out.println(d);
        System.out.format("Value of PI : %.2f\n",d);
        System.out.format("Value of PI : %5.2f\n",d);
        System.out.format("Value of PI : %05.2f\n",d);
        System.out.printf("x=%d,y=%d",x,y);
    }
}
