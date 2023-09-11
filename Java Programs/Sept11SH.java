class C1{
    public void time_pass(){
        System.out.println("You are in c1\n");
    }
}


// class c2 has inherited time_pass() from c1 class
class C2 extends C1{
    void ok(){
        System.out.println("You are in C2\n");
    }
}

public class Sept11SH{
    public static void main(String[] args){
        C2 o1 = new C2();

        o1.time_pass();

        
        o1.ok();
    }
}

