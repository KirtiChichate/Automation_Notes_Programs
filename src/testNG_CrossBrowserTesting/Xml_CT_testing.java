
==========CT Testing serially================
<suite name="Suite">
  <test thread-count="5" name="FirefoxTest">
  <parameter name="browserName" value="firefox"/>
  <classes>
  <class name="CrossBrowserTest.CT1"/>
  </classes>
  </test> <!-- Test -->
  <test thread-count="5" name="ChromeTest">
  <parameter name="browserName" value="chrome"/>
  <classes>
  <class name="CrossBrowserTest.CT1"/>
  </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
=================END==============