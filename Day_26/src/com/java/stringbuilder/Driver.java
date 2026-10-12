package com.java.stringbuilder;

public class Driver {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Hello"); // this liter will create on scp and one obj create on heap

		sb.append("world"); // this literal will create on scp and  as well as this is added to the existing obj in the heap
		
		System.out.println(sb);  // total three object will create two in scp and one in heap and stringbuilder is mutable 
		
		for(int i =0; i<1000; i++) {
			sb.append("world" + i);  // one object only which will keep modified 
		}
		
	}

}
