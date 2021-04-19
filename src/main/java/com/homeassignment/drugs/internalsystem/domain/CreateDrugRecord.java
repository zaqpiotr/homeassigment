package com.homeassignment.drugs.internalsystem.domain;

import com.homeassignment.drugs.internalsystem.api.DrugRecordApiModel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateDrugRecord {

  private final DrugRecordRepository drugRecordRepository;
  private final DrugRecordMapper drugRecordMapper;

  public ResponseEntity create(DrugRecordApiModel drugRecordApiModel) {

    DrugRecordEntity drugRecordEntity = drugRecordMapper.apiToEntity(drugRecordApiModel);
    try {
      drugRecordRepository.save(drugRecordEntity);
      return ResponseEntity.ok("Drug saved");
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }
  }
}
