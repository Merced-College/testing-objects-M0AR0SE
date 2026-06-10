[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=24111110)
# testingObjectsWithJava

Answers:
1.When you print an object without defining your own toString(), Java uses the default implementation inherited from the Object class. Because Java has no custom instructions for how to convert your object into a readable string.
So it falls back to the built‑in Object.toString() method, which returns: <ClassName>@<hashcode>

2.Default values printed
name = null
age = 0
breed = null

age → int → primitive
name → String → reference type
breed → String → reference type

3.Constructors replace Java’s automatic default values with your own custom initialization, giving every new object a predictable, fully‑set starting state.

4.in Part A, Java used the default Object.toString() implementation. After you added your own toString() method in Part D, the output became Dog{name='Unknown', age=0, breed='Mixed'}
@Override tells the compiler you are intentionally replacing a method fromt the parent class. It prevents mistakes and documents your intention. 

5.Using private fields with getters and setters gives you control over how data is accessed and changed. One example is changing a students age. 
  