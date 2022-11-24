import java.util.Arrays;
public class Main {
    static boolean isEqual(int[]ary, int value){
        for(int i: ary){
            if(i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {3,6,6,12,6,2,3,5,8,10,9,11,12,11,13,8};
        int[] duplicate = new int[list.length];
        int start =0;

        for(int i=0; i<list.length;i++){
            for(int j=0; j<list.length; j++){
                if(i!=j && list[i]==list[j] && list[i]%2==0){
                    if( !isEqual(duplicate, list[i])){
                        duplicate[start++]=list[i];
                    }
                }
            }
        }
        //System.out.print(Arrays.toString(duplicate));
        for(int k: duplicate){
            if(k!=0){
                System.out.println(k);
            }
        }
    }
}