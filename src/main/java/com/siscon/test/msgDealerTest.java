package com.siscon.test;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;
import com.siscon.config.KeyConfig;
import com.siscon.encode.MsgDealer;


public class msgDealerTest {
    public static void main(String[] args) {

        System.out.println(new MsgDealer().generateMsg("Hello sisconsavior,nice to meet you!\n55"));

        String error = new MsgDealer().generateMsg("org.apache.ibatis.binding.BindingException: Invalid bound statement (not found): com.spark.admindemo.mapper.RoleMapper.selectRoleByUser\n" +
                "\tat org.apache.ibatis.binding.MapperMethod$SqlCommand.<init>(MapperMethod.java:235) ~[mybatis-3.5.1.jar:3.5.1]\n" +
                "\tat com.baomidou.mybatisplus.core.override.MybatisMapperMethod.<init>(MybatisMapperMethod.java:49) ~[mybatis-plus-core-3.1.2.jar:3.1.2]\n" +
                "\tat com.baomidou.mybatisplus.core.override.MybatisMapperProxy.lambda$cachedMapperMethod$0(MybatisMapperProxy.java:66) ~[mybatis-plus-core-3.1.2.jar:3.1.2]\n" +
                "\tat java.util.concurrent.ConcurrentHashMap.computeIfAbsent(ConcurrentHashMap.java:1660) ~[na:1.8.0_121]\n" +
                "\tat com.baomidou.mybatisplus.core.override.MybatisMapperProxy.cachedMapperMethod(MybatisMapperProxy.java:66) ~[mybatis-plus-core-3.1.2.jar:3.1.2]\n" +
                "\tat com.baomidou.mybatisplus.core.override.MybatisMapperProxy.invoke(MybatisMapperProxy.java:61) ~[mybatis-plus-core-3.1.2.jar:3.1.2]\n" +
                "\tat com.sun.proxy.$Proxy126.selectRoleByUser(Unknown Source) ~[na:na]\n" +
                "\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_121]\n" +
                "\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_121]\n" +
                "\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_121]\n" +
                "\tat java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_121]\n" +
                "\tat org.springframework.aop.support.AopUtils.invokeJoinpointUsingReflection(AopUtils.java:343) ~[spring-aop-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.springframework.aop.framework.ReflectiveMethodInvocation.invokeJoinpoint(ReflectiveMethodInvocation.java:198) ~[spring-aop-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163) ~[spring-aop-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor.invoke(MethodBeforeAdviceInterceptor.java:56) ~[spring-aop-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:93) ~[spring-aop-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:212) ~[spring-aop-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat com.sun.proxy.$Proxy127.selectRoleByUser(Unknown Source) ~[na:na]\n" +
                "\tat com.spark.admindemo.service.UserServiceImpl.getUserById(UserServiceImpl.java:101) ~[classes/:na]\n" +
                "\tat com.spark.admindemo.controller.UserController.getUserById(UserController.java:104) ~[classes/:na]\n" +
                "\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_121]\n" +
                "\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_121]\n" +
                "\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_121]\n" +
                "\tat java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_121]\n" +
                "\tat org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:190) ~[spring-web-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:138) ~[spring-web-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:104) ~[spring-webmvc-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:892) ~[spring-webmvc-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:797) ~[spring-webmvc-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87) ~[spring-webmvc-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1039) ~[spring-webmvc-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:942) ~[spring-webmvc-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1005) ~[spring-webmvc-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.springframework.web.servlet.FrameworkServlet.doPost(FrameworkServlet.java:908) ~[spring-webmvc-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat javax.servlet.http.HttpServlet.service(HttpServlet.java:660) ~[tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:882) ~[spring-webmvc-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat javax.servlet.http.HttpServlet.service(HttpServlet.java:741) ~[tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:231) ~[tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:53) ~[tomcat-embed-websocket-9.0.19.jar:9.0.19]\n" +
                "\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:99) ~[spring-web-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107) ~[spring-web-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:92) ~[spring-web-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107) ~[spring-web-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.springframework.web.filter.HiddenHttpMethodFilter.doFilterInternal(HiddenHttpMethodFilter.java:93) ~[spring-web-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107) ~[spring-web-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:200) ~[spring-web-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107) ~[spring-web-5.1.7.RELEASE.jar:5.1.7.RELEASE]\n" +
                "\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193) ~[tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166) ~[tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:200) ~[tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:96) [tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:490) [tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:139) [tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:92) [tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:74) [tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:343) [tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:408) [tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:66) [tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:836) [tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1747) [tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_121]\n" +
                "\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_121]\n" +
                "\tat org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.19.jar:9.0.19]\n" +
                "\tat java.lang.Thread.run(Thread.java:745) [na:1.8.0_121]\n");

        FileWriter writer = new FileWriter(new KeyConfig().ERROR_PATH);
        writer.write(error);


        FileReader fileReader = new FileReader(new KeyConfig().ERROR_PATH);
        String result = fileReader.readString();

        String x = "WEIahTgKvcWMrQf1c+MKRLd24Dt7CXzgVTdDeBRc/Y6dSVUYihKeusQQ9C10CHUr";
        String x2 = "E0GVGBbC+/AJkWOCBpLq3BT9liAqjY7pCEKQdrrNEZA=";
        System.out.println(new MsgDealer().solveMsg(x));
        System.out.println(new MsgDealer().solveMsg(result));
    }
}
