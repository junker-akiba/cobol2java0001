import junker.akiba.cblib.CbNumeric;

public class JavaCobolNumeric {

	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("usage :  JavaCobolNumeric Operate Numeric1 Numeric2");
			System.out.println("operate = ADD|SUB|MUL|DIV");
			
		} else {
			CbNumeric numericA = new CbNumeric();
			CbNumeric numericB = new CbNumeric();
			String operate = args[0];
			numericA.load(args[1]);
			numericB.load(args[2]);
			CbNumeric result = new CbNumeric();
			switch (operate) {
			case "ADD":
				result = CbNumeric.add(numericA, numericB);
				break;
			case "SUB":
				result = CbNumeric.subtract(numericA, numericB);
				break;
			case "MUL":
				result = CbNumeric.multiply(numericA, numericB);
				break;
			case "DIV":
				CbNumeric.DivideResult divResult = CbNumeric.divide(numericA, numericB);
				System.out.println("remainder = " + divResult.remainder.save());
				result = divResult.quotient;
				break;
			}
			System.out.println("result = " + result.save());
		}

	}

}
