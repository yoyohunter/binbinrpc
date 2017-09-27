package org.bin.common.serialization.proto;

import org.bin.common.serialization.Serializer;

/**
 * Created by zhangbb on 17/9/25.
 */
public class ProtoStuffSerializer implements Serializer{
    @Override
    public <T> byte[] writeObject(T obj) {
        return new byte[0];
    }

    @Override
    public <T> T readObject(byte[] bytes, Class<T> clazz) {
        return null;
    }
}
