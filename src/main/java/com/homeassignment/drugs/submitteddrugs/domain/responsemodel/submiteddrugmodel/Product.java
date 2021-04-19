package com.homeassignment.drugs.submitteddrugs.domain.responsemodel.submiteddrugmodel;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

  private String product_number;
  private String reference_drug;
  private String brand_name;
  private List<ActiveIngredients> active_ingredients;
  private String reference_standard;
  private String dosage_form;
  private String route;
  private String marketing_status;
  private String te_code;
}
