package com.gabbriellps.strategy.pattern.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VehicleDataFileDTO {

    private Integer register;
    private String vehicle;
    private String type;
    private String model;
    private String brand;
    private String color;
    private String year;
    private String hp;
    private String plate;

}
