package builder;

/**
 * Created by gavin on 2017/11/9.
 */
public class User {

    private final String mFirstName;


    private final String mLastName;

    private final String mGender;

    private final int mAge;

    private final String mPhoneNo;

    private User(UserBuilder builder) {
        mFirstName = builder.firstName;
        mLastName = builder.lastName;
        mGender = builder.gender;
        mAge = builder.age;
        mPhoneNo = builder.phoneNo;
    }


    public String getmFirstName() {
        return mFirstName;
    }

    public String getmLastName() {
        return mLastName;
    }

    public String getmGender() {
        return mGender;
    }

    public int getmAge() {
        return mAge;
    }

    public String getmPhoneNo() {
        return mPhoneNo;
    }


    public static class UserBuilder {

        private final String firstName;

        private final String lastName;

        private  String gender;

        private int age;

        private String phoneNo;


        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }


        public UserBuilder gender(String gender) {
            this.gender = gender;

            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phoneNo) {
            this.phoneNo = phoneNo;

            return this;
        }

        public User build() {

            return new User(this);
        }
    }
}
