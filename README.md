# Exercise_1
Console application that allowes user to input whole and fractional numbers and can give the output of:
  1) the largest number it encountered;
  2) the smallest number it encountered;
  3) the average of all encountered numbers.

#How ro run:
Save Program.java and NumbersHandler.java and manifest.txt to empty directory, 
cmd from this directory and enter following commands:
> **Note:** If you've encountered "a command is not recognized as an internal..." enter next command(specify version of jdk): path = %path%;c:\Program Files\Java\jdk-11.0.2\bin
```sh
javac *.java
```
```sh
jar cfe Program.jar Program manifest.txt *.class 
```
> **Note:** Now make sure your java runtime environment (java -version) has same version as java compiler (javac -version), if not go to 
> C:\ProgramData\Oracle\Java\javapath\ and rename java.exe -> java.old.exe
```sh
java -jar Program.jar
```
Good luck have fun!