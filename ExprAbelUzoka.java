import java.util.Scanner;

public class ExprAbelUzoka {
	 static MyStackAbelUzoka <Character> myStack =  new MyStackAbelUzoka<>();
	 static MyStackAbelUzoka <Character> myStack2 =  new MyStackAbelUzoka<>();
	
	public static void main(String[] args) {
		
	    // What is the process of main method.
	    // - User will insert infix
	    // - Invoke infixToPostfix to transform it to postfix expression
	    // - Invoke postfixEval to evaluate postfix expression
	    // - Show the calculated result
	    // Write appropriate codes here
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an infix: ");
		String infix = input.nextLine();
		
		String postfix = ExprAbelUzoka.infixToPostfix(infix);
		System.out.println("Postfix evaluation: " + postfix);
		
		double result = postfixEval(postfix);
		System.out.println("Result value: " + result);
		
	}
//	private final static char ADD = '+';
//	private final static char SUBTRACT = '-';
//	private final static char MULTIPLY = '*';
//	private final static char DIVIDE = '/';
//	private final static char EXPONENT = '^';
	//private MyStackAbelUzoka <Integer> stack;
	
//	public ExprAbelUzoka() {
//		myStack =  new MyStackAbelUzoka<>();
//		myStack2 =  new MyStackAbelUzoka<>();
//	}
//	
	public static String infixToPostfix(String infix){
		// Write appropriate codes here to transform infix to postfix
		// Return postfix as a String
		int op1, op2, result = 0;
		String token;
		
		for(int i = 0; i<infix.length(); i++) {
			char c = infix.charAt(i);
			if(Character.isDigit(c)) {
				myStack2.push(c);
			}
			
			else if (c == '(') {
				myStack.push(c);
			}
			
			else if (c == '(') {
				while(!myStack.isEmpty() && myStack.peek() != '(') {
					myStack2.push(myStack.pop()); 
				}
				myStack.pop();
			}	
			else {
				while(!myStack.isEmpty() && precedence(myStack.peek(c)) >= precedence(c)) {
					
				}
			}
		}
		return null;
	}
		public static int precedence (char c) {
			switch(c) {
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			}
			return -1;
		}
	public static double postfixEval(String postfix){
		// Write appropriate codes here
		// Return calculated result
		int op1, op2, result = 0;
		String token;
		Scanner scan = new Scanner(postfix);
		
		while(scan.hasNext()) {
			token = scan.next();
		if(isOperator(token)) {
			op1 = (myStack.pop()).intValue();
			op2 = 
			postfix = evaluateinfix(op1, op2);
			}
		
		}	
		return 
	}	

	  
	private boolean isOperator(String token) {
		if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("^")) {
			return true;
		}
	}
	
	private int evaluateinfix() {
		
	}
	

}
