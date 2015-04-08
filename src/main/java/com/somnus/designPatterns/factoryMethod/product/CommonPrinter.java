package com.somnus.designPatterns.factoryMethod.product;

import com.somnus.designPatterns.factoryMethod.Printer;

/*
 * 普通打印机
 */
public class CommonPrinter extends Printer{
	private  final int MAX_CACHE_LINE = 10;
	private String[] printData = new String[MAX_CACHE_LINE];
	
	private int dataNum = 0;

	@Override
	public void getData(String msg){
		if(dataNum >= MAX_CACHE_LINE){
			System.out.println("输出队列已满,添加失败");
		}
		else{
			printData[dataNum++] = msg;
		}
	}

	@Override
	public void out(){
		while(dataNum>0){
			System.out.println("普通打印机打印: "+printData[0]);
			
			System.arraycopy(printData,1,printData,0,--dataNum);
		}
	}
}
