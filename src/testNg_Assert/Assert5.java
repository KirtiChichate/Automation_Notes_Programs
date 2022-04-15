
======================Testng xml for Parallel execution==============
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite" parallel="tests">
  <test  name="Test1">
    <classes>
    <class name="SerailAndParallel.SerailAndParallel1"/>
    </classes>
  </test> <!-- Test -->
  
  
  <test name="Test2">
    <classes>
    <class name="SerailAndParallel.SerailAndParallel2"/>
    </classes>
  </test> <!-- Test -->
    
  <test name="Test3">
    <classes>
    <class name="SerailAndParallel.SerailAndParallel3"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
=======================END==========================