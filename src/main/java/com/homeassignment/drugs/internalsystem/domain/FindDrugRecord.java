package com.homeassignment.drugs.internalsystem.domain;

import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FindDrugRecord {

  private final DrugRecordMapper drugRecordMapper;
  private final DrugRecordRepository drugRecordRepository;

  public ResponseEntity find(String applicationNumber) {

    try {
      Optional<DrugRecordEntity> drugRecord = drugRecordRepository.findById(applicationNumber);
      if(drugRecord.isPresent()) {
        return ResponseEntity.ok(drugRecordMapper.entityToApi(drugRecord.get()));
      } else {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("There is no drug record for given application number");
      }
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }
  }
}
