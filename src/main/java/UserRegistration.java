import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 interface Check{
     public String format(String name);
 }
public class UserRegistration {
    public static void main(String[] args) {
        // lamda Expression Checking First name
        Check obj = (name)->{
            String nameCondition = "[A-Z]{1}[a-z]{2,}";
            Pattern pattern = Pattern.compile(nameCondition);
            Matcher fmatcher = pattern.matcher(name);
            if(fmatcher.matches()) {
                return"Valid Input";
            }
            else {
                return "Invalid Input";
            }
        };
        System.out.println(obj.format("Yogesh"));
        //Lambda expression for Checking last Name
        Check lastName = (name)->{
            String nameCondition = "[A-Z]{1}[a-z]{2,}";
            Pattern pattern = Pattern.compile(nameCondition);
            Matcher lName = pattern.matcher(name);
            if(lName.matches()) {
                return"Valid Input";
            }
            else {
                return "Invalid Input";
            }
        };
        System.out.println(lastName.format("Borse"));
        // Lambda Expression Check Email Id
        Check emailIdCheck = (enteredValue)->{
            String emailCondition = "[abc]{3}([-+_])?([.][a-zA-Z0-9]{2})?([A-Za-z0-9]{1,})?@[a-z0-9]{1,}.[a-z]{2,3}(.[a-z]{2,3})?";
            Pattern pattern = Pattern.compile(emailCondition);
            Matcher email = pattern.matcher(enteredValue);
            if(email.matches()) {
                return"Valid Input";
            }
            else {
                return "Invalid Input";
            }
        };
        System.out.println(emailIdCheck.format("abc.101@gmail.com"));
        //Lambda expression for Chceking Mobile Number
        Check mobileNumber = (enteredValue)->{
            String emailCondition = "^[91]()[6-9]{1}[0-9]{9}$";
            Pattern pattern = Pattern.compile(emailCondition);
            Matcher email = pattern.matcher(enteredValue);
            if(email.matches()) {
                return"Valid Input";
            }
            else {
                return "Invalid Input";
            }
        };
        System.out.println(mobileNumber.format("91 9967945885"));
        //Lambda expression for Chceking Password
        Check password = (enteredValue)->{
            String emailCondition = "^(?=.*[@!#$%&*?])(?=.*[0-9])(?=.*[A-Z])[a-zA-Z0-9@!#$%&*?]{8,}$";
            Pattern pattern = Pattern.compile(emailCondition);
            Matcher email = pattern.matcher(enteredValue);
            if(email.matches()) {
                return"Valid Input";
            }
            else {
                return "Invalid Input";
            }
        };
        System.out.println(password.format("Abcd@1234"));
    }
}

