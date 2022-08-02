package Graph;

import java.util.Scanner;

public class NumberOfComponenets {

    static int n, m;

    static void printA(int n, int m, int[][] A){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(A[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] A = new int[n][m];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    A[i][j] = sc.nextInt();
                }

            }
        boolean [][] visited= new boolean[n][m];
          //  printA(n,m,A);
        System.out.println(groupOfOne(A, visited));

    }
    private static int groupOfOne(int [][] A, boolean [][] visited){
            int groupOfOne =0;
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(A[i][j]==1 && !visited[i][j]){
                        dfs(A, i, j, visited);
                        groupOfOne++;
                    }
                }
            }
            return groupOfOne;
        }
        private static void dfs(int [][]A, int i, int j,  boolean [][] visited){
            int nNbr[] = new int[] {-1,  0,  0,  1};
            int mNbr[] = new int[] { 0, -1,  1,  0};
            visited[i][j] = true;
            for(int k=0; k<4; k++){
                int x = nNbr[k]+i;
                int y = mNbr[k]+j;
                if(isSafe(A, visited, x, y)){
                    dfs(A, x, y, visited);
                }
            }
        }
        private static boolean isSafe(int [][] A, boolean [][] visited, int i, int j){

        if((i>=0 && i<m) && (j>=0 && j<n) && !visited[i][j] && A[i][j]==1){
                return true;
            }else {
                return false;
            }
        }
    }

