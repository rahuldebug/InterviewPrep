package interview.gs.maths;

/**
 *  Given two fractions passed in as int arrays,
 *  returns the fraction which is result of adding the two input fractions
 *  Fraction is represented as a two-element array - [ numerator, denominator ]
 *  The returned fraction has to be in its simplest form
 **/

public class AddFractions {
    public static void main(String[] args) {
        int[] fraction1={2,3};
        int[] fraction2={1,2};
        int [] result= addFractions(fraction1,fraction2);
        System.out.println(result[0] +"/" +result[1]);
    }


  public static   int[] addFractions ( int[] fraction1, int[] fraction2 ){

        //edge case to be handled
        if (fraction1.length<2||fraction2.length<2)  return new int[]{};
        int den=fraction1[1]*fraction2[1];
        int num=fraction1[0]*fraction2[1] +fraction2[0]*fraction1[1];
        return new int[]{num,den};
    }
}
