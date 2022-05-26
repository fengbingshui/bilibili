package com.zhu.config;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.HttpMessageConverter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhutao
 * @Classname JsonHttpMessageConverterConfig
 * @Description Json信息转换配置
 * @Date 2022/5/26 18:36
 * @Version V1.0
 */
public class JsonHttpMessageConverterConfig{

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        Object o = new Object();
        list.add(o);
        list.add(o);
        System.out.println(JSONObject.toJSONString(list));
        System.out.println(JSONObject.toJSONString(list,SerializerFeature.DisableCircularReferenceDetect));
    }


    @Bean
    @Primary
    public HttpMessageConverter fastJsonHttpMessageConverters(){
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setDateFormat("yyyy-MM-dd HH:mm:ss");
        fastJsonConfig.setSerializerFeatures(
                SerializerFeature.PrettyFormat, //JSON数据格式化
                SerializerFeature.WriteNullStringAsEmpty,
                SerializerFeature.WriteNullListAsEmpty,
                SerializerFeature.WriteMapNullValue,
                SerializerFeature.MapSortField, //排序，默认升序
                SerializerFeature.DisableCircularReferenceDetect //禁用循环引用
        );
        fastConverter.setFastJsonConfig(fastJsonConfig);
        return fastConverter;
    }
}
