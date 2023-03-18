package com.raithanna.dairy.RaithannaDairy.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class productMaster {
    @Id
    @GeneratedValue
    private int id;
    private String PCode;
    private String PName;
    private String prod_type;
    private String PStDate;
    private String PEndDate;
    private Double unitRate;
    private Double qtyFrom;
    private Double qtyto;
    private String active;
    private String remove;
    private String sourceData;
    private String prodLabel;
    private Double milkUnits;
    private String splCustCode;
    private String cont;
    private String UOM;
    private String HSN;
    private String prodQ;
    private String qtyL;
    private Double gstPercent;
    private String GStDate;
    private String GEndDate;
    public void mapToVariables(@NotNull Map product) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        // Int
        this.id = Integer.parseInt( product.get("id").toString());
        // Strings
        this.PCode = product.get("PCode").toString();
        this.PName = product.get("PName").toString();
        this.prod_type= product.get("prod_type").toString();
        this.prodLabel = product.get("prodLabel").toString();
        this.prodQ = product.get("prodQ").toString();
        this.active = product.get("active").toString();
        this.cont = product.get("cont").toString();
        this.UOM = product.get("UOM").toString();
        this.HSN = product.get("HSN").toString();
        this.splCustCode = product.get("splCustCode").toString();
        // Doubles
        this.unitRate = Double.parseDouble(product.get("unitRate").toString());
        this.qtyFrom = Double.parseDouble(product.get("qty_from").toString());
        this.qtyto = Double.parseDouble(product.get("qty_to").toString());
        this.milkUnits = Double.parseDouble(product.get("milkUnits").toString());
        this.gstPercent = Double.parseDouble(product.get("gstPercent").toString());
        // Dates
      //  this.PStDate = formatter.parse(product.get("PStDate").toString());
       // this.PEndDate = formatter.parse(product.get("PEndDate").toString());
//        this.GStDate = DateFormat.getDateInstance().parse(product.get("GStDate").toString());
//        this.GEndDate = DateFormat.getDateInstance().parse(product.get("GEndDate").toString());
    }

}
