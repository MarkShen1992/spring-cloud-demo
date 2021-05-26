package io.github.utils;

import io.github.pattern.ModelMapperSingleton;

/**
 * 实体类转换工具类
 * 
 * @author MarkShen
 * @see http://modelmapper.org/
 */
public class ModelMapperUtils {

    /**
     * 将 T 转换成 clazz
     */
    public static <T, E> E copyModelProperties(T t, Class<E> clazz) {
        return ModelMapperSingleton.getInstance().map(t, clazz);
    }
}
