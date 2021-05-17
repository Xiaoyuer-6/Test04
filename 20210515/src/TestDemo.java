import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-15
 * Time: 11:39
 */
public class TestDemo {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       // while (sc.hasNext()) {
        int [] arr ={1,2,2,3,3,2,2};
        int n = 7;
            System.out.println(arr.);

    }
    public static  int calStringDistance(String charA,String charB){
        //字符串转化成数组；
        char [] ch1 =charA.toCharArray();
        char [] ch2 =charB.toCharArray();
        int count = 0;//初始值需要0步；
        if(charA.length()==charB.length()){
            for (int i = 0; i <ch1.length ; i++) {
                for (int j = 0; j <ch2.length ; j++) {
                    if(ch1[i]!=ch2[j]){
                        count++;
                    }
                }
            }
        }
        if(charA.length()!= charB.length()){

            //第一中情况
            for (int i = 0; i <ch1.length ; i++) {
                for (int j = 0; j <ch2.length ; j++) {
                    int con = 0;
//                    while (i < ch1.length && j < ch2.length) {
                        if (ch1[i] == ch2[j]) {
                            //count = ch1.length-ch2.length>0?ch1.length-ch2.length:ch2.length-ch1.length;
                        }
                        count = ch1.length - ch2.length > 0 ? ch1.length - ch2.length : ch2.length - ch1.length;
                        if (ch1[i] != ch2[j]) {
                            con++;
                        }
                    count = ch1.length - ch2.length > 0 ? ch1.length - ch2.length : ch2.length - ch1.length+con;
                }
            }
        }
        return count;
    }
//    public int getValue(int[] gifts, int n) {
////        Scanner sc = new Scanner(System.in);
////        while (sc.hasNext()) {
//        Arrays.sort(gifts);
//            int mid = gifts[n/2];
//            //int [] arr = {1,2,3,2,2};
//            int count = 0;
//            int i = 0;
//            for (i = 0; i < n; i++) {
//                 if(mid == gifts[i]){
//                     count++;
//                 }
//            }
//            if (count > n/2) {
//                return mid;
//            } else {
//                return 0;
//            }
//        }
    }

