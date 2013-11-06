/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author erkoc
 */
public class ParsePost {

    private StackXPostfix theStack;
    private String input;
//--------------------------------------------------------------
    public ParsePost(String s) {
        input = s;
    }
//--------------------------------------------------------------
    public int doParse() {
        theStack = new StackXPostfix(20);
// make new stack
        char ch;
        int j;
        int num1, num2, interAns;
        for (j = 0; j < input.length(); j++) {
            ch = input.charAt(j);
            theStack.displayStack("" + ch + " ");
            if (ch >= '0' && ch <= '9') {
                theStack.push((char) (int) (ch - '0'));
            } else {
                num2 = theStack.pop();
                num1 = theStack.pop();
                switch (ch) {
                    case '+':
                        interAns = num1 + num2;
                        break;
                    case '-':
                        interAns = num1 - num2;
                        break;
                    case '*':
                        interAns = num1 * num2;
                        break;
                    case '/':
                        interAns = num1 / num2;
                        break;
                    default:
                        interAns = 0;
                } // end switch
                theStack.push((char) interAns);
// push result
            } // end else
        } // end for
        interAns = theStack.pop();
// get answer
        return interAns;
    } // end doParse()
} // end class ParsePost

