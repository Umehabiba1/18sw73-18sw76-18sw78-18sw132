import java.util.Arrays;
class Task6
{
	public static void main(String[] args)
	 { 
        int first[]={2,1,4};           //array of integer type
	 	int second[]={3,6,5};

         int s[][]={ {2,1,4},        //2d array 
                     {3,6,5},
                };
         for(int i=0; i<2; i++)         //for loop excute for rows

         {
         	for(int j=0; j<3; j++)      // for loop excute for columns
         	{
         		System.out.print(" " +s[i][j]);          //print the elements in matrix foam
         	}
         
		System.out.println(); 
			}
	Arrays.sort(first);                   // sorting the array 
      for(int elm : first)               // enchanced for each loop
      {
      
      		System.out.println("SORTED = " +elm);    // print the sorted elements
      }
      Arrays.sort(second);           // sorting the array 
      for(int elm2 : second)
      {
      	System.out.println("SORTED = " +elm2);           // print the sorted elements
      }
  

	}
}