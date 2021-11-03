import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Q3 {
    
    /** 
     * @summary Displays 3 parts of information: '12345.678' displayed in the UK Locale with 
     * a fraction of 2 decimal places, currency format of the same value, and parse the string
     * '12,345.678' to a number.
     * @param args
     */
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance(Locale.UK);
        nf.setMaximumFractionDigits(2);
        System.out.println('\n' + nf.format(12345.678));

        nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println('\n' + nf.format(12345.678));

        String numberString = "12,345.678";
        try {
            nf = NumberFormat.getInstance(Locale.US);
            Number parsedNumber = nf.parse(numberString);
            System.out.println("\nParsed number: " + parsedNumber);
        } catch (ParseException pe) {
            System.out.println("\nCannot parse string");
        }

        
    }
}
