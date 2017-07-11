package cn.tr.qrcode.test;

import java.io.File;
import java.util.Hashtable;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;

/**
 * java生成二维码测试类
 * 
 * @author taorun
 * @date 2017年7月11日 上午9:54:49
 *
 */

public class TestQR {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws Exception {
		// 二维码内容
		String text = "http://www.baidu.com";
		// 二维码尺寸
		int width = 300;
		int height = 300;
		// 二维码的图片格式
		String format = "gif";
		Hashtable hints = new Hashtable();
		// 内容所使用编码
		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
		BitMatrix bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, width, height, hints);
		// 生成二维码
		File outputFile = new File("/Users/taorun" + File.separator + "new.png");
		QRUtil.writeToFile(bitMatrix, format, outputFile);
	}
	
}