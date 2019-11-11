class LINEARS
{ 
	public static void main(String[] args) 

	{
		char arr[]={'s','s','a','o','i','d'};
		char search='a';
		System.out.println("The Character is " +search+ " and the index is "+LINEARS(arr,search));
	}
	public static int LINEARS(char arr[],char search)
	{
		for(int i=0; i<arr.length; i++)
          {
          	if(arr[i]==search)
          	{
          		return i;
          	}
          }
          return -1;
	} 
	   
	
}