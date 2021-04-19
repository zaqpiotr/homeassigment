package com.homeassignment.drugs.internalsystem.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class DrugRecordEntity {

  @Id
  private String applicationNumber;
  private String manufacturerName;
  private String substanceName;
  private String allProductsNumbers;

}
