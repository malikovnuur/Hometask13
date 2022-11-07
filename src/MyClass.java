public class MyClass {
    private String name;
    private String surname;
    private byte age;
    private String[] lessons;
    private String lovelyFoods;


    public MyClass(String name, String surname, byte age, String lovelyFoods) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.lovelyFoods = lovelyFoods;


    }
    public MyClass(String...lessons){
        this.lessons=lessons;
    }





    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(byte age) {
        this.age = age;

    }

    public byte getAge() {
        return age;
    }

    public void setLovelyFoods(String lovelyFoods) {
        this.lovelyFoods = lovelyFoods;
    }

    public String getLovelyFoods() {
        return lovelyFoods;
    }

    public void setLessons(String[] lessons) {
        this.lessons = lessons;
    }

    public String[] getLessons() {
        return lessons;
    }


}