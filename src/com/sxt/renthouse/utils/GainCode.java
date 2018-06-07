package com.sxt.renthouse.utils;

/**  
 * 验证码生成类
 * @author xujia
 * @Title: http://www.smschinese.cn/api.shtml
 * @date 2011-3-22
 * @version V1.2  
 */
public class GainCode {
	//获取的电话号码
	private static String tel;
	private static int number;
	//用户名
	private static String Uid = "huihui122025";
	
	//接口安全秘钥
	private static String Key = "huihui1220";
	
	//手机号码，多个号码如13800000000,13800000001,13800000002
	private static String smsMob;
	
	//短信内容
	private static String smsText;
	
	
	public GainCode(String tel,int number) {
		this.tel = tel;
        this.number = number;
		init();
	}
	
	
	private void init() {
		// TODO Auto-generated method stub
		HttpClientUtil client = HttpClientUtil.getInstance();
		smsMob = tel;
		String s = "验证码："+number;
		smsText = s;
		//GBK发送
		int resultGbk = client.sendMsgGbk(Uid, Key, smsText, smsMob);
		if(resultGbk>0){
			System.out.println("GBK成功发送条数=="+resultGbk);
		}else{
			System.out.println(client.getErrorMsg(resultGbk));
		}
	}
	
//	public static void main(String[] args) {
//		
//		HttpClientUtil client = HttpClientUtil.getInstance();
//		
//		//GBK发送
//		int resultGbk = client.sendMsgGbk(Uid, Key, smsText, smsMob );
//		if(resultGbk>0){
//			System.out.println("GBK成功发送条数=="+resultGbk);
//		}else{
//			System.out.println(client.getErrorMsg(resultGbk));
//		}
//	}
}
