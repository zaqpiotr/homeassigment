package com.homeassignment.drugs.submitteddrugs.domain.responsemodel.submiteddrugmodel;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {

  private List<Submission> submissions;
  private String application_number;
  private String sponsor_name;
  private OpenFDA openfda;
  private List<Product> products;
}
