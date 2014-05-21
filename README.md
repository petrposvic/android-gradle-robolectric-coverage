# What is this?
Bootstrap project for Android - Gradle - JUnit - Robolectric - Test coverage.

# Software
Used IDE: idea-IU-135.690

Import Project -> Import project from external model -> Gradle

# Testing only for development
Test kind: All in package  
Package: let it empty  
Search for tests: In single module  
Working directory: /home/petr/Workspace/bootstrap/android/src/main  
Use classpath of module: sub-module android  
Code coverage: JaCoCo (possible only in Ultimate IntelliJ IDEA)  

Project structure -> Project settings -> Modules  
sub-module android -> Dependencies
* junit-4.10 is on top (order is important!)
* /home/petr/Workspace/bootstrap/android/build/test-classes as Test scope

# Testing for automatic building
Simply use "gradle clean test" command

# What doesn't work
* generate HTML test coverage
* test ActionBarActivity