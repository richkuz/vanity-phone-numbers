package com.example.vanity;

class Vanity
{
    // Your program begins with a call to main().
    // Prints "Hello, World" to the terminal window.
    public static void main(String args[])
    {
        System.out.println(Vanity.find_number("example"));
    }

    public static String find_number(String word)    {
        String n = "";
        for (int i = 0; i < word.length(); i++)
        {
            char c = word.charAt(i);
            if (c == 'a' || c == 'b' || c == 'c') n = n + '2';
            if (c == 'd' || c == 'e' || c == 'f') n = n + '3';
            if (c == 'g' || c == 'h' || c == 'i') n = n + '4';
            if (c == 'j' || c == 'k' || c == 'l') n = n + '5';
            if (c == 'm' || c == 'n'  || c == 'o') n = n + '5';
            if (c == 'p' || c == 'q' || c == 'r' || c == 's') n = n + '7';
            if (c == 't' || c == 'u' || c == 'v') n = n + '8';
            if (c == 'w' || c == 'x' || c == 'y' || c == 'z') n = n + '9';
        }
        return n;
    }
}
