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
