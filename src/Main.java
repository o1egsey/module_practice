public class Main {

    public static void main(String[] args) {
        Man[] headquarters = new Man[9];

        headquarters[0] = new General(21, "Nick", true, 2);

        headquarters[1] = new Commander(21, "Matt1", false, (General) headquarters[0],3);
        headquarters[2] = new Commander(21, "Matt2", true, (General) headquarters[0],3);

        headquarters[3] = new Soldier(21, "Roy1", true, (Commander) headquarters[1]);
        headquarters[4] = new Soldier(21, "Roy2", true, (Commander) headquarters[2]);
        headquarters[5] = new Soldier(21, "Roy3", true, (Commander) headquarters[1]);
        headquarters[6] = new Soldier(21, "Roy4", false, (Commander) headquarters[2]);
        headquarters[7] = new Soldier(21, "Roy5", false, (Commander) headquarters[1]);
        headquarters[8] = new Soldier(21, "Roy6", true, (Commander) headquarters[2]);

        for(int i =0; i!=headquarters.length;i++)
        {

            System.out.println("ToFight person "+ (i+1)+": ");
            try {
                headquarters[i].Fight();
            } catch (FightException e) {
                System.out.println(e.getMessage());
            }
        }

        for(int i =0; i!=headquarters.length;i++)
        {
            System.out.println("ToReport person "+ (i+1)+": ");
            try {
                headquarters[i].Report();
            } catch (ReportException e) {
                System.out.println(e.getMessage());
            }
            System.out.println();
        }

    }

}
