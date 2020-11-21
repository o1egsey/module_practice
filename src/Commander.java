public class Commander extends Man {
    private General myGeneral;
    private int mySoldiers;
    private boolean canFight;


    public Commander(int age, String name, boolean canFight, General myGeneral, int soldiers){
        super(age, name);
        this.canFight = canFight;
        this.myGeneral = myGeneral;
        this.mySoldiers = soldiers;
    }



}
