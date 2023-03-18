package com.raithanna.dairy.RaithannaDairy.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class saleOrder {
    @Id
    @GeneratedValue
    private Integer id;
    private String branch;
    private String custCode;
    private String name;
    private LocalDate date;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDate createDate;
    private String shift;
    private Integer orderNo;
    private double disc;
    private double comm;
    private double amount;
    private double unitRate;
    private double netAmount;
    private double OsAmount;
    private double WAmount;
    private String remove;
    private String remarks;
    private String entryUser;
    private String updUser;
    private Date updatedd;
    private Date createdd;
    private String recptNo;
    @UpdateTimestamp
    @Column(insertable = false)
    private Date recDate;
    private String customerName;
    private String sourcedata;

    private String totAmount;
    private String totDisc;
    private String totNetAmount;


}
