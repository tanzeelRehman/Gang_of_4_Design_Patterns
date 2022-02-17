package builder;

public class Customer {
    public String name;
    public String firstName;
    public String lastName;
    public int age;
    public String address;
    public String city;
    public String mobileNumber;
    public String pincode;

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getPincode() {
        return pincode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }

    private Customer(CustomerBuilder customerBuilder) {
        this.name = customerBuilder.name;
        this.firstName = customerBuilder.firstName;
        this.lastName = customerBuilder.lastName;
        this.pincode = customerBuilder.pincode;
        this.address = customerBuilder.address;
        this.mobileNumber = customerBuilder.mobileNumber;
        this.age = customerBuilder.age;
        this.city = customerBuilder.city;
    }

    public static class CustomerBuilder {
        private String name;
        private String firstName;
        private String lastName;
        private int age;
        private String address;
        private String city;
        private String mobileNumber;
        private String pincode;

        public CustomerBuilder() {
        }

        public CustomerBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CustomerBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public CustomerBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public CustomerBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public CustomerBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public CustomerBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public CustomerBuilder setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public CustomerBuilder setPincode(String pincode) {
            this.pincode = pincode;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}