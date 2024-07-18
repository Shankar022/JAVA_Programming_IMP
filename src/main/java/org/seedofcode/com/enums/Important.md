## Important Notes
1. It is important to understand that each enumeration constant is an object of its enumeration type. 
Thus, when you define a constructor for an enum, the constructor is called when each enumeration constant is created.
2. Enum constants are implicitly public, static, and final. 
Thus, in the language of Java, these constants are called self-typed, in which “self” refers to the enclosing enumeration.
3. Here are two restrictions that apply to enumerations. 
First, an enumeration can’t inherit another class. 
Second, an enum cannot be a superclass. This means that an enum can’t be extended. Otherwise, enum acts much like any other class type. 
The key is to remember that each of the enumeration constants is an object of the class in which it is defined.
4. The Enum constructors must be private or package-private because they are implicitly private.