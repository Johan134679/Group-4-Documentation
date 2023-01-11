# Coding regulations for Java

The standards stipulated [here](https://www.oracle.com/technetwork/java/codeconventions-150003.pdf) will be used, with the following extensions:

* Chosen Language: Java
* Naming convention is camelCase.
* Correct spelling for variables.
* Spaces after commas and before curly brackets.
* Spacing around equals.
* Each indentation is 4 spaces.
* Curly brackets same line as conditionals or loops.
* Globals and statics in all caps with underscores.
* No spaces before semicolons at line ends.
* If you need to increment always ++ instead of += 1.
* Use comments sparingly.
* Function descriptions in comments above function, in function comments are only for explaing core parts.
* Try not to use continues.
* No empty try catches.
* Switches above nested/chained ifs.
* Don't create fall through cases in switch statements.

```
// This function 
public static String doThing(String name, String surname) {
    for (int i = 0; i < 10; i++) {
        i += 1;
    }
    return "Hello World! " + name + " " + surname;
}
```