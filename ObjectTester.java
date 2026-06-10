/*Francisco Gil Mendoza
6/9/2026
Object Tester
*/

public class ObjectTester {  

    public static void main (String[] args ) {
        
        Dog dog1 = new Dog();

        System.out.println("Printing dog1 directly:");
        System.out.println(dog1);


        /*test of dog variables
        Dog dog2 = new Dog();
        System.out.println("\nDefaults for d1 fields (before any assignment):");
        System.out.println("name = " + dog2.getName());   // expected: null
        System.out.println("age = " + dog2.getAge());     // expected: 0
        System.out.println("breed = " + dog2.getBreed()); // expected: null

        Dog d2 = new Dog(); // uses default constructor values
        System.out.println("\nd2 after default constructor:");
        System.out.println("name = " + d2.getName() + ", age = " + d2.getAge() + ", breed = " + d2.getBreed());

        Dog d3 = new Dog("Rex", 4, "Collie"); // uses parameterized constructor
        System.out.println("\nd3 after parameterized constructor:");
        System.out.println("name = " + d3.getName() + ", age = " + d3.getAge() + ", breed = " + d3.getBreed());

        System.out.println("\nPrinting objects after overriding toString():");
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        System.out.println("\nMutating public fields directly:");
        d3.setAge(5);//d3.age = 5;      // direct write
        d3.setName("Max");//d3.name = "Max"; // direct write
        System.out.println("After mutation, d3 = " + d3); // uses toString()

      
        System.out.println("\nMutating via setters after making fields private:");
        d3.setAge(6);
        d3.setName("Maxwell");
        d3.setBreed("Border Collie");
        System.out.println("d3 age via getter = " + d3.getAge());
        System.out.println("d3 now = " + d3); */
        
        // Test Bird  printing directly (before overriding toString)
        Bird bird1 = new Bird();
        System.out.println("Printing bird1 directly:");
        System.out.println(bird1);

        // Test default constructor values
        Bird b2 = new Bird();
        System.out.println("\nDefaults for b2 fields (before any assignment):");
        System.out.println("species = " + b2.getSpecies());
        System.out.println("age = " + b2.getAge());
        System.out.println("color = " + b2.getColor());

        // Test parameterized constructor
        Bird b3 = new Bird("Parrot", 2, "Green");
        System.out.println("\nAfter parameterized constructor:");
        System.out.println("species = " + b3.getSpecies() +
                           ", age = " + b3.getAge() +
                           ", color = " + b3.getColor());

        // Test toString()
        System.out.println("\nPrinting objects after overriding toString():");
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

        // Test setters
        System.out.println("\nMutating via setters:");
        b3.setAge(3);
        b3.setSpecies("Macaw");
        b3.setColor("Blue");
        System.out.println("After mutation, b3 = " + b3);
        

    }
}