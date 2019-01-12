public class Employee {
    String name;
    int age;
    int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "Jestem pracownikiem o imieniu " +name + ", mam " + age + " lat/a" + "i zarabiam " +salary + " zł";
    }

    @Override
    public boolean equals(Object object) {

        if (this == object){
            System.out.println( "Równoereferencyjna");
            return true;
        }

        if (object == null){
            return false;
        }

        if (getClass() != object.getClass()){
            return false;
        }

        Employee employee= (Employee)object;

        if (this.name == null){
            if (employee.name != null){
                return false;
            }
        }else if (!this.name.equals(employee.name)){
            return false;
        }
           if (this.age != employee.age){
            return false;
           }

           if (this.salary != employee.salary){
            return false;

        }
        return true;
        //return this.name.equals(((Employee)object).name);
    }
}

