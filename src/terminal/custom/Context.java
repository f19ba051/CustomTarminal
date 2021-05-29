package terminal.custom;

import com.sun.source.tree.IfTree;

import java.util.StringTokenizer;

public class Context {

    private StringTokenizer tokenizer;
    private String currentToken;

    public Context(String text) {
        tokenizer = new StringTokenizer(text);
        currentToken = tokenizer.nextToken();
        System.out.println("current token : " + currentToken);
    }

    public String nextToken() {
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken();
        }
        else {
            currentToken = null;
        }
        return currentToken;
    }

    public String getCurrentToken() {
        return currentToken;
    }

    public void skipToken(String token) throws Exception {
        if (!token.equals(currentToken)) {
            throw new Exception("Warning: " + token + " is expected, but " + currentToken + " is found.");
        }
        nextToken();
    }

    public int currentNumber() throws Exception {
        int number = 0;
        try {
            number = Integer.parseInt(currentToken);
        } catch (NumberFormatException e) {
            throw new Exception("Warning: " + e);
        }
        return number;
    }
}
