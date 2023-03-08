package static_nonstatic_concept;

/* interview_question_static 
}
/*  Interview prep from this topic
 * 1) What is the purpose of static method and variables?
 * 
 Ans) The methods or variables defined as static are shared among all the objects of the class.
 The static is the part of the class and not of the object. The static variables are stored in the 
 class area, and we do not need to create the object to access such variables.
 
 2) Why is the main method static?
 
 Ans) Because the object is not required to call the static method . If we make the main method non-static,
 JVM will have to create its object first and then call main() method which will lead to the extra memory allocation.
 
 3) Can we override the static methods?
 Ans)  NO  ,we can't override the static method
 
 4_ can we execute a program without main() method?
 Ans)  NO , it was possible  before JDK 1.7 using the static block.Since JDK 1.7 ,it is not possiable 
 
 5) What if the static modifier is removed from the signature of the main method?
 Ans)Promgram compiles.However , at runtime ,it throws an error "NOSuchMethodError".
 
 6)Can we override satatic method  
 Ans)No , you can't override the static method because they  part  of the class, they are not object
 
 7) Why can we not override static method?
 *It is because the static method is part of the class,and is bound with the class
 *whereas instance method is bound with the object , and static gets memory in class area,
 *and instance gets memory in a heap
 *
 *8) Why is method overloading not possible by changing the return type in java?
 *Ans) In java , method overloading is not possible by changing the return type of the program to avoid the ambiguity, 
 *
 *
 
 
 */

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	*/
	
}}