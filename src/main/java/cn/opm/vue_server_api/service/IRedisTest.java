package cn.opm.vue_server_api.service;

import cn.opm.vue_server_api.entity.Book;

import java.util.List;

public interface IRedisTest {
    List<Book> getAllBooks();
}
