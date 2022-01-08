package com.ranbom.testmerge.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ranbom.testmerge.domain.po.BookPO;
import com.ranbom.testmerge.mapper.BookMapper;
import com.ranbom.testmerge.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, BookPO> implements BookService {

    private final BookMapper bookMapper;

    public BookServiceImpl(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }



}
