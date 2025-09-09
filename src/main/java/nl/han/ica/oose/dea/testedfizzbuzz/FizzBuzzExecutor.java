package nl.han.ica.oose.dea.testedfizzbuzz;

public class FizzBuzzExecutor {

    public String execute(int i){
        String output = "";
        if(i % 3 == 0){
            output = "Fizz";
        }
        if(i % 5 == 0){
            output = output.concat("Buzz");
        }
        if(i % 3 != 0 && i % 5 != 0){
            return String.valueOf(i);
        } else {
            return output;
        }
    }
}
