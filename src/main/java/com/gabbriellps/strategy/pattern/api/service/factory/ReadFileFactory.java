package com.gabbriellps.strategy.pattern.api.service.factory;

import com.gabbriellps.strategy.pattern.api.service.strategy.ReadFileStrategy;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class ReadFileFactory {

    private final transient Map<String, ReadFileStrategy> services = new HashMap<>();

    public ReadFileFactory(Set<ReadFileStrategy> strategySet) {
        strategySet.forEach(strategy -> services.put(strategy.getFormatFile(), strategy));
    }

    public ReadFileStrategy getStrategy(String formatFile){
        return services.get(formatFile);
    }

}
