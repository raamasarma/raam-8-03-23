package com.raithanna.dairy.RaithannaDairy.models;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class customer {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String code;
    @Max(10)
    private String mobileNo;
    private String Email;
    private int custno;

}
