import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("Nurzhigit ", "Malikov", (byte) 23, "Plov");


        System.out.println("NAME : "+myClass.getName()+"\nSURNAME : "+myClass.getSurname()+"\nAGE :"+
                myClass.getAge()+"\nLovely Foods:"+myClass.getLovelyFoods());

        String[] array = {"Math","Physic","Biology","Chemistry","English"};
        MyClass myClass1 = new MyClass(array);
        for (String lesson : myClass1.getLessons()) {

            System.out.println("Lessons:"+" "+ lesson);

    }







      
      

    }
}