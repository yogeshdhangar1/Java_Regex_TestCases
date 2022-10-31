import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class InvalidDetailsException extends Exception{
    InvalidDetailsException (String giveMessage){
        System.out.println(giveMessage);
    }
}
public class UserRegistration {
    public static boolean checkFirstName(String fName) throws InvalidDetailsException {
        String nameCondition = "[A-Z]{1}[a-z]{2,}";
        Pattern pattern = Pattern.compile(nameCondition);
        Matcher fMatcher = pattern.matcher(fName);
        if (fMatcher.matches()) {
            System.out.println("Valid Input");
        } else {
            throw new InvalidDetailsException("Invalid Input");
        }
        return fMatcher.matches();
    }

    public static boolean checkLastName(String lastName) throws InvalidDetailsException {
        String nameCondition = "[A-Z]{1}[a-z]{2,}";
        Pattern pattern = Pattern.compile(nameCondition);
        Matcher lName = pattern.matcher(lastName);
        if (lName.matches()) {
            System.out.println("Valid Input");
        } else {
            throw new InvalidDetailsException("Invalid Input");
        }
        return lName.matches();
    }

    public static boolean checkEmail(String emailId) throws InvalidDetailsException {
        String emailCondition = "[abc]{3}([-+_])?([.][a-zA-Z0-9]{2})?([A-Za-z0-9]{1,})?@[a-z0-9]{1,}.[a-z]{2,3}(.[a-z]{2,3})?";
        Pattern pattern = Pattern.compile(emailCondition);
        Matcher email = pattern.matcher(emailId);
        if (email.matches()) {
            System.out.println(emailId + " Valid Input");
        } else {
            throw new InvalidDetailsException(emailId + " Invalid Input");
        }
        return email.matches();
    }

    public static boolean checkPassword(String password) throws InvalidDetailsException {
        String nameCondition = "^(?=.*[@!#$%&*?])(?=.*[0-9])(?=.*[A-Z])[a-zA-Z0-9@!#$%&*?]{8,}$";//atleast one uppercase
        Pattern pattern = Pattern.compile(nameCondition);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Valid Input");
        } else {
            throw new InvalidDetailsException("Invalid Input");
        }
        return matcher.matches();
    }
    public static void main(String[] args) {
        try {
            checkFirstName("Yogesh");
        } catch (Exception e) {
            System.out.println("Enter the proper input");
        }
        //Check Last Name with try and catch and throw custom exception
        try {
            checkLastName("Dhangar");
        } catch (Exception e) {
            System.out.println("Enter the proper input");
        }
        //Check Email with try and catch and throw custom exception
        String validEmailId[] = {"abc@yahoo.com", "abc-100@yahoo.com", "abc-100@yahoo.com",
                "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
                "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com",
                "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com",
                "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
                "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
                "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au",
                "abc1..@gmail.com"};
        for (int i = 0; i < validEmailId.length; i++) {
            try {
                checkEmail(validEmailId[i]);
            } catch (Exception e) {
                System.out.println("Enter the proper input");
            }
        }

        try {
            checkPassword("BridgeLabz@RFP167");
        } catch (Exception e) {
            System.out.println("Enter the proper input");
        }
    }
}



