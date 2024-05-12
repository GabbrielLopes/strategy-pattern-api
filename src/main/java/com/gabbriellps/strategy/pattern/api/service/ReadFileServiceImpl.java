package com.gabbriellps.strategy.pattern.api.service;

import com.gabbriellps.strategy.pattern.api.dto.VehicleDataFileDTO;
import com.gabbriellps.strategy.pattern.api.service.factory.ReadFileFactory;
import com.gabbriellps.strategy.pattern.api.service.interfaces.ReadFileService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ReadFileServiceImpl implements ReadFileService {

    private final transient ReadFileFactory readFileFactory;

    @Override
    public List<VehicleDataFileDTO> readFile(String file) {
        String formatFile = getFormatFile(file);

        return readFileFactory.getStrategy(formatFile).readFile(file);
    }

    private String getFormatFile(String file) {
        return file.substring(file.lastIndexOf(".") + 1);
    }
}
