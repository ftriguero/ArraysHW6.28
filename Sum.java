
public class Sum {
	public static void main(String[]args) {
		int []arr=new int[]{1,2,3,4,5};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum +arr[i];
			
		}
		System.out.println("Sum of all the elements of an array:"+sum);
	}
}


/* What is the output?
double[ ] exampleArray = {1,5,6,5,4,1};
double maximum = examplesArray[0];
int index = 0;
for (int i = 1; i<exampleArray.length>; i++){
     if (exampleArray[ i ] > maximum) {
          maximum = exampleArray[ i ];
          index = i;
     }
}
System.out.println(index); */
//The output of this example would be the index of the maximum value of the elements in the example array which is 2.






public static int[] toPower(int size, int power) {
int[] expArray = new int[size];
for (int i = 0; i<expArray.length;i++) {
	expArray[i] = (int) Math.pow(i, power);
}

return expArray;

}
}
