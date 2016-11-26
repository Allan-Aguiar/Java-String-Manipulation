package testes;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testes {
    
    /*
     public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter the text with spaces(press enter to done):");
     String text = br.readLine();

     System.out.println("Line:\n" + analyse(text));
     }

     public static String analyse(String text) {

     int p = 0, n = 0;

     Pattern word1 = Pattern.compile("(?i)awesome|(?i)good");
     Matcher m1 = word1.matcher(text);
     while (m1.find()) {
     p = p + 1;
     }
        
     Pattern word2 = Pattern.compile("(?i)bad|(?i)terrible");
     Matcher m2 = word2.matcher(text);
     while (m2.find()) {
     n = n + 1;
     }
        
     Pattern word3 = Pattern.compile("(?x)Hey whats up");
     Matcher m3 = word3.matcher(text);
     while (m3.find()) {
     p = 0;
     n = 0;
     }
d
     return p + "P" + n + "N";
     }
     */
    /*
     public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter an email which you would like to verify for correctness: ");
     String email = scanner.nextLine();
     Testes emailVerifyer = new Testes();
     System.out.println("Output: ");
     System.out.println(emailVerifyer.isEmail(email));

     }

     public boolean isEmail(String email) {

     Pattern p = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
     Matcher matcher = p.matcher(email);

     return matcher.matches();
     }*/

    /*
     public static void main(String args[]) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Please enter an email address: ");
     String email = scanner.nextLine();

     vallidate(email);

     Testes domain = new Testes();
     System.out.println("Output: ");
     System.out.println(domain.extractDomain(email));
     }

     private static void vallidate(String email) {
     Pattern p = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
     //Match the given string with the pattern
     Matcher m = p.matcher(email);
     if (!m.matches()) {
     throw new IllegalArgumentException("The email you entered is not valid '" + email + "'");
     }
     }

     private String extractDomain(String email) {

     String domain;
     domain = email.substring(email.indexOf('@') + 1);
     return email = domain;
     }
     */
    /*
     public boolean ratSmeller(String line) {
        
     return line.contains("rat");
     }

     public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter a word and we will tell you if it contains the string 'rat' in it: ");
     String word = scanner.nextLine();
     Testes rats = new Testes();
     System.out.println("Output: ");
     System.out.println(rats.ratSmeller(word));
     }
     */
    /*
     public static void main(String[] args) {
     String fullName = "";
     String[] str;
     String firstName = "";
     String lastName = "";
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the full name:");
     fullName = scanner.nextLine();

     str = fullName.split(" ");

     for (int i = 0; i <= fullName.length(); i++) {
            
     if (i == 0) {
     firstName = str[0];
     }
     }
        
     lastName = (str[str.length - 1]);

     System.out.println("The names after split is:");
     System.out.println(firstName + "' " + lastName);
     }
     */
    /*
     public int wordLength(String word) {
     int x = 0;

     for (int i = 1; i <= word.length(); i++) {
     x = x + 1;
     }

     return x;
     }

     public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Please enter a word: ");
     String word = scanner.nextLine();
     System.out.println("Output: ");

     Testes seq = new Testes();
     System.out.println(seq.wordLength(word));
     }
     */
}
