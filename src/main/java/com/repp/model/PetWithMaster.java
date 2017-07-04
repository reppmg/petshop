package com.repp.model;

import lombok.Data;

import java.sql.Date;

/**
 * Created by 1 on 04.07.2017.
 */
@Data
public class PetWithMaster {

    private String master_name;
    private String phone;
    private String mail;

    private Date birthdate;
    private String pet_name;
    private String  pet_type;

}
