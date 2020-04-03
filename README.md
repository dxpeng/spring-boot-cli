# spring-boot-cli
spring boot 项目开发脚手架

#### 配置文件中自定义属性
```
定义属性
my.name=xpit
my.address=深圳

读取属性
@Value("${my.name}")
private String name;

@Value("${my.address}")
private String address;

中文乱码问题解决：
settings -> file encodings -> 设置 utf-8


```
