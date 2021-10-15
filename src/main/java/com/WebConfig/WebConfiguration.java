package com.WebConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class WebConfiguration extends WebSecurityConfigurerAdapter {

    @Value("${file.imagesPath}")
    private String filePath;

//    @Bean
//    public MultipartConfigElement multipartConfigElement(){
//        MultipartConfigFactory factory = new MultipartConfigFactory();
//
//        factory.setMaxFileSize(DataSize.parse("1024MB"));
//        factory.setMaxRequestSize(DataSize.parse("1024MB"));
//        return factory.createMultipartConfig();
//
//    }

//    public void addResourceHandlers(ResourceHandlerRegistry registry){
//
//        if (filePath.equals("") || filePath.equals("${file.imagesPath}")){
//            String filesPath = WebConfiguration.class.getClassLoader().getResource("").getPath();
//            if (filesPath.indexOf(".jar") > 0){
//                filesPath = filesPath.substring(0, filesPath.indexOf(".jar"));
//            }else if(filesPath.indexOf("classes") > 0){
//                filesPath = filesPath.substring(0, filesPath.indexOf("classes"));
//            }
//            filesPath = filesPath.substring(0, filesPath.lastIndexOf("/")) + "/images/";
//            filePath = filesPath;
//        }
//        System.out.println("filePath :" + filePath + "\n");
//
//        registry.addResourceHandler("/images/**").addResourceLocations(filePath);
//        super.addResourceHandlers(registry);
//    }
}