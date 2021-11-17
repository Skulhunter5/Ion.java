package ion.parser.ast;

import ion.parser.ASTType;
import ion.parser.AST_Expression;
import ion.parser.ExpressionType;

public class AST_Boolean extends AST_Expression {

    private boolean value;

    public AST_Boolean(boolean value) {
        super(ExpressionType.BOOLEAN);

        this.value = value;
    }

    // Getters and Setters
    public boolean getValue() {return value;}

    // Print
    @Override
    public String toString() {
        return "<AST-" + type + " value='" + value + "'>";
    }

}
