package com.homeassignment.drugs.submitteddrugs.api;

import com.homeassignment.drugs.submitteddrugs.domain.SearchForDrugs;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/openfdadrugrecord")
@RequiredArgsConstructor
public class OpenFDASubmittedDrugsController {

  private final SearchForDrugs searchForDrugs;

  @GetMapping(value = "/manufacturer/{manufacturerName}")
  public ResponseEntity findSubmittedDrugsForManufacturer(
      @PathVariable String manufacturerName,
      @RequestParam(value = "skip", required = false) Integer skip,
      @RequestParam(value = "limit", required = false) Integer limit
  ) {
    return searchForDrugs.findSubmittedDrugs(manufacturerName, "", skip, limit);
  }

  @GetMapping(value = "/brandname/{brandName}")
  public ResponseEntity findSubmittedDrugsForBranName(
      @PathVariable String brandName,
      @RequestParam(value = "skip", required = false) Integer skip,
      @RequestParam(value = "limit", required = false) Integer limit
  ) {
    return searchForDrugs.findSubmittedDrugs("", brandName, skip, limit);
  }

}
