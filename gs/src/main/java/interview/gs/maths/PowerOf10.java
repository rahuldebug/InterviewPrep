package interview.gs.maths;
/*
* Problem Statement
* Returns true if x is a power-of-10. Otherwise, returns false.
* Signature:
* bool isPowerOf10(int x){                                }
* Test Cases:
*INPUT:
* Input1: 3
* Output1: false
*
* Input1: 10
* Output1: true
* */

public class PowerOf10 {
    public static void main(String[] args) {
        System.out.println(isPowerOf10(99));
    }
    public static boolean isPowerOf10(int x){
        if (x==10||x==1 ) return true;
        if (x%10!=0||x==0)return false;
        return isPowerOf10(x/10);
    }
}
