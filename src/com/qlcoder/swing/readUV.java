package com.qlcoder.swing;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by swing on 2016/6/28.
 * task/752a
 * 统计访客数据
 */
public class readUV {
    public static void  main(String args[]) throws FileNotFoundException {
        File file = new File("D:/uv.txt");
        Set set = new HashSet<>();
        try {
            InputStreamReader reader = new InputStreamReader(
                    new FileInputStream(file),"utf-8");
            BufferedReader bufferReader = new BufferedReader(reader);
            String line = null;
            while ((line = bufferReader.readLine()) != null){
                String result[] = line.split(" ");
                set.add(result[1]);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("此文档记录了" + set.size() + "条访问数据！");

    }
}
