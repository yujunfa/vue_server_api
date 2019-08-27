package cn.opm.vue_server_api.entity;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * 用户实体类
 */
public class User implements Serializable {
    private static final long serialVersionUID = 8369629456025732830L;
    @Id
    private Long id;
    private String username;
    private Integer age;

    public User(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
