public class Main {
    public static void main(String[] args) {

        Celebs topSinger = new Celebs(Celebs.Industry.Singer, "Talylor", "Swift", 'F', true);
        topSinger.setBirthDate(13,12,1989);

        Celebs topComedian = new Celebs(Celebs.Industry.Comedian,"Jim", "Carry", 'M', true);
        topComedian.setBirthDate(17,1,1962);

        Celebs ActorNominee1 = new Celebs(Celebs.Industry.Actor, "Elsa", "Oldenburg", 'F', false);
        ActorNominee1.setBirthDate(22,12,1817);

        // print
        System.out.println(topSinger.toString());
        System.out.println(topComedian.toString());
        System.out.println(ActorNominee1.toString());

    }
}
