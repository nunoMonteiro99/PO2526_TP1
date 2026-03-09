import Ex1.Calc;
import Ex2.Classroom;
import Ex3.Order;
import Ex3.Customer;
import Ex3.*;
import java.util.*;

public class Main {
    public static void main(String[]agrs){


        //EX1
        Calc triangle = new Calc(4,4);
        Calc retangle = new Calc(7,7);
        Calc circle = new Calc(4);

        System.out.println("Area do Triangulo        :  " + triangle.areaTriangle());
        System.out.println("Area do Retangulo        :  " + retangle.areaRectangle());
        System.out.println("Area do Circulo          :  " + circle.areaCircle());


        //EX2

        Classroom classroom = new Classroom(30);

        classroom.add("Maria");
        classroom.add("Joao");
        classroom.add("Joana");

        System.out.println("Maximo de alunos na turma: " + classroom.getMax());
        System.out.println("Lista da Turma           : " + classroom.getStudents());
        System.out.println("O maximo antes era       : " + classroom.getMax());
        classroom.setMax(3);
        System.out.println("Agora é                  : " + classroom.getMax());


        //EX3

       Address address = new Address("Almada");
       Customer customer = new Customer(address, "Joao");
       Order order = new Order(customer, 1234);

       System.out.println("" + order.printShippingLabel());
       System.out.println("Nome do cliente: " +order.getCustomer() );

    }
}
