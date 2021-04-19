package com.homeassignment.drugs.submitteddrugs.domain.responsemodel.submiteddrugmodel;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OpenFDA {

  private List<String> application_number;
  private List<String> brand_name;
  private List<String> generic_name;
  private List<String> manufacturer_name;
  private List<String> product_ndc;
  private List<String> product_type;
  private List<String> route;
  private List<String> substance_name;
  private List<String> rxcui;
  private List<String> spl_id;
  private List<String> spl_set_id;
  private List<String> package_ndc;
  private List<String> nui;
  private List<String> pharm_class_epc;
  private List<String> pharm_class_cs;
  private List<String> unii;

}
