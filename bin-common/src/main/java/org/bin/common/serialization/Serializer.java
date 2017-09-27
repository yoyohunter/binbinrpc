package org.bin.common.serialization;

/**
 * Created by zhangbb on 17/9/25.
 */
public interface Serializer {
    /**
     * 将对象序列化成字节数组
     * @param obj
     * @param <T>
     * @return
     */
    <T> byte[] writeObject(T obj);

    /**
     * 将对象反序列化
     * @param bytes
     * @param clazz
     * @param <T>
     * @return
     */
    <T> T readObject(byte[] bytes,Class<T> clazz);

}
