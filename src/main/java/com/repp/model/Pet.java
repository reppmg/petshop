package com.repp.model;

import lombok.Data;

import java.util.Date;

/**
 * Created by 1 on 02.07.2017.
 */
@Data
public class Pet {

    Date birthdate;
    String name;
    String type;
}
