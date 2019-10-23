package com.wujiabo.fsd.service;

import com.wujiabo.fsd.mapper.DBMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBServiceImpl implements DBService {
    @Autowired
    private DBMapper dbMapper;

    @Override
    public String dbVersion() {
        return dbMapper.dbVersion();
    }
}
