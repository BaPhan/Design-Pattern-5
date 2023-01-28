package com.sigleton;

public class BillPughSingleton {
    private BillPughSingleton(){

    }
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
    //nested class
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
}
