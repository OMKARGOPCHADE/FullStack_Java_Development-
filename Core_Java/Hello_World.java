//In Java-9 version
//Jshell is introduced just like in python idle/pyshell.
//jshell is used to run some small line of scripts or instructions 
//e.g adding two number or printing anything by just writing one line of code.
// as actual java file has a structrue do that.
//in this file we are going to see that structure and we will also going to write our very first java code.
public class Hello_World {
    // note:- Always remember in java whatever the file name is that has to be the
    // main class name in the code. otherwise it will give an error of fileNotfound.
    /*
     * We are allowed to use any name for a filename only when class is not public.
     * In the case of a public class, we can't use a different file name. The
     * filename must have the same name as the public class name in that file, which
     * is the way to tell the JVM that this is an entry point.
     *
     */
    // Note:- Java is also called as Platform Independend Language.
    // Note:- Java is also known as wora(write once run anywhere).
    /*
     * Note:- Every Java File Run anywhere means on any platform just because, after
     * complietion java file is converted to .class file which actually includes a
     * byte code. which can be excutable code on any platform with the help of
     * jvm(java virtual machine).
     * now the question is what is jvm so the jvm is java virtual machine which
     * provides a eniornment to run any java compiled code. as java is platform
     * independed language jvm it'self platform dependend ya it's true jvm is a
     * platform depended every platform has differnet jvm. e.g. windows has
     * differnet and mac has different. if your giving someone ur java compiled file
     * then that person should have jvm installed in their system. but wait not only
     * jvm does everything their is another thing is also important that is jre(java
     * runtime enviornment). which has bundle of libraries which is required for
     * excuting any java program. apart from that we also have jdk(java devlopement
     * kit).The Java Development Kit (JDK) is a software development kit that
     * provides the tools and environment for developing Java applications. It
     * includes a compiler, debugger, and other utilities to compile, debug, and run
     * Java programs.
     * What kind of error will be thrown if the main method is not found in the Java program?
     * --> Runtime Error.
     * from java14 
     * we have new feature for running program we got new shortcut that is
     * java file_name.java. in this case don't need to compile and then run the program.
     * this single line will do both work, but it's better to use compile and run approach.
     */

    public static void main(String[] args) {
        // Note:- always remember every java file should have a main method in it.
        System.out.println("Hello, World");
    }
}