
==========running only regression TC's===============
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
  <groups>
  <run>
  <exclude name="regression"/>
  </run>
  </groups>
    <classes>
      <class name="groupingInTestNGxml.Grouping2"/>
      <class name="groupingInTestNGxml.Grouping1"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
====================END================