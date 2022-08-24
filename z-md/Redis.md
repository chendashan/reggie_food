Redis是一个基于内存的 key-value 结构数据库。

- 基于内存存储，读写性能高
- 适合存储热点数据（热点商品、资讯、新闻）
- 企业应用广泛

常见数据库分类  
关系型数据库：Mysql、Oracle、SQLServer、DB2  
非关系型数据库：Redis、Mongo db、MemCached

### 简介

Redis 是一个开源的内存中的数据结构存储系统，它可以用作：数据库、缓存和消息中间件。

也被称为NoSql (Not Only SQL)，泛指非关系型数据库，是关系型数据库的补充。

应用场景

- 缓存
- 任务队列
- 消息队列
- 分布式锁

key-value结构中，key是字符串类型，value有5种常用的数据类型

- 字符串 string
- 哈希 hash
- 列表 list
- 集合 set
- 有序集合 sorted set

### Java中操作Redis

**Spring Data Redis**
在Spring Boot项目中，可以使用Spring Data Redis来简化Redis操作，maven坐标：

```
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-redis</artifactId>
        </dependency>
```

Spring Data Redis 中提供了一个高度封装的类：RedisTemplate，针对jedis客户端中 大量api进行了归类封装，将同一类型操作封装为operation接口

- ValueOperations : 简单K-V操作
- SetOperations : set类型数据操作
- ZSetOperations : zset类型数据操作
- HashOperations : 针对map类型的数据操作
- ListOperations : 针对list类型的数据操作
