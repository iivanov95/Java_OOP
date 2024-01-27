package Lecture10_DesignPatterns;

public class Address {

    private String name;
    private String lastName;
    private String email;
    private String country;
    private String street;
    private String city;
    private String entrance;
    private String number;
    private String telephoneNumber;

    private Address(){}

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private Address address;
        private Builder(){
            this.address = new Address();
        }
        public Builder withName(String name){
            address.name = name;
            return this;
        }
        public Builder withLastName(String lastName){
            address.lastName = lastName;
            return this;
        }
        public Builder withCountry(String country){
            address.country = country;
            return this;
        }
        public Builder withEmail(String email){
            address.email = email;
            return this;
        }
        public Builder withCity(String city){
            address.city = city;
            return this;
        }

        public Builder withStreet(String street){
            address.street = street;
            return this;
        }
        public Builder withTelNumber(String telephoneNumber){
            address.telephoneNumber = telephoneNumber;
            return this;
        }
        public Builder withNumber(String number){
            address.number = number;
            return this;
        }
        public Builder withEntrance(String entrance){
            address.entrance = entrance;
            return this;
        }
        public Address build(){
            return address;
        }
    }
}
