package org.bin.common.spi;

import java.util.ServiceLoader;

/**
 * Created by zhangbb on 17/9/25.
 */
public class BaseServiceLoader {
    public static <S> S load(Class<S> serviceClass){
        return ServiceLoader.load(serviceClass).iterator().next();
    }
}
