package com.prince.springmvcregistrationform.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="UserDetails")
public class User {
    @Id
    private String name;
    private String username;
    private String email;
    private String phone;
    private String password;
    private String cpassword;
    private String gender;
}
