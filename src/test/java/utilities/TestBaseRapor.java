package utilities;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> Ayse
>>>>>>> eefaef94da1ca4d010e2ccf3c59f1e1e6c2d4935
>>>>>>> c5e8bb6b75c6946a47b2689e6e7358f260bfbb2d

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD
=======

>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224
=======
>>>>>>> Ayse
>>>>>>> eefaef94da1ca4d010e2ccf3c59f1e1e6c2d4935
>>>>>>> c5e8bb6b75c6946a47b2689e6e7358f260bfbb2d
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
>>>>>>> 9dca7b638a4088fbb6ab179c49d9dfe605d329e1
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224
=======

>>>>>>> Ayse
>>>>>>> eefaef94da1ca4d010e2ccf3c59f1e1e6c2d4935
>>>>>>> c5e8bb6b75c6946a47b2689e6e7358f260bfbb2d
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

<<<<<<< HEAD
=======
<<<<<<< HEAD
public abstract class TestBaseRapor {
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c5e8bb6b75c6946a47b2689e6e7358f260bfbb2d
    public abstract class TestBaseRapor {
        protected static ExtentReports extentReports; //extent report'a ilk atamayi yapar
        protected static ExtentTest extentTest; // test pass veya failed gibi bilgileri kaydeder. Ayrica ekran resmi icin de kullaniriz
        protected static ExtentHtmlReporter extentHtmlReporter; // Html raporu duzenler
<<<<<<< HEAD

        // Test işlemine başlamadan hemen önce (test methodundan önce değil, tüm test işleminden önce)
        @BeforeTest(alwaysRun = true) // alwaysRun : her zaman çalıştır.
        public void setUpTest() {
            extentReports = new ExtentReports(); // Raporlamayi baslatir
=======
        // Test işlemine başlamadan hemen önce (test methodundan önce değil, tüm test işleminden önce)
        @BeforeTest(alwaysRun = true) // alwaysRun : her zaman çalıştır.
        public void setUpTest() {
            extentReports = new ExtentReports();//Raporlamayi baslatir
>>>>>>> c5e8bb6b75c6946a47b2689e6e7358f260bfbb2d
            //rapor oluştuktan sonra raporunuz nereye eklensin istiyorsanız buraya yazıyorsunuz.
            String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
            String filePath = System.getProperty("user.dir") + "/test-output/Rapor"+date+".html";
            //oluşturmak istediğimiz raporu (html formatında) başlatıyoruz, filePath ile dosya yolunu belirliyoruz.
            extentHtmlReporter = new ExtentHtmlReporter(filePath);
            extentReports.attachReporter(extentHtmlReporter);
<<<<<<< HEAD

=======
>>>>>>> c5e8bb6b75c6946a47b2689e6e7358f260bfbb2d
            // İstediğiniz bilgileri buraya ekeyebiliyorsunuz.
            extentReports.setSystemInfo("Enviroment","QA");
            extentReports.setSystemInfo("Browser", ConfigReader.getProperty("browser")); // chrome, firefox
            extentReports.setSystemInfo("Automation Engineer", "Mehmet");
            extentHtmlReporter.config().setDocumentTitle("Son Test");
<<<<<<< HEAD
            extentHtmlReporter.config().setReportName("TestNG Reports");
        }


        // Her test methodundan sonra eğer testte hata varsa, ekran görüntüsü alıp rapora ekliyor
        @AfterMethod(alwaysRun = true)
        public void tearDownMethod(ITestResult result) throws IOException {

=======
            extentHtmlReporter.config().setReportName("Bu rapor cok guzel");
        }
        // Her test methodundan sonra eğer testte hata varsa, ekran görüntüsü alıp rapora ekliyor
        @AfterMethod(alwaysRun = true)
        public void tearDownMethod(ITestResult result) throws IOException {
>>>>>>> c5e8bb6b75c6946a47b2689e6e7358f260bfbb2d
            if (result.getStatus() == ITestResult.FAILURE) { // eğer testin sonucu başarısızsa
                String screenshotLocation = ReusableMethods.getScreenshot(result.getName());
                extentTest.fail(result.getName());
                extentTest.addScreenCaptureFromPath(screenshotLocation);
                extentTest.fail(result.getThrowable());
            } else if (result.getStatus() == ITestResult.SKIP) { // eğer test çalıştırılmadan geçilmezse
                extentTest.skip("Test Case is skipped: " + result.getName()); // Ignore olanlar
            }
<<<<<<< HEAD
            Driver.closeDriver();
        }


=======
        //    Driver.closeDriver();
        }
>>>>>>> c5e8bb6b75c6946a47b2689e6e7358f260bfbb2d
        // Raporlandırmayı sonlandırmak icin
        @AfterTest(alwaysRun = true)
        public void tearDownTest() {
            extentReports.flush();
        }
    }

<<<<<<< HEAD
=======

=======
public abstract class TestBaseRapor {
<<<<<<< HEAD
    protected static ExtentReports extentReports; //extent report'a ilk atamayi yapar
    protected static ExtentTest extentTest; // test pass veya failed gibi bilgileri kaydeder. Ayrica ekran resmi icin de kullaniriz
    protected static ExtentHtmlReporter extentHtmlReporter; // Html raporu duzenler
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
    public static ExtentReports extentReports; //extent report'a ilk atamayi yapar
    protected static ExtentTest extentTest; // test pass veya failed gibi bilgileri kaydeder. Ayrica ekran resmi icin de kullaniriz
    protected static ExtentHtmlReporter extentHtmlReporter; // Html raporu duzenler

=======
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617

