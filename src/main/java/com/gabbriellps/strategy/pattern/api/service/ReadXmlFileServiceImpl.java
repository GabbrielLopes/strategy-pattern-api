package com.gabbriellps.strategy.pattern.api.service;

import com.gabbriellps.strategy.pattern.api.dto.VehicleDataFileDTO;
import com.gabbriellps.strategy.pattern.api.service.strategy.ReadFileStrategy;
import com.gabbriellps.strategy.pattern.api.util.Util;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ReadXmlFileServiceImpl implements ReadFileStrategy {

    @Override
    public List<VehicleDataFileDTO> readFile(String file) {
        log.info("Iniciando leitura de arquivo xml...");
        log.info("Nome arquivo: {}", file.substring(0, file.indexOf(".")));

        List<VehicleDataFileDTO> mockFileData = Util.getMockDataVehicleDTO();
        log.info("Leitura realizada com sucesso!");

        return mockFileData;
    }

    @Override
    public String getFormatFile(){
        return "xml";
    }

}
