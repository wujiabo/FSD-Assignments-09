package com.wujiabo.fsd.controller;

import com.wujiabo.fsd.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DBController {
    @Autowired
    private DBService dbService;


    @GetMapping(value = "/dbVersion")
    public String dbVersion(){
        String version = dbService.dbVersion();
        return "MYSQL version is " + version;
    }
}
