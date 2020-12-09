package com.zxc;

import com.zxc.dao.StudentDao;
import com.zxc.domain.Student;
import com.zxc.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest01 {
    @Test
    public void test01(){
      String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        String names[] = applicationContext.getBeanDefinitionNames();
        for (String name : names){
            System.out.println("容器中对象的名称="+name+"|"+applicationContext.getBean(name));
        }
    }

    @Test
    public void testDaoInsert(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
       //获取spring容器中对象
        StudentDao dao = (StudentDao) applicationContext.getBean("studentDao");
        Student student = new Student();
        student.setId(1903140222);
        student.setName("周绪驰");
        student.setAge(19);
        student.setEmail("2898743173@qq.com");
        int nums = dao.insertStudent(student);
        System.out.println("nums="+nums);
    }

    @Test
    public void testServiceInsert(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //获取spring容器中对象
        StudentService service = (StudentService) applicationContext.getBean("studentService");
        Student student = new Student();
        student.setId(1903140223);
        student.setName("高康凯");
        student.setAge(20);
        student.setEmail("2898743173@qq.com");
        int nums = service.addStudent(student);
        //这里是自动提交事务，spring和mybatis整合一起使用，不需要使用SqlSession.commit()
        System.out.println("nums="+nums);
    }

    @Test
    public void testServiceSelect(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //获取spring容器中对象
        StudentService service = (StudentService) applicationContext.getBean("studentService");
        List<Student> students = service.queryStudents();
        for (Student student:students){
            System.out.println("学生="+student);
        }
    }
}
