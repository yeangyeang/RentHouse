package com.sxt.renthouse.utils;

/**  
 * ��֤��������
 * @author xujia
 * @Title: http://www.smschinese.cn/api.shtml
 * @date 2011-3-22
 * @version V1.2  
 */
public class GainCode {
	//��ȡ�ĵ绰����
	private static String tel;
	private static int number;
	//�û���
	private static String Uid = "huihui122025";
	
	//�ӿڰ�ȫ��Կ
	private static String Key = "huihui1220";
	
	//�ֻ����룬���������13800000000,13800000001,13800000002
	private static String smsMob;
	
	//��������
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
		String s = "��֤�룺"+number;
		smsText = s;
		//GBK����
		int resultGbk = client.sendMsgGbk(Uid, Key, smsText, smsMob);
		if(resultGbk>0){
			System.out.println("GBK�ɹ���������=="+resultGbk);
		}else{
			System.out.println(client.getErrorMsg(resultGbk));
		}
	}
	
//	public static void main(String[] args) {
//		
//		HttpClientUtil client = HttpClientUtil.getInstance();
//		
//		//GBK����
//		int resultGbk = client.sendMsgGbk(Uid, Key, smsText, smsMob );
//		if(resultGbk>0){
//			System.out.println("GBK�ɹ���������=="+resultGbk);
//		}else{
//			System.out.println(client.getErrorMsg(resultGbk));
//		}
//	}
}
