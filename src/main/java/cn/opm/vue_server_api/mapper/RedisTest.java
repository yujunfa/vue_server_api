package cn.opm.vue_server_api.mapper;

import cn.opm.vue_server_api.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RedisTest {
    List<Book> findAllBook();
}
