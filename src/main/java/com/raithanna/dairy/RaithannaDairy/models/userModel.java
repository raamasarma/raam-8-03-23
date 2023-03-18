package com.raithanna.dairy.RaithannaDairy.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Map;
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class userModel {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String username;
    private String password;
    private String email;
    private String role;
    private String branch;
    private String address;
    private String city;
    private String state;
    private String pincode;
    @Column(unique = true)
    private String mobile;


}
