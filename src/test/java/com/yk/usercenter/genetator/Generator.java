package com.yk.usercenter.genetator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class Generator {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/user_center?characterEncoding=utf8&useSSL=false";
        String username = "root";
        String password = "root";

        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("yangk") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D:\\Project\\JAVA\\user-center\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.yk.usercenter") // 设置父包名
                            .entity("model.entity")
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D:\\Project\\JAVA\\user-center\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("user");// 设置需要生成的表名
                })
                .execute();
    }

}
