package com.gabbriellps.strategy.pattern.api.util;

import com.gabbriellps.strategy.pattern.api.dto.VehicleDataFileDTO;

import java.util.Arrays;
import java.util.List;

public abstract class Util {

    public static List<VehicleDataFileDTO> getMockDataVehicleDTO(){
        VehicleDataFileDTO vehicle = VehicleDataFileDTO.builder()
                .register(1)
                .vehicle("Marea Turbo")
                .model("SX 2.4 20v")
                .brand("Fiat")
                .color("Green")
                .plate("ABC1234")
                .type("car")
                .hp("130")
                .year("2017")
                .build();

        return Arrays.asList(vehicle);
    }

}
