public class homeWork1110 {
    public static void main(String[] args) {
Enum heute = Enum.DIENSTAG;
String result = switch (heute) {
    case MONTAG:
        yield "понеділок";
    case DIENSTAG:
        yield "вівторок";
    case MITWOCH:
        yield "середа";
    case DONNERSTAG:
        yield "четверг";
    case FREITAG:
        yield "пʼятниця";
    case SAMSTAG:
        yield "субота";
    case SONNTAG:
        yield "неділя";
    default:
        yield "пора відпочивати";

};
        System.out.println(result);
    }
}
