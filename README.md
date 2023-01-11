# Coding regulations for Java

The standards stipulated [here](https://www.oracle.com/technetwork/java/codeconventions-150003.pdf) will be used, with the following extensions:

* Chosen Language: Java
* Naming convention is camelCase.
* Correct spelling for variables.
* Spaces after commas and before curly brackets.
* Spacing around operators.
* Each indentation is 4 spaces.
* Curly brackets same line as conditionals, loops or declarations.
* Globals and statics in all caps with underscores.
* No spaces before semicolons at line ends.
* If you need to increment always ++ instead of += 1.
* Use comments sparingly.
* Function descriptions in comments above function, in function comments are only for explaing core parts.
* Try not to use continues.
* No empty try catches.
* Switches above nested/chained ifs.
* Don't create fall through cases in switch statements.
* Don't use nested turnary operators.
* Always make branches never work on main directly.
* Commented code is deleted code.
* One statement per line.
* Declare variables when they are about to be used if possible.
* Declaring of multiple variables are in multiple lines even if it is the same type.
* All classes start with capitals.

```java 
/**
 * This method does this and that.
 * @param name this takes the name
 * @param surname this takes the surname
 * @return String something 
 *
 */
public static String doFormalGreeting(String name, String surname) {
    //This is an in function comment
    for (int i = 0; i < 10; i++) {
        i += 1;
    }
    return "Hello World! " + name + " " + surname;
}
```