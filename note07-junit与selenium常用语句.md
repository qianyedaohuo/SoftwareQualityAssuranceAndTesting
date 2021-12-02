# junit的各种断言

## assertEquals

assertEquals(expected,actural);

* expected: 期望值
* actural: 被测代码实际产生值

## assertTrue

assertTrue(Boolean condition);

* 判断给定是condition否为真

## assertFalse

assertFalse(Boolean condition);

* 判断给定是condition否为假

## assertNull

assertNull(java.long.Object object);

* 判断给定是object否为null

# selenium

* ChromeDriver地址
System.setProperty("webdriver.chrome.driver","c:\\webDriver\\chromedriver.exe");

* 新建一个WebDriver的对象,但是new的是ChromeDriver的驱动
WebDriver driver =new ChromeDriver();

* 打开指定的网站
driver.get("http://www.baidu.com");

* 找到元素的xpath，然后输入hello
driver.findElement(By.xpath("")).sendKeys(new  String[] {"hello"});

* 点击按扭
driver.findElement(By.xpath("")).click(); 

* 跳转到新的页面
driver.SwitchTo().window(driver.getWindowHandle())