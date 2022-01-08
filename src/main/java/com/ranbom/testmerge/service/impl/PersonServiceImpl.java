package com.ranbom.testmerge.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ranbom.testmerge.domain.po.PersonPO;
import com.ranbom.testmerge.mapper.PersonMapper;
import com.ranbom.testmerge.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, PersonPO> implements PersonService {

    @Override
    public ResponseEntity<List<PersonPO>> listAll() {
        return new ResponseEntity<>(list(), HttpStatus.OK);
    }
}
