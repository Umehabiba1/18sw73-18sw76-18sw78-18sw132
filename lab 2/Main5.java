class Main5{
public static void main(String[] args) {
	int arr[]={18,30,49,55};
	int largest=arr[0];
	int secondlargest=arr[0];
	System.out.println("the given array is:");
	for (int i=0;i<arr.length ;i++ ) {
		System.out.println(arr[i]);
	}
	for (int i=0;i<arr.length ;i++ ) {
		if(arr[i]>largest){
			secondlargest=largest;
			largest=arr[i];
		}else if(arr[i]>secondlargest){
			secondlargest=arr[i];
		}
	}
	System.out.println("second largest number is " +secondlargest);
}
	}