package com.sxt.renthouse.utils;

import java.util.UUID;
/**
 * 自动生成id
 * @author xujia
 *
 */
public class CreateId {

	String id = UUID.randomUUID().toString().replaceAll("-", "");
	
}
