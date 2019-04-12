package com.pbf.lil.jdbc;

import com.pbf.lil.jdbc.util.DataTransferObject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer implements DataTransferObject {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zipCode;

}
