class parent{
    int age ,id;
    String name;
    void naming(String name){
        System.out.println("name: "+ name);

    }
}
class child extends parent{
          void ageN(int age){
                 System.out.println("age of student is: "+ age);

}
}
class Main{
     public static void main(String[] args) {
         child s = new child();
         s.naming("aashish");
         s.ageN(14);
}

}
