import com.example1.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {




                ApplicationContext context =
                        new ClassPathXmlApplicationContext("applicationContext.xml");

                Shape circle = (Shape) context.getBean("circle");
                Shape square = (Shape) context.getBean("square");

                System.out.println("Circle Area = " + circle.getArea());
                System.out.println("Square Area = " + square.getArea());
            }
        }

