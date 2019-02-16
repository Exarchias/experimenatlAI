public class Entity {
    private int entity_id;
    private boolean entity_is_variable;
    private String stringValue;
    private int intValue;
    private int numa;
    private int numb;

    public int use_the_entity(){
        if (!this.entity_is_variable){
            return entity_addition(this.numa, this.numb);
        }
        return 0;
    }

    public int entity_addition(int numa, int numb){
        return numa + numb;
    }
}
