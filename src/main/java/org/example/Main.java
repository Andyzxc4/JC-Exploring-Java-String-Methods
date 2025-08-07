package org.example;


public class Main {
    public static void main(String[] args) {

        /*
        1. Prediction:
        What do you think will be the output?
            - Based on the readings, length() returns all of the characters in a string,
              including the " " white spaces. So if we count one by one based on String greeting.
              there are total of 14 characters, results in 14 when we use greeting.length()

        2. Observation:
        Now, run the code. What is the actual output?
            - The length of the string is: 14
         */
        String greeting = "Hello, Cadets!";
        int greetingLength = greeting.length();
        System.out.println("The length of the string is: " + greetingLength);

        /*
        1. Prediction:
        What do you think will be the output?
            - Based on the readings, charAt() returns the character at the index provided in the
              parameter of charAt(index), when counting each chars in a String literals, always start
              at 0, hence, the char at index 5 for String message is "l", but if we tried to change
              it to 4, it will print " ", since a space is always considered a character in a String.

        2. Observation:
        Now, run the code. What is the actual output?
            - The character at index 5 is: l
         */
        String message = "Keep learning!";
        char character = message.charAt(5);
        System.out.println("\nThe character at index 5 is: " + character);
        System.out.println("The character at index 4 is: " + message.charAt(4));

        /*
        1. Prediction:
        What do you think will be the output?
            - Based on the readings, using substring() will cut out the index that we provided as
              parameters in the substring() method, and it will serve as guide to where specifically
              we want to cut out the characters. So in this case, statement.substring(5, 7) means that
              we want the String to be cut out (all characters outside the range of index 5 and 7. Not in between!),
              and remain as a results of characters between indexes 5 and 7.

              But take note that at index 5, the character will be the first to be included, and at index
              7, that character will not include until the last index of the String.
              Some people mistakenly thought that the output here will be "is ", since at index 7, it is
              the index for the " " character for statement -> "Java is powerful."

              To conclude, the output here will be "l"

              Note: based on Java source code, if we hover the substring(), we know that
                "
                 beginIndex – the beginning index, inclusive.
                 endIndex – the ending index, exclusive.
                "
                take note of the inclusive and exclusive for beginIndex, and endIndex.

        2. Observation:
        Now, run the code. What is the actual output?
            - The character at index 5 is: l
         */
        String statement = "Java is powerful.";
        String part = statement.substring(5, 7);
        System.out.println("\nThe extracted substring is: " + part);

        /*
        1. Prediction:
        What do you think will be the output?
            - Since toUpperCase(), and toLowerCase() are both straight to the point based on its method name.
              we can predict that when a String utilizes these method, it will behave as it is.
                toUpperCase(): will make/convert all the characters in a String to UPPER CASE.
                toLowerCase(): will make/convert all the characters in a String to LOWER CASE.

        2. Observation:
        Now, run the code. What is the actual output?
            - Uppercase: THIS IS A TEST
            - Lowercase: this is a test
         */
        String mixedCase = "This Is A Test";
        String upper = mixedCase.toUpperCase();
        String lower = mixedCase.toLowerCase();
        System.out.println("\nUppercase: " + upper);
        System.out.println("Lowercase: " + lower);

        /*
        1. Prediction:
        What do you think will be the output?
            - Based on the readings, we know that indexOf() method returns the starting index of the
              first occurrence of the specified character or substring. So in this case, for the first case which
              is "fox", if we count each character manually in our String, the "fox" or that first letter of "fox" which
              is 'f', will be at index 16, and for 'z' it will be at index 37. Since indexOf() doesn't return an error
              if we specify the substring or character of that String, it will result as -1. So for the last case,
              since "cat" substring isn't included in our sentence String, it will have a result of -1.

        2. Observation:
        Now, run the code. What is the actual output?
            - Index of 'fox': 16
              Index of 'z': 37
              Index of 'cat': -1
         */
        String sentence = "The quick brown fox jumps over the lazy dog.";
        int indexOfFox = sentence.indexOf("fox");
        int indexOfZ = sentence.indexOf('z');
        int indexOfCat = sentence.indexOf("cat");
        System.out.println("\nIndex of 'fox': " + indexOfFox);
        System.out.println("Index of 'z': " + indexOfZ);
        System.out.println("Index of 'cat': " + indexOfCat);

       /*
        1. Prediction:
        What do you think will be the output?
            - Based on the readings, since the difference between equals() and equalsIgnoreCase() method is that
              when using equals(), we will compare both string literals, so if we compare "Hello" with "hello",
              even though we know that both are the same word, but it will result as false, since equals() method
              compare the EXACT literals and it is case-sensitive. On the other hand, equalsIgnoreCase() function
              the same as equals(), but the difference is that it is not case-sensitive. So it will return true if we
              compare "Hello" with "hello".

              To conclude, the output here will be false, true, true

        2. Observation:
        Now, run the code. What is the actual output?
            - "Java".equals("java"): false
              "Java".equals("Java"): true
              "Java".equalsIgnoreCase("java"): true

         */
        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";

        boolean isEqual1 = str1.equals(str2);
        boolean isEqual2 = str1.equals(str3);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);

        System.out.println("\n\"Java\".equals(\"java\"): " + isEqual1);
        System.out.println("\"Java\".equals(\"Java\"): " + isEqual2);
        System.out.println("\"Java\".equalsIgnoreCase(\"java\"): " + isEqualIgnoreCase);


        /*
        1. Prediction:
        What do you think will be the output?
            - Since the replace() method return the specified String that we want to replace in our created/declared
              String type variable. In this case, the output will be "I like dogs. Cats are cute."

              Note that Cats will not change, since it is case-sensitive, and it will replace the EXACT substring
              in the String literal. Hence, "Cats" will not be replaced, since cats is not the same as Cats.

        2. Observation:
        Now, run the code. What is the actual output?
            - Original: I like cats. Cats are cute.
              Replaced: I like dogs. Cats are cute.
        */
        String original = "I like cats. Cats are cute.";
        String replaced = original.replace("cats", "dogs");
        System.out.println("\nOriginal: " + original);
        System.out.println("Replaced: " + replaced);

                /*
        1. Prediction:
        What do you think will be the output?
            - Since the trim() method cuts/exclude all the leading and trailing whitespace,
              in our Strings. "   Lots of spaces   " will now become "Lots of Spaces". So if we create another
              String object, and utilized the padded.trim(), its length will now be 14, and the trimmed String will
              now be "Lots of spaces" .

        2. Observation:
        Now, run the code. What is the actual output?
            - Padded string length: 20
              Trimmed string: 'Lots of spaces'
              Trimmed string length: 14
        */
        String padded = "   Lots of spaces   ";
        String trimmed = padded.trim();
        System.out.println("\nPadded string length: " + padded.length());
        System.out.println("Trimmed string: '" + trimmed + "'");
        System.out.println("Trimmed string length: " + trimmed.length());


    }
}