===========How to add Multiple classes in testng.xml file==========
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
    <classes>
      <class name="testNG.AnnotationStudy"/>
      <class name="testNG.MyClass"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
======================================================