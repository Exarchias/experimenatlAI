import java.security.SecureRandom;

public class Entity {
    private int entity_id;
    private boolean entity_is_variable;
    private String stringValue;
    private int intValue;
    private int numa;
    private int numb;
    SecureRandom random = new SecureRandom();

    public Entity(int entity_id, boolean entity_is_variable, int intValue, int numa, int numb){
        this.entity_id = entity_id;
        this.entity_is_variable = entity_is_variable;
        this.intValue = intValue;
        this.numa = numa;
        this.numb = numb;
    }

    public int use_the_entity(){
        if (!this.entity_is_variable){
            return entity_addition(this.numa, this.numb);
        }
        return 0;
    }

    public int entity_addition(int numa, int numb){
        return numa + numb;
    }

    public void mutateTheEntity(){
        this.intValue = random.nextInt(10);
    }

    public int getEntity_id() {
        return entity_id;
    }

    public void setEntity_id(int entity_id) {
        this.entity_id = entity_id;
    }

    public boolean isEntity_is_variable() {
        return entity_is_variable;
    }

    public void setEntity_is_variable(boolean entity_is_variable) {
        this.entity_is_variable = entity_is_variable;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public int getNuma() {
        return numa;
    }

    public void setNuma(int numa) {
        this.numa = numa;
    }

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }
}
