package frametest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import common.CommonService;

public class FrameTest {
	WebDriver driver;
	public static void main(String[] args) {
		FrameTest frame=new FrameTest();
		frame.dragg$dropp();
		
																						//ERROR
	}																					//ERROR
	private void dragg$dropp() {
		driver = CommonService.getChromeDriver();
		driver.get(ConstantDrag$Drop.WEB_ADDRESS);
		driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		//driver.findElement(By.cssSelector(ConstantCSSPath.CSS_PATH_WINDOW_DRAGG)).click();
		Actions a =new Actions(driver);
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		
	}
}