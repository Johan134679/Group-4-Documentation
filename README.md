# Group 4 
## Coding regulations for Java


## Naming conventions
* Naming convention: camelCase.
* Correct spelling for variables.
* Globals and statics in all caps with underscores.
* All classes start with capitals.

## Spacing
* Spaces after commas and before opening curly brackets.
* Spacing around infix and unary operators (+ - * / =).
* No spaces before semicolons at line ends.

## Indentation
* Indentation: 4 spaces.

## Brackets
* Curly brackets on same line as conditionals or loops.

## Variables
* Declare variables when they are about to be used if possible.
* Declaring of multiple variables are in multiple lines even if it is the same type.

## Documentation and comments
* Use comments sparingly.
* Function descriptions in comments above function, in function comments are only for explaing core parts.
* Remove commented out code.

## Other
* If you need to increment always ++ instead of += 1.
* Try not to use continues.
* No empty try catches.
* Switches above nested/chained ifs.
* Don't create fall through cases in switch statements.
* Don't use nested turnary operators.
* One statement per line.
*  Avoid ternary operator

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
