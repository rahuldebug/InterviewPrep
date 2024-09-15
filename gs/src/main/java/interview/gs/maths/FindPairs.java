package interview.gs.maths;

import java.util.HashSet;

//find the pairs in an array for given sum k
//nums = [2,7,11,15], target = 9
public class FindPairs {

    public static void main(String[] args) {
        //int a[] = new int[]{2, 7, 11, 15};
        int[] pair = getPairs(new int[]{2, 7, 11, 15}, 9);
        for (int i:pair){
            System.out.println(i);
        }
    }

    private static int[] getPairs(int[] ints, int i) {
        HashSet<Integer> check= new HashSet<>();

        for (int num:ints){
            check.add(num);
        }
        for (int num:ints){
            if(check.contains(i-num)){
                return new int[]{num,i-num};
            }
        }

        return new int []{-1,-1};
    }
}
