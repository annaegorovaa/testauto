package com.epam.trainings.testauto.xml.wsdl.wsclient;

public class ServiceClient {
    public static void main(String... args) {
        HelloService service = new HelloService();
        Hello hello = service.getHelloPort();
        String text = hello.sayHello("Henry");
        System.out.println(text);
    }
}