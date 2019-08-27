//package cn.opm.vue_server_api.util;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import redis.clients.jedis.JedisPoolConfig;
//
//@Configuration
//public class RedisConfig {
//
//    @Value("${spring.redis.host}")
//    private String host;
//    @Value("${spring.redis.port}")
//    private int port;
//    @Value("${spring.redis.database}")
//    private int database;
//    @Value("${spring.redis.timeout}")
//    private int timeout;
//    @Value("${spring.redis.jedis.pool.max-active}")
//    private int maxTotal;
//    @Value("${spring.redis.jedis.pool.max-wait}")
//    private int maxWaitMillis;
//    @Value("${spring.redis.jedis.pool.max-idle}")
//    private int maxIdle;
//    @Value("${spring.redis.jedis.pool.min-idle}")
//    private int minIdle;
//
//    @Bean
//    public JedisPoolConfig getRedisConfig() {
//        JedisPoolConfig config = new JedisPoolConfig();
//        config.setMaxWaitMillis(maxWaitMillis);
//        config.setMaxTotal(maxTotal);
//        config.setMinIdle(minIdle);
//        config.setMaxIdle(maxIdle);
//        return config;
//    }
//
//    @Bean(name = "jedisConnectionFactory")
//    public JedisConnectionFactory getConnectionFactory(){
//        JedisConnectionFactory factory = new JedisConnectionFactory();
//        JedisPoolConfig config = getRedisConfig();
//        factory.setPoolConfig(config);
//        factory.setHostName(host);
//        factory.setPort(port);
//        factory.setDatabase(database);
//        factory.setTimeout(timeout);
//        return factory;
//    }
//
//    @Bean(name = "redisTemplate")
//    public RedisTemplate<?, ?> getRedisTemplate(){
//        RedisTemplate<?,?> template = new StringRedisTemplate(getConnectionFactory());
//        return template;
//    }
//}
//
//
//
//
//
