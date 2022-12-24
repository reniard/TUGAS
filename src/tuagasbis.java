import java.util.ArrayList;

public class tuagasbis {
    public static void main(String[] args){
        ArrayList<int []> Stopgo = new ArrayList<int[]>();
        //array pertama orang naik bus //array kedua orang turun bus
        Stopgo.add(new int[] {10,0});
        Stopgo.add(new int[] {3,5});
        Stopgo.add(new int[]{2,5});
        System.out.println(getPassenger(Stopgo));
    }
    public static int getPassenger(ArrayList <int []> biskota){
        return biskota.get(0)[0]-(0)+(3)-(5)+(2)-(5);
    }
}
