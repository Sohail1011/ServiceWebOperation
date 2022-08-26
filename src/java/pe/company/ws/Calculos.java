package pe.company.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "Calculos")
public class Calculos {

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hola " + txt + " !";
    }

    @WebMethod(operationName = "suma")
    public double suma(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a + b;
    }

    @WebMethod(operationName = "resta")
    public double resta(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a - b;
    }

    @WebMethod(operationName = "dividir")
    public double dividir(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a / b;
    }

    @WebMethod(operationName = "multiplicar")
    public double multiplicar(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a * b;
    }
}
