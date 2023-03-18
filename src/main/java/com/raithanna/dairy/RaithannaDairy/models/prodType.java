package com.raithanna.dairy.RaithannaDairy.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class prodType {
    @Id
    @GeneratedValue
    private int id;
    private String pTypeCode;
    private String pTypeName;
    private String document;
    private String pTypeLabel;
    private String pTypeimageName;
}
