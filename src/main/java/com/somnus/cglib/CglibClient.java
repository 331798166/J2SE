package com.somnus.cglib;

/** 
 * @description: TODO 
 * @author Somnus
 * @date 2015年3月9日 上午9:05:41  
 */
public class CglibClient {
	public static void main(String[] args) {
	    CglibProxy cglib = new CglibProxy();
	    
		ProxyObject proxy = (ProxyObject)cglib.getProxy(new ProxyObject());
		proxy.doSomething();
		
		
		ProxyObject proxy2 = (ProxyObject)cglib.getProxy(ProxyObject.class);
		proxy2.doSomething();
	}
}
