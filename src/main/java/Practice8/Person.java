package Practice8;

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
    private String city;
    private String state;
    private String code;

    @Override
    public String toString() {
        return "Person{" +
                "givenName='" + givenName + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", eMail='" + eMail + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public Person(String givenName, String surName, int age, Gender gender,
                  String eMail, String phone, String address,
                  String city, String state, String code) {
        this.givenName = givenName;
        this.surName = surName;
        this.age = age;
        this.gender = gender;
        this.eMail = eMail;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCode() {
        return code;
    }

    public static class Builder {
        private String givenName;
        private String surName;
        private int age;
        private Gender gender;
        private String eMail;
        private String phone;
        private String address;
        private String city;
        private String state;
        private String code;

        public Builder givenName(String givenName) {
            this.givenName = givenName;
            return this;
        }

        public Builder surName(String surName) {
            this.surName = surName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder eMail(String eMail) {
            this.eMail = eMail;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public Person build() {
            return new Person(givenName, surName, age, gender, eMail, phone, address, city, state, code);
        }
    }

    public static List<Person> createShortList() {
        List<Person> people = new ArrayList<>();
        people.add(new Person.Builder()
                .givenName("Bob")
                .surName("Baker")
                .age(21)
                .gender(Gender.MALE)
                .eMail("bob@email.com")
                .phone("34365437563")
                .address("44 4th Str.")
                .city("New York")
                .state("KS")
                .code("123455")
                .build());

        people.add(new Person.Builder()
                .givenName("John")
                .surName("Baker")
                .age(15)
                .gender(Gender.MALE)
                .eMail("bob@email.com")
                .phone("34365437563")
                .address("44 4th Str.")
                .city("New York")
                .state("KS")
                .code("123455")
                .build());

        people.add(new Person.Builder()
                .givenName("Mary")
                .surName("Baker")
                .age(35)
                .gender(Gender.FEMALE)
                .eMail("bob@email.com")
                .phone("34365437563")
                .address("44 4th Str.")
                .city("New York")
                .state("KS")
                .code("123455")
                .build());
        return people;
    }
}
