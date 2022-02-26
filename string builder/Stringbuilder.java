class Stringbuilder {

    public static StringBuilder reverseString(StringBuilder name) {
        for (int i = 0; i < name.length() / 2; i++) {
            int start = i;
            int last = name.length() - 1 - i;
            char startingChar = name.charAt(start);
            name.setCharAt(start, name.charAt(last));
            name.setCharAt(last, startingChar);
        }

        return name;
    }

    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Aayush");
        System.out.println(name);
        // Change the second a to y
        name.setCharAt(1, 'y');
        System.out.println(name);

        // delete the second char
        name.deleteCharAt(1);
        System.out.println(name);

        // length of the string
        System.out.println(name.length());

        // get a character at an index
        System.out.println(name.charAt(0)); // 'A';

        // insert at a specifid position
        name.insert(1, "a");
        System.out.println(name);

        // Let us code a simple but efficient program this time to reverse a string
        System.out.println(reverseString(name));
    }
}