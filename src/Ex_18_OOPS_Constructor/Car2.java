package Ex_18_OOPS_Constructor;

public class Car2 {

    String model;
    int year;

    Car2(){
        model = "xxxx";
        year = 1900;
        System.out.println("DC");
    }

    Car2(String model_name,int year_created){
        this.model=model_name;
        this.year=year_created;
    }
    Car2(String model_name){
        this.model=model_name;
    }

}
