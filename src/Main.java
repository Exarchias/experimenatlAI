public class Main {


    public static void main(String[] args){
        CPU pennCPU = new CPU();
        Authority pennauthority = new Authority(10);
        Entity item1 = new Entity(1, true, 5,0,0);
        Entity item3 = new Entity(3, true, 5, 0,0);
        Entity item2 = new Entity(2, false, 0, item1.getIntValue(), item3.getIntValue());

        if (pennauthority.happyAuthority(item2.use_the_entity())){
            System.out.println("The authority is happy");
        } else {
            System.out.println("The authority is NOT happy");
        }
    }
}
