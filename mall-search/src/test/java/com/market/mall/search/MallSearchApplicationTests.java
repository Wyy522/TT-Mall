package com.market.mall.search;

import com.alibaba.fastjson.JSON;
import com.market.mall.search.config.mallElasticSearchConfig;
import lombok.Data;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallSearchApplicationTests {
    @Autowired
    private RestHighLevelClient client;

    @Test
    public void indexData() throws IOException {
        IndexRequest indexRequest =new IndexRequest("users","String");
        indexRequest.id("1");
        User user = new User();
        user.setUsername("zhangsan");
        user.setAge(11);
        user.setGender("nan");
        String jsonString = JSON.toJSONString(user);
        indexRequest.source(jsonString, XContentType.JSON);//要保存的内容

        //执行操作
        IndexResponse index =client.index(indexRequest,mallElasticSearchConfig.COMMON_OPTIONS);

        System.out.println(index);
    }

   class  User{
        private   String  username;
        private  Integer age;
        private  String gender;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    }
    @Test
    public void
    contextLoads() {
        System.out.println(client);
    }

}
