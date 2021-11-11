package ion.lexer;

public class Token {

    private TokenType type;
    private String value;

    public Token(TokenType type, String value) {
        this.type = type;
        this.value = value;
    }

    public TokenType getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    // Printing

    public static void print(Token token) {
        System.out.println(token);
    }

    @Override
    public String toString() {
        return "<TOKEN-" + type + (value != null ? " value='" + value + "'" : "") + ">";
    }

}