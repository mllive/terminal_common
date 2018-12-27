package com.terminal.common.utils.redis;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisPoolUtil {
	private static volatile JedisPool jedisPool = null;

	private JedisPoolUtil() {
	}

	public static JedisPool getJedisPoolInstance(String ip, String password) {
		if (null == jedisPool) {
			synchronized (JedisPoolUtil.class) { // 这里使用双端检测设计模式
				if (null == jedisPool) {
					JedisPoolConfig poolConfig = new JedisPoolConfig();
					// 控制一个pool可分配多少个jedis实例，通过pool.getResource()来获取；如果赋值为-1，则表示不限制，
					// 如果pool已经分配了maxActive个jedis实例，则此时pool的状态为exhausted
					poolConfig.setMaxTotal(1000);
					poolConfig.setMaxIdle(32); // 设置剩余连接各数，如果小于这个就会抛异常
					// 表示当borrow一个jedis实例时，最大的等待时间，如果超过等待时间，则直接抛JedisConnectionException
					poolConfig.setMaxWaitMillis(100 * 1000);
					// 获得一个jedis实例的时候是否检查连接可用性(ping()),如果为true，则得到的jedis实例均是可用的
					poolConfig.setTestOnBorrow(true);
					jedisPool = new JedisPool(poolConfig, ip, 6379, 3000, password);
				}
			}
		}
		return jedisPool;
	}

	/**
	 * 释放
	 * 
	 * @param jedisPool
	 *            释放哪个池中
	 * @param jedis
	 *            的哪个对象
	 */
	// public static void release(JedisPool jedisPool, Jedis jedis) {
	// if (null != jedis) {
	// jedisPool.returnResourceObject(jedis);
	// }
	// }
}
