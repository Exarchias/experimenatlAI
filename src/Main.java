public class Main {


    public static void main(String[] args){
        boolean happy = false;
        int count = 0;
        CPU pennCPU = new CPU();
        Authority pennauthority = new Authority(2);
        Entity item1 = new Entity(1, true, 2,0,0);
        Entity item3 = new Entity(3, true, 1, 0,0);
        Entity item2 = new Entity(2, false, 0, item1.getIntValue(), item3.getIntValue());

        System.out.println("The authority desires the result " + pennauthority.getExpectedInt());
        while(!happy){
            System.out.println("The current operation is: " + item1.getIntValue() + " + " + item3.getIntValue());
            if (pennauthority.happyAuthority(item2.use_the_entity())){
                System.out.println("The authority is happy");
                happy = true;
            } else {
                System.out.println("The authority is NOT happy");
                item1.mutateTheEntity();
                item3.mutateTheEntity();
                item2.setNuma(item1.getIntValue());
                item2.setNumb(item3.getIntValue());
            }
            count = count + 1;
        }

        System.out.println("The final operation is: " + item1.getIntValue() + " + " + item3.getIntValue() + " = "
                + pennauthority.getExpectedInt());
        System.out.println("The authority issued " + count + " mutations in total");

    }
}
