package com.iwsx.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/*
* 安全配置
* 主要内容：
*   用户信息、密码编码器、安全拦截机制
* */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

  //配置用户信息服务（相当于查询用户信息）
  @Bean
  public UserDetailsService userDetailsServiceBean(){
    InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();

    manager.createUser(User.withUsername("zhangsan").password("123").authorities("p1").build());
    manager.createUser(User.withUsername("lisi").password("456").authorities("p2").build());
    return manager;
  }

  //密码编码器
  @Bean
  public PasswordEncoder passwordEncoder(){
    return NoOpPasswordEncoder.getInstance();
  }

  //配置安全拦截机制
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.csrf().disable() //屏蔽CSRF（Cross-site request forgery跨站请求伪造），即不再限制CSRF
            .authorizeRequests()
            .antMatchers("/r/r1").hasAuthority("p1")
            .antMatchers("/r/r2").hasAuthority("p2")
            .antMatchers("/r/**").authenticated() //所有/r/**的请求必须认证通过
            .anyRequest().permitAll()//其他访问，可以放行
            .and()
            .formLogin() //允许表单登录
            .loginPage("/login-view") //指定我们自己的登录页面，spring security以重定向方式跳转到/login-view
            .loginProcessingUrl("/login") //指定登录处理的URL，也就是用户名、密码表单提交的目的路径
            .successForwardUrl("/login-success")//指定登录成功后跳转的URL
            .permitAll(); //formLogin().permitAll() 允许任意用户访问基于表单登录的所有URL，允许所有用户访问我们的登录页面

  }
}
