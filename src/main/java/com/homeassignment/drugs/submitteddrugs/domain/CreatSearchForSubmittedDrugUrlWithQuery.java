package com.homeassignment.drugs.submitteddrugs.domain;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class CreatSearchForSubmittedDrugUrlWithQuery {

  public String createUrl(SearchForSubmittedDrugsQuery searchForSubmittedDrugsQuery) {
    StringBuilder urlWithQueryStringBuilder = new StringBuilder();
    if(StringUtils.isNotEmpty(searchForSubmittedDrugsQuery.getManufacturerName())) {
      urlWithQueryStringBuilder.append("https://api.fda.gov/drug/drugsfda.json?search=openfda.manufacturer_name:");
      urlWithQueryStringBuilder.append(searchForSubmittedDrugsQuery.getManufacturerName());
    }
    if(StringUtils.isNotEmpty(searchForSubmittedDrugsQuery.getBrandName())) {
      urlWithQueryStringBuilder.append("https://api.fda.gov/drug/drugsfda.json?search=openfda.brand_name:");
      urlWithQueryStringBuilder.append(searchForSubmittedDrugsQuery.getBrandName());
    }
    if (searchForSubmittedDrugsQuery.getLimit() != null){
      urlWithQueryStringBuilder.append("&limit=");
      urlWithQueryStringBuilder.append(searchForSubmittedDrugsQuery.getLimit());
    }
    if (searchForSubmittedDrugsQuery.getSkip() != null){
      urlWithQueryStringBuilder.append("&skip=");
      urlWithQueryStringBuilder.append(searchForSubmittedDrugsQuery.getSkip());
    }

    return urlWithQueryStringBuilder.toString();
  }

}
