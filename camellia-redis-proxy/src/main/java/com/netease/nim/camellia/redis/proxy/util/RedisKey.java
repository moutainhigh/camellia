package com.netease.nim.camellia.redis.proxy.util;

import redis.clients.util.SafeEncoder;

import java.util.Arrays;

/**
 *
 * Created by caojiajun on 2019/12/11.
 */
public class RedisKey {
    private byte[] key;

    public RedisKey(byte[] key) {
        this.key = key;
    }

    public byte[] getKey() {
        return key;
    }

    public void setKey(byte[] key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        RedisKey redisKey = (RedisKey) object;

        return Arrays.equals(key, redisKey.key);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(key);
    }

    @Override
    public String toString() {
        return SafeEncoder.encode(key);
    }
}
