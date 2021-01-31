package romanConverter ;
/*
@author asakka
 */

public class RomanConverter {

    private enum RomanLiteral {
        XC(90),
        L(50),
        XL(40),
        X(10),
        IX(9),
        V(5),
        IV(4),
        I(1);

        int value;

        RomanLiteral(int value) {
            this.value = value;
        }
    }


    public static String convert(int number) {
        ResultBuilder result = new ResultBuilder(number);

        for (RomanLiteral literal : RomanLiteral.values()){
            result.computeForLiteral(literal);
        }

        return result.format();
    }

    static class ResultBuilder {
        int rest;
        StringBuilder result = new StringBuilder();

        public ResultBuilder(int rest) {
            this.rest = rest;
        }

        public void append(String name) {
            result.append(name);
        }

        public String format() {
            return result.toString();
        }

        public void computeForLiteral(RomanLiteral literal) {
            while (rest >= literal.value) {
                append(literal.name());
                rest -=  literal.value;
            }
            /*** Apparition du pattern de division Euclidienne --> introduire la notion du rest *****
             *
             *
             *  for (int i = 0; i < number / 10; i++) {
             *    result.append("X");
             *  }
             *  for (int i = 0; i < number % 10; i++) {
             *    result.append("I");
             *  }
             *

             **** transformer les for en while   ******
             * ** introduire l'Enum  ******
             while (rest >= 10) {
             result.append("X");
             rest -= 10;
             }
             while (rest >= 1) {
             result.append("I");
             rest -= 1;
             }*/
        }
    }
}
