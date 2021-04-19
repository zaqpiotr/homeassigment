package com.homeassignment.drugs.submitteddrugs.domain;

import com.homeassignment.drugs.submitteddrugs.domain.responsemodel.OpenFDAResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class SearchForDrugs {

  private final RestTemplate restTemplate;
  private final CreatSearchForSubmittedDrugUrlWithQuery creatSearchForSubmittedDrugUrlWithQuery;

  public ResponseEntity findSubmittedDrugs(String manufacturerName, String brandName, Integer skip, Integer limit) {
    SearchForSubmittedDrugsQuery searchForSubmittedDrugsQuery = SearchForSubmittedDrugsQuery.builder()
        .manufacturerName(manufacturerName)
        .brandName(brandName)
        .skip(skip)
        .limit(limit)
        .build();

    String urlWithQuery = creatSearchForSubmittedDrugUrlWithQuery.createUrl(searchForSubmittedDrugsQuery);

    try {
      OpenFDAResponse openFDAResponse = restTemplate.getForObject(urlWithQuery, OpenFDAResponse.class);
      return ResponseEntity.ok(openFDAResponse);
    } catch (HttpClientErrorException e) {
      return ResponseEntity.status(e.getStatusCode()).body(prepareErrorMessage(searchForSubmittedDrugsQuery, e.getMessage()));
    }

  }

  private Object prepareErrorMessage(SearchForSubmittedDrugsQuery searchForSubmittedDrugsQuery, String message) {
    StringBuilder errorMessageStringBuilder = new StringBuilder("Error for request parameters: ");
    errorMessageStringBuilder.append(searchForSubmittedDrugsQuery.toString());
    errorMessageStringBuilder.append(", error message: ");
    errorMessageStringBuilder.append(message);
    return errorMessageStringBuilder.toString();
  }

}
