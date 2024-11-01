import java.util.*;
class solution{
	public static void main(String[] args){
		int matrix[][]={{1,1,1},{1,0,1},{1,1,1},{1,1,1}};
		int row[] = new int[matrix.length];
		int col[] = new int[matrix[0].length];
		for(int i=0;i<row.length;i++){
			for(int j=0;j<col.length;j++){
				if(matrix[i][j]==0){
					row[i] = -1;
					col[i] = -1;
				}
			}
		}
		for(int i=0;i<row.length;i++){
			for(int j=0;j<col.length;j++){
				if(row[i]==-1 || col[j]==-1){
					matrix[i][j] = 0;
				}
			}
		}
		for(int i=0;i<row.length;i++){
			for(int j=0;j<col.length;j++){
				System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
	}
	}
}
