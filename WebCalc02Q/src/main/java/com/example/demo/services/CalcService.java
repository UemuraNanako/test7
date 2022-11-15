package com.example.demo.services;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class CalcService {

	public String calculateAdd(
			String NumA,
			String NumB

	)

	{
		BigDecimal AdA = new BigDecimal(NumA);
		BigDecimal AdB = new BigDecimal(NumB);
		BigDecimal AdR = AdA.add(AdB);
		String AdResult = AdR.toString();
		return AdResult;

	}

	//		割り算に関しては特殊なので注意
	//		
	//		ヒントとしてtry、catch構文も記載はしておきます。
	//		
	//		後は調べてね！

	//		try {
	//			BigDecimal AdR = 〇〇.〇〇(AdB);
	//			return AdR.toString();
	//		} catch (Exception e) {
	//			return "無限小数の答えになりました";
	//		}

	/*このコメントアウトは消さない方がいい
	 * これは無限少数の桁を設定する際に必要
	BigDecimal AdR = AdA.divide(AdB,7,RoundingMode.HALF_UP); //BigDecimal 〇〇= 〇〇.add(〇〇); これは足し算を書くとき
	String AdResult = AdR.toString();//toStringはクラスで定義されている文字列表現を返すメソッド
	return AdResult;
	*/

}
