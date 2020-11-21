public class Soldier extends Man {
    private Commander myCommander;
    private boolean canFight;


    public Soldier(int age, String name, boolean canFight, Commander myCommander){
        super(age, name);
        this.canFight = canFight;
        this.myCommander = myCommander;
    }

    public void setMyCommander(Commander myCommander) {
        this.myCommander = myCommander;
    }

    public void setCanFight(boolean canFight) {
        this.canFight = canFight;
    }

    @Override
    public void toFight() throws FightException {
        if(myCommander == null)
            throw new FightException("Cannot fight without commander");

        if(canFight) {
            System.out.println("Can fight");
        } else {
            System.out.println("Cannot fight");
        }
    }

    @Override
    public void toReport() throws ReportException {
        if(myCommander == null)
            throw new ReportException("Cannot report without commander");

        System.out.print("My commander: "+ myCommander.toString());
    }
}
