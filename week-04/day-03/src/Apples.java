public class Apples {

    String Apple;

    public Apples(String Apple) { // in the other way nothing is needed between the paranthesis
        this.Apple = "apple";
    }

    public String getApple() {
        return Apple;
    }
}

/*
# Apples
- Create a class, with one method (eg. `public String getApple()`) that returns a string (eg. `"apple"`)
- Create a test for that.
    - Create a test class
    - Create a test method
    - Instantiate an Object from your class in the method
    - Use the `assertEquals()`
    - The expected parameter should be the same string (eg. `"apple"`)
    - The actual parameter should be the return value of the method (eg. `myObject.getApple()`)
- Run the test
- Change the expected value to make the test failing
- Run the test
- Fix the returned value to make the test succeeding again*/
