
==================include/exclude methods form xml===========
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
    <classes>
      <class name="testNG.IncludeExclude1">
      <methods>
      <include name="TC1"/>
      <include name="TC2"/>
      </methods>
      </class>
      <class name="testNG.IncludeExclude2">
      <methods>
      <exclude name="TC6"/>
      <exclude name="TC7"/>
      <exclude name="TC8"/>
      </methods>
      </class>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->

=========================END==================