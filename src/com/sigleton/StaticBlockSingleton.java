package com.sigleton;

public class StaticBlockSingleton {
    private static final StaticBlockSingleton INSTANCE;

    private StaticBlockSingleton(){
    }
    // static block init for exception handling
    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}
