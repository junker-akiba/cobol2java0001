import junker.akiba.cblib.CbNumeric;

public class JavaCobolNumeric {

	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("usage :  JavaCobolNumeric Operate Integer1 Integer2");
			System.out.println("operate = ADD|SUB|MUL|DIV");
			
		} else {
			CbNumeric integerA = new CbNumeric();
			CbNumeric integerB = new CbNumeric();
			String operate = args[0];
			integerA.load(args[1]);
			integerB.load(args[2]);
			CbNumeric result = new CbNumeric();
			switch (operate) {
			case "ADD":
				result = CbNumeric.add(integerA, integerB);
				break;
			case "SUB":
				result = CbNumeric.subtract(integerA, integerB);
				break;
			case "MUL":
				result = CbNumeric.multiply(integerA, integerB);
				break;
			case "DIV":
				CbNumeric.DivideResult divResult = CbNumeric.divide(integerA, integerB);
				System.out.println("remainder = " + divResult.remainder.save());
				result = divResult.quotient;
				break;
			}
			System.out.println("result = " + result.save());
		}

	}

}
