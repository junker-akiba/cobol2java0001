import junker.akiba.cblib.CbInteger;

public class JavaCobolInteger {

	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("usage :  JavaCobolInteger Operate Integer1 Integer2");
			System.out.println("operate = ADD|SUB|MUL|DIV");
			
		} else {
			CbInteger integerA = new CbInteger();
			CbInteger integerB = new CbInteger();
			String operate = args[0];
			integerA.load(args[1]);
			integerB.load(args[2]);
			CbInteger result = new CbInteger();
			switch (operate) {
			case "ADD":
				result = CbInteger.add(integerA, integerB);
				break;
			case "SUB":
				result = CbInteger.subtract(integerA, integerB);
				break;
			case "MUL":
				result = CbInteger.multiply(integerA, integerB);
				break;
			case "DIV":
				CbInteger.DivideResult divResult = CbInteger.divide(integerA, integerB);
				System.out.println("remainder = " + divResult.remainder.save());
				result = divResult.quotient;
				break;
			}
			System.out.println("result = " + result.save());
		}
	}

}
