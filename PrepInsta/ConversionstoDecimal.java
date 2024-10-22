public class ConversionstoDecimal {
    public static int binary(int bin) {
        int dec = 0, n = 0;
        while (bin > 0) {
            int temp = bin % 10;
            dec += temp * Math.pow(2, n);
            bin = bin / 10;
            n++;
        }
        return dec;
    }

    public static int octal(int oct) {
        int dec = 0, n = 0;
        while (oct > 0) {
            int temp = oct % 10;
            dec += temp * Math.pow(8, n);
            oct = oct / 10;
            n++;
        }
        return dec;
    }

    public static int hex(String hex) {
        String dig = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int val = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int d = dig.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }

    public static void main(String[] args) {
        System.out.println("Binary to decimal: " + binary(1010));    
        System.out.println("Octal to decimal: " + octal(121));       
        System.out.println("Hexadecimal to decimal: " + hex("A"));  
    }
}
