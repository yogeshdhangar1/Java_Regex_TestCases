import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    public static boolean CheckFirstName(String fName){
       String nameCondition = "[A-Z]{1}[a-z]{2,}";
        Pattern pattern = Pattern.compile(nameCondition);
        Matcher fMatcher = pattern.matcher(fName);
        if(fMatcher.matches()) {
            System.out.println("Valid Input");
        }
        else {
            System.out.println("Invalid Input");
        }
        return fMatcher.matches();
    }
    public static boolean CheckLastName(String lastName) {
        String nameCondition = "[A-Z]{1}[a-z]{2,}";
        Pattern pattern = Pattern.compile(nameCondition);
        Matcher lName = pattern.matcher(lastName);
        if(lName.matches()) {
            System.out.println("Valid Input");
        }
        else {
            System.out.println("Invalid Input");
        }
        return lName.matches();
    }
    public static boolean CheckEmail(String Email){
        String emailCondition = "\"[abc]{3}([-+_])?([.][a-zA-Z0-9]{2})?([A-Za-z0-9]{1,})?@[a-z0-9]{1,}.[a-z]{2,3}(.[a-z]{2,3})?\"";
        Pattern pattern = Pattern.compile(emailCondition);
        Matcher email = pattern.matcher(Email);
        if(email.matches()){
            System.out.println("Valid Input");
        }else{
            System.out.println("invalid Input");
        }
        return email.matches();
    }
    public static boolean CheckMobileNum(String MobileNum){
        String NumberCondition = "^(91)()[6-9]{1}[0-9]{9}$";
        Pattern pattern = Pattern.compile(NumberCondition);
        Matcher num = pattern.matcher(MobileNum);
        if(num.matches()){
            System.out.println("Valid Input");
        }else{
            System.out.println("Invalid Input");
        }
        return num.matches();
    }
    public static boolean CheckPass(String Password){
        String passCondition = "^(?=.*[@!#$%&*?])(?=.*[0-9])(?=.*[A-Z])[a-zA-Z0-9@!#$%&*?]{8,}$";
        Pattern pattern = Pattern.compile(passCondition);
        Matcher p = pattern.matcher(Password);
        if(p.matches()) {
            System.out.println("valid Input");
        }else{
            System.out.println("Invalid Input");
        }
        return p.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First name");
        String fName = sc.nextLine();
        CheckFirstName(fName);
        System.out.println("Enter the Last name");
        String lastName = sc.nextLine();
        CheckLastName(lastName);
        String validEmailId [] = {"abc@yahoo.com","abc-100@yahoo.com","abc-100@yahoo.com",
                "abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au",
                "abc@1.com","abc@gmail.com.com","abc+100@gmail.com",
                "abc","abc@.com.my","abc123@gmail.a","abc123@.com",
                "abc123@.com.com",".abc@abc.com","abc()*@gmail.com",
                "abc@%*.com","abc..2002@gmail.com","abc.@gmail.com",
                "abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au",
                "abc1..@gmail.com"};
        for (int i =0;i<validEmailId.length;i++) {
            CheckEmail(validEmailId[i]);
        }
        System.out.println("Enter the mobile number");
        String mobileNumber = sc.nextLine();
        CheckMobileNum(mobileNumber);
        System.out.println("Enter the password");
        String password = sc.nextLine();
        CheckPass(password);
        sc.close();
    }
}


