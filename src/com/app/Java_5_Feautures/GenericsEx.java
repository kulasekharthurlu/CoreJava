package com.app.Java_5_Feautures;

import java.util.List;

public class GenericsEx {
    public static void main(String[] args) {
        /**
         * generics are used to create a type of variable which can be used to store multiple types of data
         * mainly used in collections
         * types of generics are:
         * 1. primitive types
         * 2. reference types
         * 3. wildcards
         * 4. arrays
         * 5. type variables
         * 6. type bounds
         * 7. multiple bounds
         * 8. type erasure
         * 9. type inference
         * 10. type arguments
         * 11. type casting
         * 12. type erasure
         * 13. type inference
         * 14. wrapper classes
         * 
         * type safety purpose
         * **/
        List<Integer> list = new java.util.ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        for(int i:list){
            System.out.println(i);
        }
    
}
}
