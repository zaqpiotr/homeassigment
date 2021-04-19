package com.homeassignment.drugs.submitteddrugs.domain.responsemodel.paging;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PagingResult {
  private Integer skip;
  private Integer limit;
  private Integer total;
}
