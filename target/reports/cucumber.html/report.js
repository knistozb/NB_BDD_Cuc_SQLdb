$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:nb_Features_pkg/LoginWithDataFromMySQLDatabase.feature");
formatter.feature({
  "name": "n  Techfios billing login page functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@DatabaseLoginFeature"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 116\nCurrent browser version is 118.0.5993.117 with binary path /Applications/Google Chrome.app/Contents/MacOS/Google Chrome\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027Nistozs-MacBook-Pro-II.local\u0027, ip: \u0027127.0.0.1\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002712.7\u0027, java.version: \u002711.0.17\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: 0   chromedriver                        0x0000000104c23638 chromedriver + 5002808\n1   chromedriver                        0x0000000104c1aa53 chromedriver + 4966995\n2   chromedriver                        0x00000001047cba57 chromedriver + 449111\n3   chromedriver                        0x000000010480042c chromedriver + 664620\n4   chromedriver                        0x00000001047fb58f chromedriver + 644495\n5   chromedriver                        0x00000001047f8189 chromedriver + 631177\n6   chromedriver                        0x0000000104841cf4 chromedriver + 933108\n7   chromedriver                        0x000000010484103f chromedriver + 929855\n8   chromedriver                        0x00000001048381c3 chromedriver + 893379\n9   chromedriver                        0x0000000104803df9 chromedriver + 679417\n10  chromedriver                        0x0000000104804fde chromedriver + 683998\n11  chromedriver                        0x0000000104be02d9 chromedriver + 4727513\n12  chromedriver                        0x0000000104be52de chromedriver + 4747998\n13  chromedriver                        0x0000000104ba32c9 chromedriver + 4477641\n14  chromedriver                        0x0000000104be602d chromedriver + 4751405\n15  chromedriver                        0x0000000104bb90ec chromedriver + 4567276\n16  chromedriver                        0x0000000104c037f8 chromedriver + 4872184\n17  chromedriver                        0x0000000104c039b7 chromedriver + 4872631\n18  chromedriver                        0x0000000104c13a1f chromedriver + 4938271\n19  libsystem_pthread.dylib             0x00007ff81a1e34e1 _pthread_start + 125\n20  libsystem_pthread.dylib             0x00007ff81a1def6b thread_start + 15\n\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$new$0(W3CHandshakeResponse.java:57)\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$getResponseFunction$2(W3CHandshakeResponse.java:104)\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:122)\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)\n\tat java.base/java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\n\tat java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:127)\n\tat java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:502)\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:488)\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)\n\tat java.base/java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\n\tat java.base/java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:543)\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:125)\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:73)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:212)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:130)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\n\tat nb_Util_pkg.BrowserFactory_or_TestBase.initDriver(BrowserFactory_or_TestBase.java:102)\n\tat nb_Steps_pkg.LoginStepDefinition.setup(LoginStepDefinition.java:97)\n",
  "status": "failed"
});
formatter.step({
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "nb_Steps_pkg.LoginStepDefinition.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "User should be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DatabaseLoginFeature"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@DbLoginScenario1"
    }
  ]
});
formatter.step({
  "name": "User enters \"username\" from mysqldb database",
  "keyword": "When "
});
formatter.match({
  "location": "nb_Steps_pkg.LoginStepDefinition.user_enters_from_mysqldb_database(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters \"password\" from mysqldb database",
  "keyword": "When "
});
formatter.match({
  "location": "nb_Steps_pkg.LoginStepDefinition.user_enters_from_mysqldb_database(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "nb_Steps_pkg.LoginStepDefinition.user_clicks_on_sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "nb_Steps_pkg.LoginStepDefinition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException\n\tat nb_Steps_pkg.LoginStepDefinition.tearDown(LoginStepDefinition.java:170)\n",
  "status": "failed"
});
});