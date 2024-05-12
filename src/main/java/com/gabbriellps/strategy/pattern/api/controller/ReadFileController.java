package com.gabbriellps.strategy.pattern.api.controller;

import com.gabbriellps.strategy.pattern.api.service.interfaces.ReadFileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/file")
@RequiredArgsConstructor
public class ReadFileController {

    private final transient ReadFileService readFileService;


    @PostMapping("/read")
    public ResponseEntity<?> readFile(@RequestParam("file") String file){

        return ResponseEntity.status(HttpStatus.OK).body(readFileService.readFile(file));
    }


}
