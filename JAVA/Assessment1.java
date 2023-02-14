class Assessment1{
 
  public static void main(String[] args) {
 
    int arr[] = { 8, 15, 26, 158, 88, 91, 92, 96, 86, 89 };
    int largest = arr[0];
    int secondLargest = arr[0];
   
    System.out.println("Given Array is:" );
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+"\t");
    }
    for (int i = 0; i < arr.length; i++) {
 
      if (arr[i] > largest) {
        secondLargest = largest;
        largest = arr[i];
 
      } else if (arr[i] > secondLargest) {
        secondLargest = arr[i];
 
      }
    }
 
    System.out.println("\nSecond Largest Number is: " + secondLargest);
 
  }
}