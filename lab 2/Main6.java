import java.util.*;
class Main6{
	public static void main(String args[]){
	int row, col,i,j;
	int arr[][]=new int[10][10];
	Scanner scan=new Scanner(System.in);
	System.out.println("enter number of rows");
	row=scan.nextInt();
	System.out.println("enter number of column");
	col=scan.nextInt();
	System.out.println("enter " +(row*col)+"Array Element:");
	for(i=0;i<row;i++){
		for(j=0;j<col;j++){
			arr[i][j]=scan.nextInt();
		}
	}
System.out.println("The Array is:");
for(i=0;i<row;i++){
	for(j=0;j<col;j++)
	{
		System.out.println(arr[i][j]+ "  ");
	}
	System.out.println();
}

	}
}