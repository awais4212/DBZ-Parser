# DBZ Parser

A custom language parser and interpreter for the DBZ (DragonBall Z) programming language, built using ANTLR4.

## Overview

DBZ Parser is a compiler frontend that processes DBZ source code files and provides syntax validation, parsing, and interpretation capabilities. The project demonstrates fundamental compiler construction concepts including lexical analysis, syntax parsing, and code execution.

## Features

- **Lexical Analysis** - Tokenizes DBZ source code into meaningful tokens
- **Syntax Parsing** - Validates code against defined grammar rules
- **Parse Tree Generation** - Constructs abstract syntax trees for analysis
- **Code Interpretation** - Executes valid DBZ programs
- **Error Reporting** - Detailed syntax error messages with line and position information
- **Visitor Pattern Support** - Flexible parse tree traversal and manipulation

## Project Structure

```
DBZ_PARSER/
├── src/
│   └── DBZ/
│       ├── DBZ.g4              # ANTLR4 grammar definition
│       ├── DBZLexer.java       # Generated lexer
│       ├── DBZLexer.interp     # Lexer interpreter data
│       ├── DBZLexer.tokens     # Token definitions
│       ├── DBZParser.java      # Generated parser
│       ├── DBZListener.java    # Parse tree listener interface
│       ├── DBZVisitor.java     # Parse tree visitor interface
│       ├── DBZInterpreter.java # Code interpreter
│       └── DBZTester.java      # Test driver
├── pom.xml                      # Project configuration
└── README.md
```

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- ANTLR4 runtime library
- Maven or Gradle (for dependency management)
- IntelliJ IDEA or any Java IDE (recommended)

## Installation

1. Clone the repository:
```bash
git clone https://github.com/yourusername/dbz-parser.git
cd dbz-parser
```

2. Install ANTLR4 dependencies (if using Maven):
```xml
<dependency>
    <groupId>org.antlr</groupId>
    <artifactId>antlr4-runtime</artifactId>
    <version>4.13.1</version>
</dependency>
```

3. Generate parser from grammar:
```bash
antlr4 DBZ.g4
```

4. Compile the project:
```bash
javac *.java
```

## Usage

### Running the Tester

```java
public class DBZTester {
    public static void main(String[] args) {
        // Example DBZ code execution
        DBZInterpreter interpreter = new DBZInterpreter();
        interpreter.execute("your_code.dbz");
    }
}
```

### Example DBZ Code

```java
power y = 5;

if (x > y) {
    print(x);
} else {
    print(y);
}
```

## Language Features

The DBZ language currently supports:
- Variable declarations with the `power` keyword
- Conditional statements (`if`/`else`)
- Comparison operators (`>`, `<`, `==`)
- Print statements
- Arithmetic expressions

## Error Handling

The parser provides comprehensive error reporting:

```
DBZ Syntax Error
Line: 11
Position: 1
Message: mismatched input '+' expecting '='
Offending Token: '+'
```

## Development

### Modifying the Grammar

1. Edit `DBZ.g4` file
2. Regenerate parser files:
```bash
antlr4 DBZ.g4
```
3. Recompile Java files
4. Test with `DBZTester.java`

### Running Tests

```bash
java DBZTester
```

## Troubleshooting

**Syntax Errors**: Check that your DBZ.g4 grammar rules follow ANTLR4 syntax conventions. Common issues include:
- Missing colons (`:`) in rule definitions
- Incorrect operator precedence
- Mismatched parentheses or braces

**Compilation Errors**: Ensure all ANTLR4-generated files are up to date by regenerating from the grammar file.

## Contributing

Contributions are welcome! Please:
1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Submit a pull request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments

- Built with [ANTLR4](https://www.antlr.org/)
- Inspired by compiler design principles
- Named after the legendary DragonBall Z series

## Contact

For questions or support, please open an issue on the GitHub repository.

---

**Status**: Active Development  
**Version**: 1.0.0  
**Last Updated**: January 2026
