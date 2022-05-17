
## Item 1: Consider static factory methods instead of constructors 
### **Static factory** methods advantages:
1. Unlike constructors, they have names
2. Unlike constructors, they are not required to create a new object each time they’re invoked
3. Unlike constructors, they can return an object of any subtype of their return type
4. The class of the returned object can vary from call to call as a function of the input parameters
5. The class of the returned object need not exist when the class containing the method is written

### **Static factory** methods disadvantages:
1. Classes without **public** or **protected** constructors cannot be subclassed
2. Static factory methods they are hard for programmers to find

***
## Item 2: Consider a builder when faced with many constructor parameters
- The Builder pattern has disadvantages as well. In order to create an object, you must first 
 create its builder. While the cost of creating this builder is unlikely to be noticeable in 
 practice, it could be a problem in performance-critical situations. Also, the Builder pattern
 is more verbose than the telescoping constructor pattern, so it should be used only if there
 are enough parameters to make it worthwhile, say four or more. But keep in mind that you may
 want to add more parameters in the future. But if you start out with constructors or static 
 factories and switch to a builder when the class evolves to the point where the number of 
 parameters gets out of hand, the obsolete constructors or static factories will stick out 
 like a sore thumb. Therefore, it’s often better to start with a builder in the first place.


- In summary, the Builder pattern is a good choice when designing classes whose constructors 
 or static factories would have more than a handful of parameters, especially if many of the
 parameters are optional or of identical type. Client code is much easier to read and write
 with builders than with telescoping constructors, and builders are much safer than JavaBeans.

***
## Enforce the singleton property with a private constructor or an enum type
1. Making a class a singleton can make it difficult to test its clients  because it’s impossible to substitute a mock implementation for a singleton unless it implements an interface that serves as its type.
2. There are two common ways to implement singletons. Both are based on keeping the constructor private and exporting a public static member to provide access to the sole instance. 
3. In the second approach to implementing singletons, the public member is a static factory method
4. A third way to implement a singleton is to declare a single-element enum:
  - This approach is similar to the public field approach, but it is more concise, provides the serialization machinery for free, and provides an ironclad guarantee against multiple instantiation, even in the face of sophisticated serialization or reflection attacks. This approach may feel a bit unnatural, but a single-element enum type is often the best way to implement a singleton. Note that you can’t use this approach if your singleton must extend a superclass other than Enum (though you can declare an enum to implement interfaces).

***
## Enforce noninstantiability with a private constructor
***

## Prefer dependency injection to hardwiring resources