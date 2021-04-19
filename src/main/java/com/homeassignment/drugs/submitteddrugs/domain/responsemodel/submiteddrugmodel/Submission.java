package com.homeassignment.drugs.submitteddrugs.domain.responsemodel.submiteddrugmodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Submission {

  private String submission_type;
  private String submission_number;
  private String submission_status;
  private String submission_status_date;
  private String review_priority;
  private String submission_class_code;
  private String submission_class_code_description;
}
