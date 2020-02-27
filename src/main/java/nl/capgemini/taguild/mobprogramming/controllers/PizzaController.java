package nl.capgemini.taguild.mobprogramming.controllers;

import nl.capgemini.taguild.mobprogramming.objects.PizzaObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PizzaController {

    private List<PizzaObject> pizzaList = new ArrayList<>();

    @GetMapping("/")
    public String getPizzaString() {
        return "Hallo allemaal";
    }

    @GetMapping("/pizza")
    public PizzaObject getPizza() {
        return new PizzaObject(9.50, "vegetariana", 1.0);
    }

    @GetMapping("/pizzalijst")
    public List<PizzaObject> getPizzaList(){
//        pizzaList.add(new PizzaObject(800.00, "truffel", 900.00));
//        pizzaList.add(new PizzaObject(10.00, "margherita", 0.10));
//        pizzaList.add(new PizzaObject(0.10, "kanaleneiland", 0.00));
        return pizzaList;
    }

    @PostMapping("/pizza")
    public void addPizza(@RequestBody final PizzaObject pizza) {
        pizzaList.add(pizza);
    }

}
