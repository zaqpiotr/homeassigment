package com.homeassignment.drugs.submitteddrugs.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CreateOpenFDAUrlWithQueryTest {

  private CreatSearchForSubmittedDrugUrlWithQuery creatSearchForSubmittedDrugUrlWithQuery = new CreatSearchForSubmittedDrugUrlWithQuery();

  @Test
  void testForManufacturerName() {
    //given
    SearchForSubmittedDrugsQuery query = SearchForSubmittedDrugsQuery.builder()
        .manufacturerName("roche").build();

    //when
    String result = creatSearchForSubmittedDrugUrlWithQuery.createUrl(query);

    //then
    Assertions.assertEquals("https://api.fda.gov/drug/drugsfda.json?search=openfda.manufacturer_name:roche", result);
  }

}