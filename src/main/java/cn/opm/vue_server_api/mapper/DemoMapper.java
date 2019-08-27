package cn.opm.vue_server_api.mapper;

import cn.opm.vue_server_api.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Mapper接口Demo
 */
@Mapper
@Repository
public interface DemoMapper {

    /**
     * 查找所有的用户
     * @return 用户列表
     */
    List<User> findAllUser();

    /**
     * 新增用户
     * @param user 新增用户信息
     * @return  受影响的行数
     */
    Integer add(User user);

    Integer update(@Param("name") String name, @Param("id") Long id);

    User findById(Integer id);
}
