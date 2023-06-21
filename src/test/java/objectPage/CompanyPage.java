package objectPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage {
    public CompanyPage(AndroidDriver<AndroidElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
//    @AndroidFindBy(accessibility = "Big Project Team\n" +
//            "This is for big project only.")
//    private AndroidElement bigProjectTeam;

    @AndroidFindBy(accessibility = "Sekolah QA 17\n" +
            "Tempat kumpul seluruh Siswa dan Instruktur Sekolah QA Batch 17")
    private AndroidElement bigProjectTeam;

    public void clickBigProjectTeam(){
        bigProjectTeam.click();
    }
}
