
============grouping for single class in testng.xml=============
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
  <groups>
  <run>
  <exclude name="sanity"/>
  </run>
  </groups>
    <classes>
      <class name="groupingInTestNGxml.Grouping1"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
======================END===================