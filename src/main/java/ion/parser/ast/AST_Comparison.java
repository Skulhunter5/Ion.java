package ion.parser.ast;

import ion.parser.AST_Expression;
import ion.parser.ExpressionType;

public class AST_Comparison extends AST_Expression {

    private AST_Expression a, b;

    public AST_Comparison(AST_Expression a, AST_Expression b) {
        super(ExpressionType.COMPARISON);

        this.a = a;
        this.b = b;
    }

    // Getters and Setters
    public AST_Expression getA() {return a;}
    public AST_Expression getB() {return b;}

    // Print
    @Override
    public String toString() {
        return "<AST-" + type + " a='" + a + "' b='" + b + "'>";
    }

}