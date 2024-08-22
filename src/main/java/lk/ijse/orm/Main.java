package lk.ijse.orm;

import lk.ijse.orm.config.FactoryConfigaration;
import lk.ijse.orm.embed.FullName;
import lk.ijse.orm.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfigaration.getInstance().getSession();

        FullName fullName = new FullName("kalindu","akalanka");


        Student student = new Student();
        student.setId(5);
        student.setFullName(fullName);
        student.setAddress("mathara");

        Transaction transaction = session.beginTransaction();


        session.save(student);
        transaction.commit();
        session.close();


    }
}