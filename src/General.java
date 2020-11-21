
public class General extends Man {
    private int myCommanders;
    private boolean canFight;

    public General(int age, String name, boolean canFight, int myCommanders){
        super(age, name);
        this.canFight = canFight;
        this.myCommanders = myCommanders;
    }


}
