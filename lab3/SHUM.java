public class SHUM
{
  public static void main(String args[]){
   String arr[]={"Pakistan","Berlin","Germany","America"}; 
    String key="Berlin";
    System.out.println(" The string is " + key + " and the index is "+SHUM(arr,key));
  }
  public static int SHUM(String arr[],String key){
    for(int i=0; i<arr.length; i++){
      if(arr[i] == key){
    return i;
      }
    }
    return -1;
  }
}