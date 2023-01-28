package com.sigleton;

public class DoubleCheckLockingSingleton {
    private static volatile DoubleCheckLockingSingleton instance;

    private DoubleCheckLockingSingleton(){}

    public static DoubleCheckLockingSingleton getInstance(){
        // Do something before get instance ...
        if (instance == null) {
            //Do the task too long before create instance ...
            //Block so other threads connot come into while init
            synchronized (DoubleCheckLockingSingleton.class){
                //re-check again,maybe another thread has init before
                if (instance == null){
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        //do something after get instance ...
        return instance;
    }
}
