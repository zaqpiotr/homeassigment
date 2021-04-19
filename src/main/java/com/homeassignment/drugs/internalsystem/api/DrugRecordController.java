package com.homeassignment.drugs.internalsystem.api;

import com.homeassignment.drugs.internalsystem.domain.CreateDrugRecord;
import com.homeassignment.drugs.internalsystem.domain.FindDrugRecord;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drugrecord")
@RequiredArgsConstructor
public class DrugRecordController {

  private final CreateDrugRecord createDrugRecord;
  private final FindDrugRecord findDrugRecord;

  @PostMapping(value = "/create")
  public ResponseEntity create(@RequestBody DrugRecordApiModel drugRecordApiModel) {
    return createDrugRecord.create(drugRecordApiModel);
  }

  @GetMapping(value = "/search/{applicationNumber}")
  public ResponseEntity find(@PathVariable String applicationNumber) {
    return findDrugRecord.find(applicationNumber);
  }

}
