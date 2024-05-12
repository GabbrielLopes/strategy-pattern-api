package com.gabbriellps.strategy.pattern.api.service.factory;

import com.gabbriellps.strategy.pattern.api.service.strategy.ReadFileStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Slf4j
public class ReadFileFactory {

    private final transient Map<String, ReadFileStrategy> services = new HashMap<>();

    public ReadFileFactory(Set<ReadFileStrategy> strategySet) {
        strategySet.forEach(strategy -> services.put(strategy.getFormatFile(), strategy));
    }

    public ReadFileStrategy getStrategy(String formatFile){
        ReadFileStrategy strategy = services.get(formatFile);
        if (Objects.isNull(strategy)){
            log.info("Erro, tipo de strategy não encontrado!");
            throw new IllegalArgumentException("Erro, formato de arquivo indisponível para leitura!");
        }

        return strategy;
    }

}
