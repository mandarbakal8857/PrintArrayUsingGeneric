package com.printarray;

public class PrintArrayUsingGeneric<X,Y,Z>
{
	

	 private X[] myXArray;
	    private Y[] myYArray;
	    private Z[] myZArray;

	
	    public PrintArrayUsingGeneric(X[] myXArray, Y[] myYArray, Z[] myZArray) {
		super();
		this.myXArray = myXArray;
		this.myYArray = myYArray;
		this.myZArray = myZArray;
	    }

	    
	    static public <T> void printArrayUsingGeneric(T[] arr) {
		for (T element : arr)
		    System.out.print(element + " ");
		System.out.println();
	    }

	    

	    private void printArrayUsingGeneric() {
		printArrayUsingGeneric(myXArray);
		printArrayUsingGeneric(myYArray);
		printArrayUsingGeneric(myZArray);
	    }

	    public static void main(String[] args) {
		Integer[] arr1 = { 10, 20, 30 };
		Double[] arr2 = { 1.23, 2.24, 3.345 };
		Character[] arr3 = { 'a', 'A', 'V' };
		/// using generic methods
		printArrayUsingGeneric(arr1);
		printArrayUsingGeneric(arr2);
		printArrayUsingGeneric(arr3);
		
		new PrintArrayUsingGeneric<Integer, Double, Character>(arr1, arr2, arr3).printArrayUsingGeneric();
		
		

	}

}
