
===========creating multiple tests in testng===========
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test1">
    <classes>
     <class name="serialAndParallelexecution.SerialParallel1"/>
    </classes>
  </test> <!-- Test -->
  <test thread-count="5" name="Test2">
    <classes>
     <class name="serialAndParallelexecution.SerialParallel2"/>
    </classes>
  </test> <!-- Test -->
  <test thread-count="5" name="Test3">
    <classes>
     <class name="serialAndParallelexecution.SerialParallel3"/>
     </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
=========================END===================