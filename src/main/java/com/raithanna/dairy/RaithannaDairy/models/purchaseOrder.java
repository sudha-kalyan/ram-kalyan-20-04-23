package com.raithanna.dairy.RaithannaDairy.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Map;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class purchaseOrder extends DownloadSuperBean{
    @Id
    @GeneratedValue
    private Integer id;

    private LocalDate invDate;
    private Double quantity;
    private Double fatP;
    private Double snfP;
    private Double tsRate;

    private Double ltrRate;
    private String milkType;
    private String supplier;
    private String invNo;
    private LocalDate recDate;
    private Integer slNo;
    private Double amt;
    private String bankName;
    private String paymentStatus;
    private String VehicleNo;
    //private String format;
   public void mapToVariables(@NotNull Map purchase) throws ParseException {
       this.supplier = purchase.get("supplier").toString();
   }

}
