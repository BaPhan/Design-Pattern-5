package com.sigleton;

public class ThreadSafeInitSingleton {
    private static volatile ThreadSafeInitSingleton instance;

    private ThreadSafeInitSingleton(){}

    public static synchronized ThreadSafeInitSingleton getInstance(){
        if (instance == null) {
            instance = new ThreadSafeInitSingleton();
        }
        return instance;
    }
}
