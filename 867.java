class Solution {
    public int[][] transpose(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int i,j;
        int[][] transpose=new int[m][n];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        return transpose;

    }
}
