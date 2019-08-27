package cn.opm.vue_server_api.service.impl;

import cn.opm.vue_server_api.entity.Book;
import cn.opm.vue_server_api.mapper.RedisTest;
import cn.opm.vue_server_api.service.IRedisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RedisTestImpl implements IRedisTest {

    @Autowired
    private RedisTest redisTest;

    @Override
    public List<Book> getAllBooks() {
        return redisTest.findAllBook();
    }
}
