class Versions {
    static final String springBoot = '2.5.6'
    static final String springCloud = '2020.0.4'
    static final String springCloudGateway = '3.0.2'
    static final String springCloudGatewayNetflix = '2.2.5.RELEASE'
    static final String springCloudAlibaba = '2.2.2.RELEASE'
    static final String openFeign = '3.0.3'
    static final String lombok = '1.18.12'
    static final String mybatisPlus = '3.4.3.4'
    static final String swagger2 = '2.9.2'
    static final String swaggerBootStrapUI = '1.9.6'
    static final String druid = '1.2.4'
    static final String hutool = '5.8.21'
    static final String javaJwt = '3.10.1'
    static final String commonsPool2 = '2.8.1'
    static final String jakartaValidationApi = '2.0.2'
    static final String flywayCore = '6.4.4'
    static final String mysqlConnectorJava = '8.0.21'
    static final String pagehelper = '5.3.2'
    static final String aspectjweaver = '1.9.6'
}

class Dependencies {
    static final String springBootStarterDataRedis = "org.springframework.boot:spring-boot-starter-data-redis:${Versions.springBoot}"
    static final String springBootStarterWeb = "org.springframework.boot:spring-boot-starter-web:${Versions.springBoot}"
    static final String springBootStarterJdbc = "org.springframework.boot:spring-boot-starter-jdbc:${Versions.springBoot}"
    static final String springBootStarterActuator = "org.springframework.boot:spring-boot-starter-actuator:${Versions.springBoot}"
    static final String springCloud = "org.springframework.cloud:spring-cloud-dependencies:${Versions.springCloud}"
    static final String springCloudAlibaba = "com.alibaba.cloud:spring-cloud-alibaba-dependencies:${Versions.springCloudAlibaba}"
    static final String nacosDiscovery = "com.alibaba.cloud:spring-cloud-starter-alibaba-nacos-discovery:${Versions.springCloudAlibaba}"
    static final String lombok = "org.projectlombok:lombok:${Versions.lombok}"
    static final String swagger = "io.springfox:springfox-swagger2:${Versions.swagger2}"
    static final String swaggerUI = "io.springfox:springfox-swagger-ui:${Versions.swagger2}"
    static final String swaggerBootStrapUI = "com.github.xiaoymin:swagger-bootstrap-ui:${Versions.swaggerBootStrapUI}"
    static final String mybatisPlus = "com.baomidou:mybatis-plus-boot-starter:${Versions.mybatisPlus}"
    static final String druid = "com.alibaba:druid-spring-boot-starter:${Versions.druid}"
    static final String hutoolAll = "cn.hutool:hutool-all:${Versions.hutool}"
    static final String javaJwt = "com.auth0:java-jwt:${Versions.javaJwt}"
    static final String commonsPool2 = "org.apache.commons:commons-pool2:${Versions.commonsPool2}"
    static final String jakartaValidationApi = "jakarta.validation:jakarta.validation-api:${Versions.jakartaValidationApi}"
    static final String flywayCore = "org.flywaydb:flyway-core:${Versions.flywayCore}"
    static final String mysqlConnectorJava = "mysql:mysql-connector-java:${Versions.mysqlConnectorJava}"
    static final String pagehelper = "com.github.pagehelper:pagehelper:${Versions.pagehelper}"
    static final String aspectjweaver = "org.aspectj:aspectjweaver:${Versions.aspectjweaver}"
    static final String openFeign = "org.springframework.cloud:spring-cloud-starter-openfeign:${Versions.openFeign}"
    static final String loadbalancer = "org.springframework.cloud:spring-cloud-starter-loadbalancer:${Versions.openFeign}"
}
