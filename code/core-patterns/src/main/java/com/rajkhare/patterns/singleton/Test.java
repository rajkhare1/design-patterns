package com.rajkhare.patterns.singleton;

import java.io.*;

public class Test {

   static void main() throws IOException, ClassNotFoundException {

       DateUtil dateUtil1 = DateUtil.getInstance();
       ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream
               (new File("/Users/rajkhare/Raj/Udemy/design-patterns/singleton/dateUtil.ser")));
       objectOutputStream.writeObject(dateUtil1);

       DateUtil dateUtil2 = null;
       ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream
               (new File("/Users/rajkhare/Raj/Udemy/design-patterns/singleton/dateUtil.ser")));
       dateUtil2 = (DateUtil) objectInputStream.readObject();

       objectOutputStream.close();
       objectInputStream.close();

       System.out.println(dateUtil1 == dateUtil2);

    }

}
