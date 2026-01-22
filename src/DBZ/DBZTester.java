package DBZ;

import antlr4.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class DBZTester {

    public static void main(String[] args) {
        // Test programs
        String[] testPrograms = {
                // Test 1: Valid program with all features
                """
            power x = 10;
            power y = 5;
            
            if (x > y) {
                print(x);
            } else {
                print(y);
            }
            power a = 12;
            while(a!=20){
            a++;
            print(a);
            }
            
            
            """,

                // Test 2: Arithmetic expressions
                """
            power a = 10;
            power b = (a + 5) * 2;
            power c = a / 2 + b - 3;
            print(a);
            print(b);
            print(c);
            """,

                // Test 3: Nested conditionals
                """
            power num = 15;
            
            if (num > 10) {
                print(1);
                if (num > 20) {
                    print(2);
                } else {
                    print(3);
                }
            }
            """,

                // Test 4: Complex while loop
                """
            power sum = 0;
            power i = 1;
            
            while (i <= 10) {
                sum = sum + i;
                i = i + 1;
            }
            
            print(sum);
            """
        };

        for (int i = 0; i < testPrograms.length; i++) {
            System.out.println("\n" + "=".repeat(60));
            System.out.println("TEST " + (i + 1));
            System.out.println("=".repeat(60));
            parseAndExecute(testPrograms[i]);
        }
    }

    public static void parseAndExecute(String input) {
        try {
            // Create lexer and parser
            CharStream charStream = CharStreams.fromString(input);
            DBZLexer lexer = new DBZLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DBZParser parser = new DBZParser(tokens);

            // Add custom error listener
            parser.removeErrorListeners();
            parser.addErrorListener(new DBZErrorListener());

            // Parse the program
            ParseTree tree = parser.program();

            // Check if parsing was successful
            if (parser.getNumberOfSyntaxErrors() == 0) {
                System.out.println("✅ PARSING SUCCESSFUL!\n");

                System.out.println("🚀 EXECUTING PROGRAM:");
                System.out.println("-".repeat(60));

                // Execute the program with the interpreter
                DBZInterpreter interpreter = new DBZInterpreter();
                interpreter.execute(tree);

                // Show final variable state
                interpreter.printVariables();

                System.out.println("\n✅ EXECUTION COMPLETED SUCCESSFULLY!");

            } else {
                System.out.println("\n❌ PARSING FAILED with " +
                        parser.getNumberOfSyntaxErrors() + " error(s)");
                System.out.println("Cannot execute program with syntax errors.");
            }

        } catch (Exception e) {
            System.out.println("❌ Runtime Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

// Custom error listener for compiler-style error reporting
class DBZErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        System.out.println("\n❌ DBZ Syntax Error");
        System.out.println("➡ Line: " + line);
        System.out.println("➡ Position: " + charPositionInLine);
        System.out.println("➡ Message: " + msg);

        if (offendingSymbol instanceof Token) {
            Token token = (Token) offendingSymbol;
            System.out.println("➡ Offending Token: '" + token.getText() + "'");
        }
    }
}