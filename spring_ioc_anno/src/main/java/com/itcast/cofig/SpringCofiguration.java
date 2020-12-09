package com.itcast.cofig;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration  //用于指定当前类是一个 Spring   配置类，当创建容器时会从该类上加载注解
//<context:component-scan base-package="com.itcast"/>
@ComponentScan("com.itcast")   //用于指定 Spring   在初始化容器时要扫描的包。作用和在Spring的x ml 配置文件中的一样

@Import(DataSourceCofiguration.class)
public class SpringCofiguration {

}
