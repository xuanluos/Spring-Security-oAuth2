package com.xuanluos.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author xuanLuos
 * @date 2019/4/28 22:03
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}