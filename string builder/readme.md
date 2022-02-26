# Strings in java

String class in java is immutable, that is whenever we initialize a variable it can't change.

```java
String name = "Aayush";
name[2] = 'a'; // This gives an error because name is a Object of class java and not an array.
/*
Java doesn't even provide any method which can replace the character at any index.
Also we cannot delete a character for a given index. This all happens just because Strings are immutable.
*/
name = name + "Aa"; // what will be the time complexity of this line?
/*
Most of us might think that yea it is O(1) because we insert the characters at the end. But No, it takes O(n) time complexity
because String is not considered as array of characters.
So adding more strings/characters will delete the previous memory in heap and will create a new one.
*/
```

What should we do now?
No worry peeps, StringBuilder is for the rescue.

## StringBuilder in java

StringBuilder is just like how [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html) is implemented in java.

[Implementations of StringBuilder](https://docs.oracle.com/javase/tutorial/java/data/buffers.html)

Basic Operations like insert, delete char at, insert at position, get char at are made easy using StringBuilder.

[Code](https://github.com/aayushwadhwani99/java-notes/blob/main/string%20builder/Stringbuilder.java)
