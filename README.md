# Intive-FDV Instructions
#
# This guide is intended for IntelliJ IDE and chromedriver
#
# Prerequisites:
# 1.Have a JDK installed. To check if you already have it, go to your terminal (or git bash) and enter java -version. If the JDK is installed, your output should look like this:
#
#  java version "1.8.0_131"
#  Java(TM) SE Runtime Environment (build 1.8.0_131-b11)
#  Java HotSpot(TM) 64-Bit Server VM (build 25.131-b11, mixed mode)
#
#  If you don't have a JDK installed, you can download it here: http://www.oracle.com/technetwork/java/javase/downloads/index.html.
#
# 2.Have your shh keys configured in github. You can find further instructions here
# https://help.github.com/articles/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent/
#
# Steps:
# 1.Download IntelliJ IDE here: https://www.jetbrains.com/idea/download/ and install it following the instructions
# 2.Clone the repo: open a terminal (or git bash) and go to your home directory. Once there, enter
# git clone git@github.com:florbs/intive.git
# 3.Open IntelliJ and click "Open", another window will appear. Browse for the project's pom.xml file. For example, if you cloned
# the repo under your home directory, the pom will be under /User/{username}/intive/pom.xml. Select that file.
# 4.Select "Open as Project". In the following screen, select "Open existing project".
#
# Running the tests:
# Once you have imported the project, make sure you have the chromedriver specific to your platform in the project structure.
# You can download it here: https://chromedriver.storage.googleapis.com/index.html?path=2.31/
# Once downloaded, extract it and then copy and paste it under intive folder (there already is a chromedriver in the project, this
# will serve as indication as to where the file should be placed. Make sure to remove the "exe" extension from the name)
#
# 1.Open the project in the IDE, and go to Run → Edit configurations
# 2.Select the plus sign to add a new configuration, and then select TestNG.
# 3.In the "Test kind" dropdown, select "Suite".
# 4.In "Suite", browse the suite intive\src\test\resources\intive_test.xml. The first part of the path will depend on the local path
# where you have cloned the repository.
# Apply the changes and click Run.

# How the project was built:
# The project makes use of the Singleton design pattern to handle the WebDriver instance. This can be found in the Driver.java.
# Along with that design, it implements a Page Object pattern that targets elements in {Page}ElementMap classes.
# Since the number of elements was very small, there was no need for an Object repository implementation.
# All page object classes are to be extended from the parent class Page that can be found under src/main/java/com/intive/pageObjects/base
# All the pages elements are targeted in the classes named {Page}ElementMap, which derive from the parent class ElementMap

