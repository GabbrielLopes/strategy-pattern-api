package com.gabbriellps.strategy.pattern.api.service.strategy;

import com.gabbriellps.strategy.pattern.api.dto.VehicleDataFileDTO;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ReadFileStrategy {

    List<VehicleDataFileDTO> readFile(String file);

    String getFormatFile();
}
