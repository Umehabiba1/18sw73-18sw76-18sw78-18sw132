import java.util.Arrays;
class Task2
{
	public static void main(String[] args)   // main method
	 {

		int a[]={1,2,3,4,5,6};    // array of type integer
		int a2[]={1,2,3,3,5,7};
		System.out.println("Arrays are equal or not");
        System.out.println(Arrays.equals(a,a2));          //Calling the method

		
     }
	public static boolean equals(int[]a,int[]a2)     //method of ARRAY for the equality
	{
	if (a.length !=a2.length) // check the length of array if equals than it retrun true other than false
	{
		return false;
	}
	for(int i=0; i<a.length; i++)  // it will take the length of any array
	{
	if(a[i]!=a2[i])     //check the index of array if it matches to the index of the other array than it return true
	{ 
		return false;
	}
}
   return true;       // if any of of the IF statement is true than it return TRUE

	}
}		