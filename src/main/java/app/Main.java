package app;

import com.alibaba.fastjson.JSONObject;
import net.Postman;

import java.io.IOException;

/**
 * @Author lyr
 * @create 2019/9/30 0:28
 */
public class Main {

    public static void main(String[] args) throws IOException {
        JSONObject obj = Postman.doGet("44444","44444444");
        System.out.println(obj);
        System.out.println(obj.getString("flag"));
    }


}
