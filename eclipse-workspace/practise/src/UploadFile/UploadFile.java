package UploadFile;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.CommonService;

public class UploadFile {
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		UploadFile upload=new UploadFile();
		upload.uploadPdf();

	}
public void uploadPdf() throws InterruptedException, IOException {
	driver = CommonService.getChromeDriver();
	driver.get(Constant.WEB_ADDRESS);
	driver.findElement(By.xpath(Constant.SEARCH_PATH)).click();
	Thread.sleep(3000);
	Runtime.getRuntime().exec(Constant.FILE_ADDRESS);
	WebDriverWait wait=new WebDriverWait(driver, 10);
	
}

}

