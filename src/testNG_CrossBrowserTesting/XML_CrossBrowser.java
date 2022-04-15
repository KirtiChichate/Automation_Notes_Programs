
=========Using Parameter value we can change Browser here================
<suite name="Suite">
  <test thread-count="5" name="Test">
  <parameter name="browserName" value="firefox"/>
  <classes>
  <class name="CrossBrowserTest.CT1"/>
  </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
======================END====================