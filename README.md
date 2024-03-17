# Google_LLC_Calculator_Automation_Selenium_Appium

## Technology Used:
- Appium
- Intellij IDEA
- Android Studio
- Appium Inspector

## Framework Used:
- testNG

## How to run this project:
- Clone this project
- Open Android Studio and Open the APK file
- Hit this command in cmd for checking the connectivity of device : adb devices
- Open Appium Server with this command:  
  ```Appium```  
- Open Appium Inspector
- Set desired capabilites:  
  {  
    "platformName": "Android",  
    "appium:platformVersion": "14",  
    "appium:appPackage": "com.nopstation.nopcommerce.nopstationcart",
    "appium:appActivity": "com.bs.ecommerce.main.SplashScreenActivity",
    "appium:app": System.getProperty("user.dir")+"/src/test/resources/nopstationCart_4.40 1.apk"  
  }  
- Open Intellij Idea
- Hit this command into the terminal:  
  ```gradle clean test```  
- To generating Allure Report hit these these commands:  
  ```allure generate allure-results --clean -output``` and     
  ```allure serve allure-results```

## Allure Report
![allure1](https://github.com/fariha28345/ecommerce_app_automation/assets/50767962/7ea1dab7-4793-45ad-b720-1d7bc5d56a6c)
![allure4](https://github.com/fariha28345/ecommerce_app_automation/assets/50767962/dc62a7a4-f175-4869-8197-07242d14268e)


## Automation Output Video
https://github.com/fariha28345/ecommerce_app_automation/assets/50767962/ef985c14-ca22-40a8-b7ce-d379351f25a2



