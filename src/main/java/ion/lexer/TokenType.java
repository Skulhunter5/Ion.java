package ion.lexer;

public enum TokenType {

    IDENTIFIER,
    INTEGER, FLOAT, STRING, BOOLEAN,
    PLUS, MINUS, MULTIPLY, DIVIDE,
    LT, GT, EQ, LTEQ, GTEQ, NEQ, NOT,
    AND, OR, BITWISE_AND, BITWISE_OR, BITWISE_XOR, // maybe even add XOR
    ASSIGN, RIGHT_ARROW_SINGLE, RIGHT_ARROW_DOUBLE,
    OPERATOR, DECREMENT, INCREMENT,
    SEMICOLON, COLON, DOT, COMMA, LPAREN, RPAREN, LBRACE, RBRACE, LBRACK, RBRACK,
    KEYWORD,
    EOF;

}
