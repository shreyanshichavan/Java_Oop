//Aim:-PracticalNo5
//Author:-Shreyanshi chavan
//Rollno:-AD23D006
//Date:-27/02/24

 class Emergicon {
    protected String president;
    protected String vicePresident;
    protected String secretary;
    protected String viceSecretary;
    protected String treasurer;

    public Emergicon(String president, String vicePresident, String secretary, String viceSecretary, String treasurer) {
        this.president = president;
        this.vicePresident = vicePresident;
        this.secretary = secretary;
        this.viceSecretary = viceSecretary;
        this.treasurer = treasurer;
    }

    public void forumName() {
        
        System.out.println("President: " + president);
        System.out.println("Vice President: " + vicePresident);
        System.out.println("Secretary: " + secretary);
        System.out.println("Vice Secretary: " + viceSecretary);
        System.out.println("Treasurer: " + treasurer);
    }
}

class AIDS extends Emergicon {
    public AIDS(String president, String vicePresident, String secretary, String viceSecretary, String treasurer) {
        super(president, vicePresident, secretary, viceSecretary, treasurer);
    }

    @Override
    public void forumName() {
        System.out.println("AIDS Forum:");
        super.forumName();
    }
}

class AIML extends Emergicon {
    public AIML(String president, String vicePresident, String secretary, String viceSecretary, String treasurer) {
        super(president, vicePresident, secretary, viceSecretary, treasurer);
    }

    @Override
    public void forumName() {
        System.out.println("AIML Forum:");
        super.forumName();
    }
}

public class practicalno5 {
    public static void main(String[] args) {
        AIDS aidsForum = new AIDS("Shreyanshi chavan", "Shashi choudhary", "Shruti", "Swati", "Pranali");
        AIML aimlForum = new AIML("Mark Thompson", "purnima", "Riya", "Palak", "Chiya");

        aidsForum.forumName();
        System.out.println();
        aimlForum.forumName();
    }
}