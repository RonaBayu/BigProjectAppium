package objectPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class GroupChat {
//    private AndroidDriver<AndroidElement> driver;
    public GroupChat(AndroidDriver<AndroidElement> driver) {
//        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"type message...\"]")
    private AndroidElement messageField;
    public void clickMessageField(){
        messageField.click();
    }
    public void inputMessageField(String keyword){
        messageField.sendKeys(keyword);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@index=\"6\"]")
    private AndroidElement sendMessageButton;
    public void clickSendMessageButton(){
        sendMessageButton.click();
    }
    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View/android.view.View[4]")
    private AndroidElement attachFileButton;
    public void clickAttachFileButton(){
        attachFileButton.click();
    }
    @AndroidFindBy(accessibility = "Document & Video")
    private AndroidElement attachDocumentVideoButton;
    public void clickAttachDocumentVideoButton(){
        attachDocumentVideoButton.click();
    }
    @AndroidFindBy(accessibility = "Image from Camera")
    private AndroidElement attachImagefromCameraButton;
    public void clickAttachImagefromCameraButton(){
        attachImagefromCameraButton.click();
    }
    @AndroidFindBy(accessibility = "Image from Gallery")
    private AndroidElement attachImagefromGalleryButton;
    public void clickAttachImagefromGalleryButton(){
        attachImagefromGalleryButton.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@index=\"3\"]")
    private AndroidElement mentionButton;
    public void clickMentionButton(){
        mentionButton.click();
    }
    @AndroidFindBy(accessibility = "mention all")
    private AndroidElement mentionAllButton;
    public void clickMentionAllButton(){
        mentionAllButton.click();
    }

    @AndroidFindBy(accessibility = "Shutter")
    private AndroidElement shutterCameraButton;
    public void clickShutterCameraButton(){
        shutterCameraButton.click();
    }
    @AndroidFindBy(accessibility = "Done")
    private AndroidElement checklistCameraButton;
    public void clickChecklistCameraButton(){
        checklistCameraButton.click();
    }
    @AndroidFindBy(id = "com.google.android.documentsui:id/icon_thumb")
    private AndroidElement image;
    public void clickImage(){
        image.click();
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=(\"Video.mp4\")]")
    private AndroidElement video;
    public void clickVideo(){
        video.click();
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=(\"File pdf.pdf\")]")
    private AndroidElement pdfFile;
    public void clickPdfFile(){
        pdfFile.click();
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=(\"File word.docx\")]")
    private AndroidElement wordFile;
    public void clickWordFile(){
        wordFile.click();
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=(\"File excel.xlsx\")]")
    private AndroidElement excelFile;
    public void clickExcelFile(){
        excelFile.click();
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=(\"Apk file.apk\")]")
    private AndroidElement apkFile;
    public void clickApkFile(){
        apkFile.click();
    }
    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Hello all!')]")
    private AndroidElement message;
    public void clickMessage(){
        message.click();
    }

    public void messageIsDisplayed(){
        message.isDisplayed();
    }

    @AndroidFindBy(accessibility = "Delete")
    private AndroidElement deleteMessage;
    public void clickDeleteMessage(){
        deleteMessage.click();
    }
    @AndroidFindBy(accessibility = "Ok")
    private AndroidElement okDeleteMessage;
    public void clickOkDeleteMessage(){
        okDeleteMessage.click();
    }

}
