package com.homeassignment.drugs.internalsystem.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DrugRecordApiModel {

private String applicationNumber;
private String manufacturerName;
private String substanceName;
private String allProductNumbers;
}
