// Max Noyes 100946778
// 2024 January 31

class Person{
    private String personName;
    private int personAge;
    private char personGender;

    public Person(String name, int age, char gender){
        this.personName = name;
        this.personAge = age;
        this.personGender = gender;
        }
    
    public String getName(){
            return this.personName;
    }

    public int getAge(){
        return this.personAge;
    }

    public char getGender(){
        return this.personGender;
    }

    public void setAge(int age) {
        this.personAge = age;
    }

    public void setName(String name) {
        this.personName = name;
    }

    public void setGender(char gender) {
        this.personGender = gender;
    }

    public static void main(String[] args){
            Person a = new Person("Super man", 23, 'M');
            
            System.out.println("The name of the student is " + a.getName() + ", the age is " + a.getAge() + "and the gender is: " + a.getGender());
            a.setName("Maximus");
            a.setAge(18);
            a.setGender('M');
            System.out.println("The name of the student is " + a.getName() + ", the age is " + a.getAge() + "and the gender is: " + a.getGender());
    }
}