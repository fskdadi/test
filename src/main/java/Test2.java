import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.ThreadPoolExecutor;

public class Test2 {
    public Test2(){
        System.out.println("constuct");
    }

    static{
        System.out.println("static");
    }
    public static void main(String[] args) throws InterruptedException {
        Test2 test2 = new Test2();
        //ThreadPoolExecutor e = new ThreadPoolExecutor
    }
}
