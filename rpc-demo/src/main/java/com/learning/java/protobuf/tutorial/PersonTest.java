package com.learning.java.protobuf.tutorial;

/**
 * Created by ruhr on 2017/4/30.
 */
public class PersonTest {
    public static void main(String[] args) {
       AddressBookProtos.Person join =
               AddressBookProtos.Person.newBuilder()
                .setId(1234)
               .setName("Join")
               .setEmail("joe@example.com")
               .addPhones(
                       AddressBookProtos.Person.PhoneNumber.newBuilder()
                       .setNumber("555-4321")
                       .setType(AddressBookProtos.Person.PhoneType.HOME)
               ).build();
    }
}
