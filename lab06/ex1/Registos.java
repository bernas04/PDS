package lab06.ex1;

import java.util.*;
public class Registos {
    // Data elements
    private ArrayList<Empregado> empregados; // Stores the employees
    
    public  Registos() {
        empregados = new ArrayList<>();
    }

    public void insere(Empregado emp) {
    // Code to insert employee
        empregados.add(emp);
    }

    public void remove(int codigo) {
    // Code to remove employee
        for (Empregado x : empregados){
            if (x.codigo() == codigo){
                empregados.remove(x);
            }
        }
    }

    public boolean isEmpregado(int codigo) {
    // Code to find employee
    for (Empregado emp : empregados){
        if (emp.codigo() == codigo){
            return true;
        }
    }
    return false;
    }

    public List<Empregado> listaDeEmpregados() {
    // Code to retrieve collection
        return empregados;
    }
}
