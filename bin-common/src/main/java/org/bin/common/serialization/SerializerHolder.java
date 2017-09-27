package org.bin.common.serialization;

import org.bin.common.spi.BaseServiceLoader;

/**
 * Created by zhangbb on 17/9/25.
 */
public class SerializerHolder {
    private static final Serializer serializer = BaseServiceLoader.load(Serializer.class);

    public static Serializer serializerImpl(){
        return serializer;
    }
}
