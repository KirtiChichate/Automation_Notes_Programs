==========Include at method level==================
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
    <classes>
      <class name="testNG.IncludeExcludeTest">
      <methods>
      <include name="a"/>
      <include name="c"/>
      </methods>
      </class>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
============================================