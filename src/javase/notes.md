# Chapter 1  Building Blocks

* javac: Converts .java source files into .class bytecode
* java: Executes the program
* jar: Packages files together
* javadoc: Generates documentation

---
* The method name and parameter types are called the method signature
       
         public int numberVisitors(int month) {
         return 10;
         }
    the method signature is `numberVisitors(int)`
---

    // A single-line comment
    
    
     /*Multiple
     *line comment
     */
    
     /**
     *Javadoc multiple-line comment
     *@author Jeanne and Scott
     */


# Chapter 3 Making Decisions

* Boilerplate code is code that tends to be duplicated throughout a section of code over and over again in a similar manner.



    void compareIntegers(Number number) {
        if(number instanceof Integer data) { 
        System.out.print(data.compareTo(5));
        }
    }
The variable data in this example is referred to as the pattern variable.

    Integer value = 123;
    if(value instanceof Integer) {}       // COMPILE                 
    if(value instanceof Integer data) {}  // DOES NOT COMPILE
While the second line compiles, the last line does not compile because pattern matching requires that the pattern variable type Integer be a strict subtype of Integer.

## Flow scoping
    CASE 1:
    if (number instanceof Integer data && data.compareTo(5) > 0) // COMPILE
    if(number instanceof Integer data || data.compareTo(5)>0)  // DOES NOT COMPILE

    CASE 2:
    if (number instanceof Integer data)
        System.out.print(data.intValue());
     System.out.print(data.intValue());  // DOES NOT COMPILE

    void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data))
            return;
        System.out.print(data.intValue()); // COMPILE
    }
This means that when the last line of the method is reached, the input must inherit Integer, and therefore data stays in scope even after the if statement ends.

## Switch
**The following is a list of all data types supported by switch statements:**
* int and Integer
* byte and Byte
* short and Short
* char and Character
* String
* enum values
* **var (if the type resolves to one of the preceding types)**


_**NOTE:** Notice that **boolean, long, float, and double** are excluded from switch statements, as are their associated Boolean, Long, Float, and Double classes. The reasons are varied, such as boolean having too small a range of values and floating-point numbers having quite a wide range of values. For the exam, though, you just need to know that they are not permitted in switch statements._

---

* The values in each case statement must be compile-time constant values of the same data type as the switch value.  **Methods are not evaluated until runtime**

* Unlike a traditional switch statement, though, switch expressions have special rules around when the **default** branch is **required**.

## FOR

A **for-each loop** can be executed on **any Collections object** that implements **java.lang.Iterable**, **such as List or Set, but not all Collections classes, such as Map**


## Adding Optional Labels

    static void  method1() {
        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};

        OUTER_LOOP:  for(int[] mySimpleArray : myComplexArray) {
            INNER_LOOP:  for(int i=0; i<mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i]+"\t");
            }
            System.out.println();
        }
    }
Labels follow the same rules for formatting as identifiers. For readability, they are commonly expressed using uppercase letters in snake_case with underscores between words.
![img.png](img.png)


# Chapter 4 Core APIs

## Creation
        String name = "Fluffy";    // COMPILE
        String name = new String("Fluffy");  // COMPILE
        String name = """
                Fluffy""";  // COMPILE
        String name = """Fluffy""";     // DOES NOT COMPILE

## Important String Methods

* length()
* charAt(int index)

* indexOf(int ch)
* indexOf(int ch, int fromIndex)
* indexOf(String str)
* indexOf(String str, int fromIndex)

* substring(int beginIndex)
* substring(int beginIndex, int endIndex)

* public String toLowerCase()
* public String toUpperCase()

## Checking for Equality
* public boolean equals(Object obj)
* public boolean equalsIgnoreCase(String str)

## Searching for Substrings
* public boolean startsWith(String prefix)
* public boolean endsWith(String suffix)
* public boolean contains(CharSequence charSeq)

## Replacing Values
* public String replace(char oldChar, char newChar)
* public String replace(CharSequence target, CharSequence replacement)

## Removing Whitespace
* public String strip() remove both the leading and trailing whitespace
* public String trim() remove both the leading and trailing whitespace
* public String stripTrailing() remove only the trailing whitespace
* public String stripLeading() remove only the leading whitespace

## Working with Indentation
* public String indent(int numberSpaces) 
* numberSpaces > 0 isə numberSpaces dəfə whitespace əlavə edir
* numberSpaces < 0 isə numberSpaces dəfə whitespace çıxılır (ən yaxın characterdən)
* numberSpaces = 0 isə string olduğu kimi çap olunur
* public String stripIndent() evvel ve sondan whitespace-leri silir 

## Translating Escapes
* public String translateEscapes()  //t --> /t 

## Checking for Empty or Blank Strings
* public boolean isEmpty()
* public boolean isBlank()

      System.out.println(" ".isEmpty()); // false
      System.out.println("".isEmpty());  // true
      System.out.println(" ".isBlank()); // true
      System.out.println("".isBlank());  // true

## Formatting Values
* public static String format(String format, Object args…)
* public static String format(Locale loc, String format, Object args…)
* public String formatted(Object args…)


* %s	Applies to any type, commonly String values
* %d	Applies to integer values like int and long
* %f	Applies to floating-point values like float and double
* %n	Inserts a line break using the system-dependent line separator

      var str = "Food: %d tons".formatted(2.0); // IllegalFormatConversionException

       var pi = 3.14159265359;
       System.out.format("[%f]",pi);      // [3.141593]
       System.out.format("[%12.8f]",pi);  // [  3.14159265]
       System.out.format("[%012f]",pi);   // [00003.141593]
       System.out.format("[%12.2f]",pi);  // [        3.14]
       System.out.format("[%.3f]",pi);    // [3.142]

## String Builder
In case you are wondering, the authors of StringBuilder did not implement equals(). If you call equals() on two StringBuilder instances, it will check reference equality. You can call toString() on StringBuilder to get a String to check for equality instead.

## String Pool 
The string pool contains literal values and constants that appear in your program. For example, "name" is a literal and therefore goes into the string pool. The myObject.toString() method returns a string but not a literal, so it does not go into the string pool.

public String intern()
If the literal is not yet in the string pool, Java will add it at this time.

        var name = "Hello World";
        var name2 = new String("Hello World").intern();
        System.out.println(name == name2); // true

1. [ ] **NOTE**: _Remember to never use intern() or == to compare String objects in your code. The only time you should have to deal with these is on the exam._ 