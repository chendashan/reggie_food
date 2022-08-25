### DTO

dto（资料）：用于封装页面提交的数据

DTO，全称 Data Transfer Object，即数据传输对象，一般用于展示层与服务层之间的数据传输。

## Spring Cache

@EnableCaching : 开启缓存注解功能

@Cacheable : 在方法执行前spring先查看缓存中是否有数据，有就读缓存，没有就存到缓存中

@CachePut : 将方法中的返回值放到缓存中

@CacheEvict : 将一条或多条数据从缓存中删除