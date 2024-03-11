import java.util.ArrayList;
import java.util.List;
public class Person {
    private String givenName;
    private String surName;
    private int age;
    private Gender gender;
    private String eMail;
    private String phone;
    private String address;

    public static class Builder {
        private String givenName = "";
        private String surName = "";
        private int age = 0;
        private Gender gender = Gender.FEMALE;
        private String eMail = "";
        private String phone = "";
        private String address = "";

        public Person.Builder givenName(String givenName) {
            this.givenName = givenName;
            return this;
        }
        public Person.Builder surName(String surName) {
            this.surName = surName;
            return this;
        }
        public Person.Builder age(int val) {
            age = val;
            return this;
        }
        public Person.Builder gender(Gender val) {
            gender = val;
            return this;
        }
        public Person.Builder email(String val) {
            eMail = val;
            return this;
        }
        public Person.Builder phoneNumber(String val) {
            phone = val;
            return this;
        }
        public Person.Builder address(String val) {
            address = val;
            return this;
        }
    }
}
