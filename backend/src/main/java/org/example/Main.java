package org.example;

import com.alibaba.fastjson.serializer.SerializeConfig.*;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.support.odps.udf.JSONArrayAdd;
import com.alibaba.fastjson.support.odps.udf.JSONTuple;

import java.io.File;


public class Main {
    public static void main(String[] args) throws Exception {
        jsonProcess(args);
        JSONPath jsonPath = new JSONPath("path");
        JSON json = new JSON() {
            @Override
            public String toString() {
                return super.toString();
            }
        };
        json.toJSONString();
        System.out.println(jsonPath.set(null, null));
        JSONTuple jsonTuple = new JSONTuple();
        jsonTuple.process(null);
        File file = new File("./1.txt");
        System.out.println(file.toPath());
    }

    public static void jsonProcess(String[] args) throws Exception {
        JSONArrayAdd jsonArrayAdd = new JSONArrayAdd();
        jsonArrayAdd.evaluate("abc", "./", (long) '3');
    }

    public ObjectSerializer getObjectWriter(Class<?> clazz, boolean create) {
        System.out.println("Hello world!");
        return null;
    }

    public ObjectSerializer getObjectWriter(Class<?> clazz) {
        return this.getObjectWriter(clazz, true);
    }

    public void config(Class<?> clazz, SerializerFeature feature, boolean value) {
        ObjectSerializer serializer = this.getObjectWriter(clazz, false);
    }
}