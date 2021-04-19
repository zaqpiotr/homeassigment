package com.homeassignment.drugs.submitteddrugs.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SearchForSubmittedDrugsQuery {
  private String manufacturerName;
  private String brandName;
  private Integer skip;
  private Integer limit;
}
