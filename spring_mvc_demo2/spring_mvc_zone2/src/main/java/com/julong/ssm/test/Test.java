package com.julong.ssm.test;

import redis.clients.jedis.Jedis;

public class Test {
	
	public static void main(String[] args) {
		Jedis jedis = new Jedis("127.0.0.1",6379);
		jedis.auth("admin123");
		System.out.println(jedis.ping());
	}

}
