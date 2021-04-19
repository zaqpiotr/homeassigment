package com.homeassignment.drugs.submitteddrugs.domain.responsemodel;

import com.homeassignment.drugs.submitteddrugs.domain.responsemodel.paging.Meta;
import com.homeassignment.drugs.submitteddrugs.domain.responsemodel.submiteddrugmodel.Result;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OpenFDAResponse {

  private Meta meta;
  private List<Result> results;
}
