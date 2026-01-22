package DBZ;

import antlr4.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class DBZInterpreter extends DBZBaseVisitor<Integer> {
    // Variable storage
    private Map<String, Integer> variables = new HashMap<>();

    // Execute the entire program
    public void execute(ParseTree tree) {
        visit(tree);
    }

    @Override
    public Integer visitProgram(DBZParser.ProgramContext ctx) {
        for (DBZParser.StatementContext stmt : ctx.statement()) {
            visit(stmt);
        }
        return 0;
    }

    @Override
    public Integer visitVariableDeclaration(DBZParser.VariableDeclarationContext ctx) {
        String varName = ctx.ID().getText();
        int value = visit(ctx.expression());
        variables.put(varName, value);
        System.out.println("✅ Declared variable: " + varName + " = " + value);
        return value;
    }

    @Override
    public Integer visitAssignment(DBZParser.AssignmentContext ctx) {
        String varName = ctx.ID().getText();

        // ✅ CHECK if variable was declared first
        if (!variables.containsKey(varName)) {
            System.out.println("❌ Error: Variable '" + varName + "' not declared!");
            System.out.println("   Use 'power " + varName + " = <value>;' to declare it first.");
            return 0;
        }

        int value = visit(ctx.expression());
        variables.put(varName, value);
        System.out.println("✅ Assigned: " + varName + " = " + value);
        return value;
    }

    @Override
    public Integer visitPrintStatement(DBZParser.PrintStatementContext ctx) {
        int value = visit(ctx.expression());
        System.out.println("🖨️  OUTPUT: " + value);
        return value;
    }

    @Override
    public Integer visitIfStatement(DBZParser.IfStatementContext ctx) {
        boolean condition = evaluateCondition(ctx.condition());

        if (condition) {
            System.out.println("🔀 Entering IF block (condition TRUE)");
            visit(ctx.block(0));
        } else if (ctx.block(1) != null) {
            System.out.println("🔀 Entering ELSE block (condition FALSE)");
            visit(ctx.block(1));
        }
        return 0;
    }

    @Override
    public Integer visitWhileStatement(DBZParser.WhileStatementContext ctx) {
        int iterations = 0;
        System.out.println("🔁 Entering WHILE loop");

        while (evaluateCondition(ctx.condition())) {
            iterations++;
            if (iterations > 1000) {
                System.out.println("⚠️  Loop limit reached (1000 iterations)");
                break;
            }
            visit(ctx.block());
        }

        System.out.println("🔁 Exited WHILE loop after " + iterations + " iterations");
        return 0;
    }

    @Override
    public Integer visitBlock(DBZParser.BlockContext ctx) {
        for (DBZParser.StatementContext stmt : ctx.statement()) {
            visit(stmt);
        }
        return 0;
    }

    // Expression evaluation
    @Override
    public Integer visitMulDiv(DBZParser.MulDivContext ctx) {
        int left = visit(ctx.expression(0));
        int right = visit(ctx.expression(1));

        if (ctx.getChild(1).getText().equals("*")) {
            return left * right;
        } else {
            if (right == 0) {
                System.out.println("❌ Error: Division by zero!");
                return 0;
            }
            return left / right;
        }
    }

    @Override
    public Integer visitAddSub(DBZParser.AddSubContext ctx) {
        int left = visit(ctx.expression(0));
        int right = visit(ctx.expression(1));

        if (ctx.getChild(1).getText().equals("+")) {
            return left + right;
        } else {
            return left - right;
        }
    }

    @Override
    public Integer visitParens(DBZParser.ParensContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Integer visitIdentifier(DBZParser.IdentifierContext ctx) {
        String varName = ctx.ID().getText();
        if (variables.containsKey(varName)) {
            return variables.get(varName);
        } else {
            System.out.println("❌ Error: Variable '" + varName + "' not declared!");
            return 0;
        }
    }

    @Override
    public Integer visitNumber(DBZParser.NumberContext ctx) {
        return Integer.parseInt(ctx.NUMBER().getText());
    }

    // Condition evaluation
    private boolean evaluateCondition(DBZParser.ConditionContext ctx) {
        int left = visit(ctx.expression(0));
        int right = visit(ctx.expression(1));
        String op = ctx.relationalOp().getText();

        return switch (op) {
            case ">" -> left > right;
            case "<" -> left < right;
            case ">=" -> left >= right;
            case "<=" -> left <= right;
            case "==" -> left == right;
            case "!=" -> left != right;
            default -> false;
        };
    }

    // Print all variables (for debugging)
    public void printVariables() {
        System.out.println("\n📋 Variables in memory:");
        if (variables.isEmpty()) {
            System.out.println("  (none)");
        } else {
            variables.forEach((name, value) ->
                    System.out.println("  " + name + " = " + value)
            );
        }
    }
}