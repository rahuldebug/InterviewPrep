package interview.gs.maths;
//input arrays are ascending in nature
//mostly yes , but why last digit is failing

public class MergeArrays {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 3,4, 6, 8, 10};

        int[] result = getAscMerge(a, b);
        for (int i:result){
            System.out.println(i);

        }
    }

    private static int[] getAscMerge(int[] a, int[] b) {

        int lena = a.length;
        int lenb = b.length;
        int aptr=0;
        int bptr=0;
        int resultptr=0;
        int[] result = new int[a.length + b.length];
        if (a.length == 0 && b.length == 0) return new int[]{};
        if (a.length == 0 && b.length != 0) return b;
        if (a.length != 0 && b.length == 0) return a;


        while(aptr<lena && bptr <lenb){

            if(a[aptr]<b[bptr]){
                result[resultptr]=a[aptr];
                resultptr++;
                aptr++;
            } else if (a[aptr]>b[bptr]) {
                result[resultptr]=b[bptr];
                resultptr++;
                bptr++;
            }
            else {
                result[resultptr]=a[aptr];
                resultptr++;
                aptr++;
                result[resultptr]=b[bptr];
                resultptr++;
                bptr++;
            }
        }
        if ((aptr+1)!=lena){
            for(int i=aptr;i<lena;i++){
                result[resultptr]=a[aptr];
                resultptr++;
            }

        }

        if ((bptr+1)!=lenb){
            for(int i=bptr;i<lenb;i++){
                result[resultptr]=a[bptr];
                resultptr++;
            }

        }


        return result;
    }


}
