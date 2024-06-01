package ASSIGNMENTS.MULTIDIMENSIONAL_ARRAY;

public class rotate_90_anti_clockwise {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int n = arr.length;
        int[][] res = new int[n][n];
        display(arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = arr[j][i];
            }
            System.out.println();
        }
        display(res);
        for(int i=0;i<n;i++) {
            int a=0,b=n-1;
            while(a<b){
                //swap arr[i][a] with arr[i][b]
                int temp=res[a][i];
                res[a][i]=res[b][i];
                res[b][i]=temp;
                a++;
                b--;
            }
            System.out.println();
        }
        display(res);

    }

    private static void display(int[][] res) {
        int n=res.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
