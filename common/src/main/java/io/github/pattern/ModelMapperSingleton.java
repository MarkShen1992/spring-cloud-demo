package io.github.pattern;

import org.modelmapper.ModelMapper;

public class ModelMapperSingleton {

    private static class SingletonHolder {
        private static ModelMapper INSTANCE;

        public static ModelMapper getInstance() {
            if (null == INSTANCE) {
                INSTANCE = new ModelMapper();
            }
            return INSTANCE;
        }
    }

    public static ModelMapper getInstance() {
        return SingletonHolder.getInstance();
    }
}
