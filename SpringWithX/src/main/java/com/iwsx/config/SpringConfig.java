package com.iwsx.config;

import com.iwsx.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by iwsx on 2019/12/25
 */
@Configuration
@ImportResource("classpath:spring/spring-*.xml")
public class SpringConfig {

    @Bean
    public User user(){
        User user = new User();
        user.setId(1);
        user.setUserName("小明");
        return user;
    }

    /**
     * 自定义修改log4j配置文件路径
     * 需要增加log4j-core包的引用
     * @return
     */
//    @Bean
//    public static Logger logger(){
//        String path="properties/log4j.properties";//定义配置文件路径
//        URL url=SpringConfig.class.getClassLoader().getResource(path);//转化配置文件路径
//        try {
//            ConfigurationSource source = new ConfigurationSource(
//                    new FileInputStream(new File(url.getPath())),url);//找到配置文件
//            Configurator.initialize(null, source);//初始化配置
//        } catch (FileNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        Logger logger = Logger.getLogger(SpringConfig.class);
//        return logger;
//    }
}
