public class Task2{
	public static void main(String[] args) {
		char arr[]={'a','b','c','d'};
		char search='c';
		System.out.println(" The Character is " + search +" Found at the index "+ binarysearch(arr,search));
	}
	      public static int binarysearch(char arr[], char search) {
          int mid;
          int low=0;
          int high=arr.length-1;

          while(low<=high){
          	mid=(low+high)/2;

          	if(arr[mid] == search){
          		return mid;}

          	else if(arr[mid] < search){
          		low=mid+1;	}

          	else if(arr[mid] > search){
          		high=mid-1; }

        }
        return-1;
	}
}