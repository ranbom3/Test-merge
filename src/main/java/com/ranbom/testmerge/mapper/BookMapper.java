package com.ranbom.testmerge.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ranbom.testmerge.domain.po.BookPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper extends BaseMapper<BookPO> {
}
