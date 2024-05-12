package com.gabbriellps.strategy.pattern.api.service.interfaces;

import com.gabbriellps.strategy.pattern.api.dto.VehicleDataFileDTO;

import java.util.List;

public interface ReadFileService {

    List<VehicleDataFileDTO> readFile(String file);

}
