package com.lyy.usermanage;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import redis.clients.jedis.Jedis;

import javax.sql.DataSource;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class UsermanageApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsermanageApplication.class, args);
//		Jedis jedis = new Jedis("127.0.0.1");
//		System.out.println("服务正在运行"+jedis.ping());
//		//添加字符串
//		jedis.set("lyy","the first redis");
//		System.out.println("添加的字符串为+lyy----"+jedis.get("lyy"));
//		//添加list
//		jedis.lpush("list","redis");
//		jedis.lpush("list","java");
//		jedis.lpush("list","python");
//		List<String> list = jedis.lrange("list",0,3);
//		System.out.println("list 存储的结果"+list.get(0));
//		//添加set信息
//		jedis.sadd("setTest1","abc");
//		jedis.sadd("setTest1","abcd");
//		Set<String> stringSet = jedis.smembers("setTest1");
//		Iterator<String> it = stringSet.iterator();
//		while (it.hasNext()){
//			System.out.println("from set:"+it.next());
//		}
	}

}
