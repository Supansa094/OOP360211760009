package lab8;

public class petArray {

    public static void main(String[] args) {
        petArray d1 = new petArray();
        d1.setname("");
        d1.setAge(22);
        s1.setGender("Male");
        s1.setHeight(180);
        System.out.println(d1.toString());

        Student d2 = new Student("Safe", 90, "Female", 190);
        System.out.println(s2.toString());

        //input data from user
        Student s3 = new Student();
        // s3 = inputData(s3); //s
        s3 = inputDataBuffer(s3);
        System.out.println(s3.toString());

    }
}
