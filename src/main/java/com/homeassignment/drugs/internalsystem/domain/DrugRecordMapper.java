package com.homeassignment.drugs.internalsystem.domain;

import com.homeassignment.drugs.internalsystem.api.DrugRecordApiModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface DrugRecordMapper {
  DrugRecordEntity apiToEntity(DrugRecordApiModel drugRecordApiModel);
  DrugRecordApiModel entityToApi(DrugRecordEntity createDrugRecordApiObject);
}
