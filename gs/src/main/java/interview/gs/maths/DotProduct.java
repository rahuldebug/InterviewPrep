package interview.gs.maths;

/**
 * Problem Statement
 * Given two arrays of integers, returns the dot product of the arrays.Signature:
 * long dotProduct( int[] array1, int array2[] ){                              }
 * Test Cases:
 * INPUT:  array1 = [1, 2];
 * array2 = [2, 3];
 * OUTPUT: hint {1*2+2*3}
 * Result =[8]
 **/

public class DotProduct {
    long dotProduct(int[] array1, int array2[]) {
        return (long) array1[0] * array1[1] + array2[0] + array2[1];
    }
}
