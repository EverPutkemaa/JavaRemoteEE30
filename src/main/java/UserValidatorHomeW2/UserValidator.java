package UserValidatorHomeW2;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    public static class Email {
        private String email;

        public Email(String email) {
            this.email = email;
        }
        public String formatEmail() {
            if(email == null || email.trim().isEmpty()){
                return "unknown";
            }
            return email.toLowerCase().trim();
        }
        public boolean isValid() {
            String emailRedex = "validator";
            Pattern pattern = Pattern.compile(emailRedex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
    }

    public static List<String> validateEmails(List<String> emails) {
        List<String> validateEmails = new ArrayList<>();
        for (String email : emails) {
            String formattedEmail = new Email(email).formatEmail();
            if (new Email(formattedEmail).isValid()) {
                validateEmails.add(formattedEmail);
            }else {
                System.out.println("Invalid email: " + email + ". Setting to 'unknown'");
                validateEmails.add("unknown");
            }
        }
        return validateEmails;
    }
    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator();


        List<String> emailsToValidate = List.of("John.doe@exampl.com", "", null, "invalid-email", "alice@mail.com" );

        List<String> validatedEmails = userValidator.validateEmails(emailsToValidate);

        System.out.println("Validated Emails: " + validatedEmails);
    }
}

