# What is this?
Bootstrap project for Android - Gradle - JUnit - Robolectric - Test coverage.

# Software
Used IDE: idea-IU-135.690

Import Project -> Import project from external model -> Gradle

# Local settings
Don't forget create file 'local.properties' and define path to your SDK, i.e:  
sdk.dir=/home/user/programs/android-sdk

# Testing only for development
Test kind: All in package  
Package: let it empty  
Search for tests: In single module  
Working directory: /home/petr/Workspace/bootstrap/android/src/main  
Use classpath of module: sub-module android  
Code coverage: IntelliJ IDEA (possible only in Ultimate version). JaCoCo runner doesn't generate coverage.  
Packages and classes to record coverage data: cz.posvic.bootstrap.lib.* (you can let it be empty, but IntelliJ generate some error messages)

Project structure -> Project settings -> Modules  
sub-module android -> Dependencies
* Android API XX Platform is on bottom (order is important!)

Project structure -> Project settings -> Modules  
sub-module android -> Paths
* Output path: /home/user/workspace/android-gradle-robolectric-coverage/android/build/classes/debug
* Test output path: /home/user/workspace/android-gradle-robolectric-coverage/android/build/test-classes

# Testing for automatic building
Simply use "gradle clean test jacocoTestReport" command

# Test coverage
Generated HTML in build/reports/coverage/index.html file.

# What doesn't work
* test ActionBarActivity

# FAQ
* If IntelliJ Idea can't synchronize Gradle settings, use different version compileSdkVersion (for example 18).