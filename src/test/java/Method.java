package test.java;

public class Method {
    static int studentCount=0;
    String name;

    public Method(String name){
        this.name=name;
        studentCount++;
    }

    public void studentName(String name){
        System.out.println("Studnet name:"+name);
    }

    public void studentCountInfo(){
        System.out.println("Student count:"+studentCount);
    }

    public static void main(String[] args) {
       Method sc1 = new Method(null);
       Method sc2 = new Method(null);

       sc1.studentName("Hello");
       sc2.studentName("World");
       Method method = new Method(null);
       method.studentCountInfo();
    }
}

