package com.fortifydata.CodingExercise.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class IpAddress {

    @Id
    private Long id;

    private String address;

    private String userEmail;

}