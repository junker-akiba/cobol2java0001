public class JavaInt {

	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("usage :  JavaInt Operate Integer1 Integer2");
			System.out.println("operate = ADD|SUB|MUL|DIV");
			
		} else {
			String operate = args[0];
			int integerA = Integer.parseInt(args[1]);
			int integerB = Integer.parseInt(args[2]);
			int result = 0;
			switch (operate) {
			case "ADD":
				result = integerA + integerB;
				break;
			case "SUB":
				result = integerA - integerB;
				break;
			case "MUL":
				result = integerA * integerB;
				break;
			case "DIV":
				result = integerA % integerB;
				System.out.println("remainder = " + result);
				result = integerA / integerB;
				break;
			}
			System.out.println("result = " + result);
		}
	}

}
