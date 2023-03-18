package com.raithanna.dairy.RaithannaDairy.models;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class dailySales {
    @Id
    @GeneratedValue
    private Integer id;
    private String  name;
    private LocalDate date;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDate  creationDate;
    @UpdateTimestamp
    @Column(insertable = false)
    private LocalDateTime recDate;
    private Integer orderNo;
    private String prodCode;
    private String custCode;
    private Double disc;
    private Double netAmount;
    private Double amount;
    private Double quantity;
    private Double unitRate;
    private Double totAmount;
    private Double totDisc;
    private Double totNetAmount;
    private String branch;
    private String custType;
    private String couponCode;
    private double comm;
    private String ZoneCode;
    private String SaleExecCode;
    private String remove;
    private String remarks;
    private String entryUser;
    private String updUser;
    private Date updatedd;
    private Date createdd;
    private String recptNo;
    private String customerName;
    private String sourcedata;

}

