package interview.gs.maths;

public class HighestAverageScore {
    public static void main(String[] args) {
        String[][] arr = {{"Bob", "87"},
                {"Mike", "35"},
                {"Bob", "52"},
                {"Jason", "35"},
                {"Mike", "55"},
                {"Jessica", "99"}};
        int result=heighestAverageSalary(arr);
        System.out.println(result);
    }

    private static int heighestAverageSalary(String[][] arr) {
        if (arr.length==0||arr==null) return -1;
        int result=-1;
        for (int i=0;i<arr.length;i++){
            result= Math.max(result, Integer.parseInt(arr[i][1]));
        }
        return result;
    }
}
