package ru.tsypaev.patterns.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {

    static class RobotProxy implements InvocationHandler{

        private int liveShield = 3;
        private Object obj;

        public static Object newInstance(Object obj) {
            return Proxy.newProxyInstance(
                    obj.getClass().getClassLoader(),
                    obj.getClass().getInterfaces(),
                    new RobotProxy(obj));
        }

        private RobotProxy(Object obj) {
            this.obj = obj;
        }

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if (method.getName().equals("damage")){
                if(liveShield>0){
                liveShield--;
                return obj;
                } else {
                    return method.invoke(obj,args);
                }
            } else {
                return method.invoke(obj,args);
            }

        }
    }
}
