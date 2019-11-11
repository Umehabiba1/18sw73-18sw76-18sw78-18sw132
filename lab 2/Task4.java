import  java.util.Arrays;
class Task4
{
	public static void main(String[] args)
	 {
		float arr[]={0.0f,0.1f,0.9f,0.8f};
		float sum;
		sum=0;
		for(int i=0; i<arr.length; i++)
        {
        	
        	sum+=arr[i];
        }   
        
       float avg;
       avg=sum/arr.length;
       System.out.println(avg);
        
	 }
}