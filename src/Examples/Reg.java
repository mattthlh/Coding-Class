package Examples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Reg {

    static String r,s;
    static Pattern pattern;
    static Matcher matcher;
    static boolean match, validRegex, doneMatching;

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args ){
        System.out.println("Welcome ot the Regex Tester\n");

        do {
            do {
                System.out.print("Enter regex: ");
                r = sc.nextLine();
                validRegex = true;
                try {
                    pattern = Pattern.compile(r);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    validRegex = false;
                }
            } while (!validRegex);

                doneMatching = false;
                while (!doneMatching) {
                    System.out.print("Enter string: ");
                    s = sc.nextLine();
                    if(s.length() == 0) {
                        doneMatching = true;
                    }
                    else {
                        matcher = pattern.matcher(s);
                        if (matcher.matches())
                            System.out.println("Match.");
                        else
                            System.out.println("Does not match.");
                        }
                    }
                } while (askAgain());
        }

        private static boolean askAgain() {
            System.out.print("Another? (Y or N) ");
            String reply = sc.nextLine();
            if(reply.equalsIgnoreCase("Y"))
                return true;
            else
                return false;
        }
    }

//Enter regex: abc
//Enter string: abc
//Match.
//Enter string: abcd
//Does not match.

//Enter regex: c.t
//
// Enter string: cat
//Match.
//
// Enter string: cot
//Match.
//
// Enter string: cut
//Match.

//Enter regex: \d\d\d-\d\d-\d\d\d\d
//Enter string: 779-54-3994
//Match.
//Enter string: 550-403-004
//Does not match.

//Enter regex: \w\d-\w\d
//Enter string: R2-D2
//Match.
//Enter string: C2-D0
//Match.
//Enter string: C-3PO
//Does not match.

//Enter regex: b[aAeEiIoOuU]t
//Enter string: bat
//Match.
//Enter string: BAT
//Does not match.
//Enter string: bAt
//Match.

//Enter regex: [bB][aAeEiIoOuU][tT]
//Enter string: bat
//Match.
//Enter string: BAT
//Match.
//Enter string: BaT
//Match.