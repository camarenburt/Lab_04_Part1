public class Main {
    public static void main(String[] args) {

        int intOperandA = 74;
        int intOperandB = 46;
        int intSum = intOperandA + intOperandB;
        int intDifference = intOperandA - intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intQuotient = intOperandA / intOperandB;
        int intModulo = intOperandB % intOperandA;
        double doubleOperandA = 54.45;
        double doubleOperandB = 34.6;
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;
        double doubleModulo = doubleOperandB + doubleOperandA;

        System.out.println(" The answer to " +intOperandA+ "+" +intOperandB+ "=" +intSum+"." );
        System.out.println(" The answer to " +intOperandA+ "x" +intOperandB+ "=" +intProduct+"." );
        System.out.println(" The answer to " +intOperandA+ "-" +intOperandB+ "=" +intDifference+"." );
        System.out.println(" The answer to " +intOperandA+ "/" +intOperandB+ "=" +intQuotient+"." );
        System.out.println(" The answer to " +intOperandB+ "%" +intOperandA+ "=" +intModulo+"." );
        System.out.println(" The answer to " +doubleOperandA+ "+" +doubleOperandB+ "=" +doubleSum+"." );
        System.out.println(" The answer to " +doubleOperandA+ "-" +doubleOperandB+ "=" +doubleDifference+"." );
        System.out.println(" The answer to " +doubleOperandA+ "x" +doubleOperandB+ "=" +doubleProduct+"." );
        System.out.println(" The answer to " +doubleOperandA+ "/" +doubleOperandB+ "=" +doubleQuotient+"." );
        System.out.println(" The answer to " +doubleOperandB+ "%" +doubleOperandA+ "=" +doubleModulo+"." );
    }
}