public class BitManipulation {

    public static void convertDecimaltoBinary(int decimal) {

        int binary[] = new int[32];
        int index = 0;
        while (decimal > 0) {
            binary[index] = decimal%2;
            decimal = decimal/2;
            index++;
        }
        for(int i = index; i>=0;i--) {
            System.out.print(binary[i]);
        }
    }

    public static void convertFractiontoBinary(double fraction) { ;

        int intPart = (int) fraction;
        double doublePart = fraction - intPart;
        System.out.println(intPart + "      " + doublePart);

    }

    public static void main(String[] args) {

        convertDecimaltoBinary(100);
        convertFractiontoBinary(3.27);
    }
}
