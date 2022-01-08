package com.ranbom.testmerge.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.ranbom.testmerge.domain.po.PersonPO;
import com.ranbom.testmerge.mapper.PersonMapper;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PersonService extends IService<PersonPO> {

    ResponseEntity<List<PersonPO>> listAll();

}
