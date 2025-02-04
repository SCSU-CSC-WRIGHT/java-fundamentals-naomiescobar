/*Exercise 1*/
class Hello{
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
    }
}

/*Exercise 2 */
class Vaiable{
    public static void main(String [] args) {
        int x=10;
        String mesaage = "The number is";
        System.out.println(mesaage + " " + x);
    }
}

/*Exercise 3 */
class Statement{
    public static void main(String[] args) {
        int number = 15;

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

/*Exercise 4 */
class Loop{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }
    }
}

/*Exercise 5 */
class Method{
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
    public static void main(String[] args) {
        System.out.println(greet("Alice"));
    }
}

/*Exercise 6 */
class Person{
    private String name;
        public Person(String name) {
            this.name = name;
        }
    public String greet() {
        return "Hello, " + name + "!";
    }
    public static void main(String[] args) {
        Person p = new Person("Bob");
        System.out.println(p.greet());
    }
}

/*Exercise 7 */
class List {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        for (int num: numbers) {
            System.out.println(num);
        }
    }   
}

/*Exercise 8  needs fixing*/
class Error{
    public static void main(String[] args) {
        try{
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
    }
}