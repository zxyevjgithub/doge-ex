package com.doge.exchange.center.manager.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RedisLockManager {

    /**
     * 数据库操作时加锁时间, 单位: 秒
     */
    private static final int REDIS_LOCK_TIME = 5;

    @Autowired
    private RedisManager redisManager;


    /**
     * redis加锁
     * 到期自动释放锁
     *
     * @param lockKey redis lock key
     */
    public boolean lockExpired(String lockKey) {
        if (StringUtils.isBlank(lockKey)) {
            return false;
        }
        return redisManager.setIfNotExists(
                lockKey, StringUtils.EMPTY, REDIS_LOCK_TIME);
    }


    /**
     * redis加锁
     * 到期自动释放锁
     *
     * @param lockKey redis lock key
     * @param seconds redis lock time
     */
    public boolean lock(String lockKey, int seconds) {
        if (StringUtils.isBlank(lockKey)) {
            return false;
        }
        return redisManager.setIfNotExists(
                lockKey, StringUtils.EMPTY, seconds);
    }

    /**
     * redis加锁
     * 到期自动释放锁
     *
     * @param lockKey redis lock key
     * @param seconds redis lock time
     */
    public void checkLock(String lockKey, int seconds) {
        if (StringUtils.isBlank(lockKey)) {
            throw new RuntimeException();
        }
        boolean lock = redisManager.setIfNotExists(
                lockKey, StringUtils.EMPTY, seconds);
        if (!lock) {
            throw new RuntimeException();
        }
    }


    /**
     * redis解锁
     *
     * @param lockKey redis lock key
     */
    public void unLock(String lockKey) {
        if (StringUtils.isBlank(lockKey)) {
            return;
        }
        redisManager.delete(lockKey);
    }
}