    protected static ExtentReports extentReports; //extent report'a ilk atamayi yapar
    protected static ExtentTest extentTest; // test pass veya failed gibi bilgileri kaydeder. Ayrica ekran resmi icin de kullaniriz
    protected static ExtentHtmlReporter extentHtmlReporter; // Html raporu duzenler
<<<<<<< HEAD

    // Test işlemine başlamadan hemen önce (test methodundan önce değil, tüm test işleminden önce)

    @BeforeTest(alwaysRun = true) // alwaysRun : her zaman çalıştır.
    public void setUpTest() {
        extentReports = new ExtentReports(); //Raporlamayi baslatir

        //rapor oluştuktan sonra raporunuz nereye eklensin istiyorsanız buraya yazıyorsunuz.
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String filePath = System.getProperty("user.dir") + "/test-output/Rapor"+date+".html";

        //oluşturmak istediğimiz raporu (html formatında) başlatıyoruz, filePath ile dosya yolunu belirliyoruz.
        extentHtmlReporter = new ExtentHtmlReporter(filePath);
        extentReports.attachReporter(extentHtmlReporter);
=======
>>>>>>> 9dca7b638a4088fbb6ab179c49d9dfe605d329e1
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
=======
public class TestBaseRapor {
>>>>>>> eefaef94da1ca4d010e2ccf3c59f1e1e6c2d4935
    protected static ExtentReports extentReports; //extent report'a ilk atamayi yapar
    protected static ExtentTest extentTest; // test pass veya failed gibi bilgileri kaydeder. Ayrica ekran resmi icin de kullaniriz
    protected static ExtentHtmlReporter extentHtmlReporter; // Html raporu duzenler

<<<<<<< HEAD
=======
>>>>>>> Ayse
>>>>>>> eefaef94da1ca4d010e2ccf3c59f1e1e6c2d4935
    // Test işlemine başlamadan hemen önce (test methodundan önce değil, tüm test işleminden önce)
    @BeforeTest(alwaysRun = true) // alwaysRun : her zaman çalıştır.
    public void setUpTest() {
        extentReports = new ExtentReports(); // Raporlamayi baslatir
        //rapor oluştuktan sonra raporunuz nereye eklensin istiyorsanız buraya yazıyorsunuz.
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String filePath = System.getProperty("user.dir") + "/test-output/Rapor"+date+".html";
        //oluşturmak istediğimiz raporu (html formatında) başlatıyoruz, filePath ile dosya yolunu belirliyoruz.
        extentHtmlReporter = new ExtentHtmlReporter(filePath);
        extentReports.attachReporter(extentHtmlReporter);
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
        // İstediğiniz bilgileri buraya ekeyebiliyorsunuz.
        extentReports.setSystemInfo("Enviroment","QA");
        extentReports.setSystemInfo("Browser", ConfigReader.getProperty("browser")); // chrome, firefox
        extentReports.setSystemInfo("Automation Engineer", "Seyma");
=======
<<<<<<< HEAD
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
=======
>>>>>>> Ayse
>>>>>>> eefaef94da1ca4d010e2ccf3c59f1e1e6c2d4935

        // İstediğiniz bilgileri buraya ekeyebiliyorsunuz.
        extentReports.setSystemInfo("Enviroment","QA");
        extentReports.setSystemInfo("Browser", ConfigReader.getProperty("browser")); // chrome, firefox
<<<<<<< HEAD
        extentReports.setSystemInfo("Automation Engineer", "Mehmet");
=======
<<<<<<< HEAD
<<<<<<< HEAD
        extentReports.setSystemInfo("Automation Engineer", "Mehmet");
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
        extentHtmlReporter.config().setDocumentTitle("Son Test");
        extentHtmlReporter.config().setReportName("Bu rapor cok guzel");
    }

    // Her test methodundan sonra eğer testte hata varsa, ekran görüntüsü alıp rapora ekliyor
<<<<<<< HEAD
    @AfterMethod(alwaysRun = true)
    public void tearDownMethod(ITestResult result) throws IOException {
=======

    @AfterMethod(alwaysRun = true)
    public void tearDownMethod(ITestResult result) throws IOException {
=======
        extentReports.setSystemInfo("Automation Engineer", "Oguzhan");
=======
        extentReports.setSystemInfo("Automation Engineer", "Mehmet");
>>>>>>> Ayse
>>>>>>> eefaef94da1ca4d010e2ccf3c59f1e1e6c2d4935
        extentHtmlReporter.config().setDocumentTitle("Son Test");
        extentHtmlReporter.config().setReportName("TestNG Reports");
    }


    // Her test methodundan sonra eğer testte hata varsa, ekran görüntüsü alıp rapora ekliyor
    @AfterMethod(alwaysRun = true)
    public void tearDownMethod(ITestResult result) throws IOException {

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
        // İstediğiniz bilgileri buraya ekeyebiliyorsunuz.
        extentReports.setSystemInfo("Enviroment","QA");
        extentReports.setSystemInfo("Browser", ConfigReader.getProperty("browser")); // chrome, firefox
        extentReports.setSystemInfo("Automation Engineer", "Emrah");
        extentHtmlReporter.config().setDocumentTitle("Son Test");
        extentHtmlReporter.config().setReportName("TestNG Report");
    }
    // Her test methodundan sonra eğer testte hata varsa, ekran görüntüsü alıp rapora ekliyor
    @AfterMethod(alwaysRun = true)
    public void tearDownMethod(ITestResult result) throws IOException {
>>>>>>> 9dca7b638a4088fbb6ab179c49d9dfe605d329e1
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
=======
>>>>>>> Ayse
>>>>>>> eefaef94da1ca4d010e2ccf3c59f1e1e6c2d4935
        if (result.getStatus() == ITestResult.FAILURE) { // eğer testin sonucu başarısızsa
            String screenshotLocation = ReusableMethods.getScreenshot(result.getName());
            extentTest.fail(result.getName());
            extentTest.addScreenCaptureFromPath(screenshotLocation);
            extentTest.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) { // eğer test çalıştırılmadan geçilmezse
            extentTest.skip("Test Case is skipped: " + result.getName()); // Ignore olanlar
        }
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
        Driver.closeDriver();
    }
    // Raporlandırmayı sonlandırmak icin
=======
<<<<<<< HEAD

        Driver.closeDriver();
    }

    // Raporlandırmayı sonlandırmak icin

=======
        Driver.closeDriver();
    }
<<<<<<< HEAD


=======
>>>>>>> 9dca7b638a4088fbb6ab179c49d9dfe605d329e1
    // Raporlandırmayı sonlandırmak icin
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
=======
>>>>>>> eefaef94da1ca4d010e2ccf3c59f1e1e6c2d4935
        Driver.closeDriver();
    }


    // Raporlandırmayı sonlandırmak icin
<<<<<<< HEAD
=======
>>>>>>> Ayse
>>>>>>> eefaef94da1ca4d010e2ccf3c59f1e1e6c2d4935
    @AfterTest(alwaysRun = true)
    public void tearDownTest() {
        extentReports.flush();
    }
<<<<<<< HEAD
}
=======
<<<<<<< HEAD
<<<<<<< HEAD
}

=======
<<<<<<< HEAD
}
=======
}
<<<<<<< HEAD
=======

>>>>>>> 9dca7b638a4088fbb6ab179c49d9dfe605d329e1
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224
=======
}
>>>>>>> Ayse
>>>>>>> eefaef94da1ca4d010e2ccf3c59f1e1e6c2d4935
>>>>>>> c5e8bb6b75c6946a47b2689e6e7358f260bfbb2d