import java.util.ArrayList;

public class nt {
    public static void main(String[] args){
        ArrayList<int []> Stopgo = new ArrayList<int[]>();
        //array pertama orang naik bus //array kedua orang turun bus
        Stopgo.add(new int[] {10,0});
        Stopgo.add(new int[] {3,5});
        Stopgo.add(new int[]{2,5});
        System.out.println(getPassenger(Stopgo));
    }
    public static int getPassenger(ArrayList <int []> biskota){
        return (biskota.indexOf(0))-(biskota.indexOf(0))-(biskota.indexOf(0))
        -(biskota.indexOf(0))-(biskota.indexOf(0))-(biskota.indexOf(0))-(biskota.indexOf(0));

    }
}
