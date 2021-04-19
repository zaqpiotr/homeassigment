package com.homeassignment.drugs.submitteddrugs.domain.responsemodel.submiteddrugmodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActiveIngredients {
  private String name;
  private String strength;
}
