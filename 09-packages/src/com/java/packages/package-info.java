package com.java.packages;

/*
 * Packages are folders into which we can organize our class files. They are
 * very similar to the folders on our machines where we store videos in a
 * separate folder, mp3s in a different one and Java files into a different
 * folder.
 * 
 * Similarly in Java language there are 5000 predefined classes that are ready
 * to be used in our programs.
 * 
 * All these predefined classes are put into their own packages like java.lang,
 * java.util, java.io, javax.xml,etc;
 * 
 * Java and javax are the super packages of all the predefined sub packages. So
 * they allow us to easily recognize the functionality we want by going to that
 * package.
 * 
 * Similarly we can create our own packages as well.
 * 
 * You will do that in this lecture.
 * 
 * Go to the Eclipse IDE. We'll create a new project called Packages. File ->
 * New -> Java project. Call it Packages.
 * 
 * Finish.
 * 
 * There are two ways in which we can create packages. On the src folder, right
 * click, say New -> Package.
 * 
 * p1, package names should always be lower case, finish.
 * 
 * Right click on this p1. To create a class, New -> Class. Let's call it A,
 * finish.
 * 
 * Eclipse has put the very first line which is package.
 * 
 * Package is a keyword to define a package. That should be the first line of
 * any class that has a package and followed by a name of that package.
 * 
 * Now let's take a look at this file on the file system.
 * 
 * Go to your Eclipse workspace.
 * 
 * For me it is under documents, corejava is my workspace.
 * 
 * Here is our project Packages, the newly created project. Go to the src
 * directory and you will see
 * 
 * that Eclipse has created a folder called p1.
 * 
 * So for every package we create, it will have a corresponding folder. Inside
 * it
 * 
 * our Java source file is present. Similarly when this file is compiled by
 * Eclipse automatically as soon as it is
 * 
 * saved, under the bin directory it has created another folder called p1 as
 * well.
 * 
 * So, the same package we have it under source as well as compiled folder. And
 * our class file, dot class
 * 
 * file goes under that p1 folder.
 * 
 * It's not magic. Eclipse internally uses the JavaC command with -d
 * 
 * option. If we simply javac and A.java, it wont generate this folder for us.
 * 
 * We have to use javac -d. Since we use Eclipse we need not worry about all
 * that, Eclipse internally
 * 
 * uses it and generates this folder for us.
 * 
 * If you go back to earlier projects, you will notice that any of your earlier
 * projects we didn't create any
 * 
 * package.
 * 
 * So eclipse was showing it as the default package. By default the current
 * folder or the home folder which
 * 
 * is src becomes the default package.
 * 
 * That's why Eclipse was showing it like this.
 * 
 * The second way to create a package. If you right click on this package,
 * delete it.
 * 
 * OK. Right click on the src, say New -> Class, instead of package directly
 * when we create a class, give it a name A.
 * 
 * And here is the option, package option on the top where we can give it a
 * package name
 * 
 * p1, finish.
 * 
 * So that's the second way to create and organize a class into packages.
 * 
 * There are several advantages of a package.
 * 
 * You'll learn one at a time in the next few lectures.
 */