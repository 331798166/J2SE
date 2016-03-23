/**
 * 
 */
package com.somnus.abstractt;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 
 * Copyright 2011-2016 B5M.COM. All rights reserved
 * @author:  Somnus
 * @version: 1.0
 * @createDate: 2016年3月23日 下午3:20:11 
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2016年3月23日       Somnus                              1.0            
 */
public class Client {
	
	private static List<AbstractHuman> list;
	
	static{
		Man man = new Man("A");
		Woman woman = new Woman("B");
		list = new ArrayList<AbstractHuman>();
		list.add(man);
		list.add(woman);
		//.......
	}
	
	public static AbstractHuman get(String type){
		for(int i = 0;i<list.size();i++){
			AbstractHuman human = list.get(i);
			if(human.isSupport(type)){
				return human;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		AbstractHuman human = get("A");
		human.办理银行业务();
	}

}
