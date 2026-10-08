package com.java.comapreeuqlsandmethods;

class User {
	String name;
	User(String name){
		this.name = name;
	}
}

public class Drive {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1 == s2); 
		System.out.println(s1.equals(s2)); 
		
		String s3 = "java";
		String s4 = "Java";
		System.out.println(s3 == s4);  
		System.out.println(s3.equals(s4)); 
		
		String s5 = new String("Java");
		String s6 = new String("Java");
		System.out.println(s5 == s6); 
		System.out.println(s5.equals(s6)); 
		
		User user1 = new User("Java");
		User user2 = new User("Java");
		System.out.println(user1 == user2); 
		System.out.println(user1.equals(user2)); 

	}

}

//
//```java
//package com.java.comapreeuqlsandmethods;
//
//class User {
//    String name;
//
//    User(String name) {
//        this.name = name;
//    }
//}
//
//public class Drive {
//
//    public static void main(String[] args) {
//
//        // =========================================================
//        // CONDITION 1: String literals with SAME content
//        // =========================================================
//
//        String s1 = "Java";
//        String s2 = "Java";
//
//        System.out.println(s1 == s2);
//        // true → Both references point to the SAME "Java" object
//        //       from the String Pool.
//
//        System.out.println(s1.equals(s2));
//        // true → String.equals() compares the CONTENT of both
//        //       String objects, and both contain "Java".
//
//
//        // =========================================================
//        // CONDITION 2: String literals with DIFFERENT content
//        // =========================================================
//
//        String s3 = "java";
//        String s4 = "Java";
//
//        System.out.println(s3 == s4);
//        // false → "java" and "Java" are different String objects
//        //         in the String Pool, so references are different.
//
//        System.out.println(s3.equals(s4));
//        // false → String.equals() compares CONTENT and
//        //         "java" is not equal to "Java" (case-sensitive).
//
//
//        // =========================================================
//        // CONDITION 3: new String() creates DIFFERENT objects
//        // =========================================================
//
//        String s5 = new String("Java");
//        String s6 = new String("Java");
//
//        System.out.println(s5 == s6);
//        // false → new String() creates TWO separate String objects,
//        //         so s5 and s6 point to different objects.
//
//        System.out.println(s5.equals(s6));
//        // true → String.equals() compares CONTENT, and both
//        //        String objects contain exactly "Java".
//
//
//        // =========================================================
//        // CONDITION 4: Custom User objects
//        // =========================================================
//
//        User user1 = new User("Java");
//        User user2 = new User("Java");
//
//        System.out.println(user1 == user2);
//        // false → new User() creates TWO different User objects,
//        //         so user1 and user2 refer to different objects.
//
//        System.out.println(user1.equals(user2));
//        // false → User does NOT override equals(), so Object.equals()
//        //         is used, which compares object identity/references.
//
//
//    }
//}
//```
