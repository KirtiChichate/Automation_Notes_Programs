
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
<listeners>
<listener class-name="listener.Listener"/>
</listeners>
  <test thread-count="5" name="Test">
    <classes>
      <class name="listener.Testing"/>
      <class name="listener.Testing1"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->