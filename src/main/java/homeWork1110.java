public class homeWork1110 {
    public static void main(String[] args) {
Enum heute = Enum.MONTAG;
        switch (heute){
            case MONTAG :
                System.out.println("понеділок");
            break;
            case DIENSTAG :
            System.out.println("вівторок");
            break;
            case MITWOCH :
                    System.out.println("середа");
                    break ;
            case DONNERSTAG :
                System.out.println("четверг");
                break ;
            case FREITAG :
                System.out.println("пʼятниця");
                break ;
            case SAMSTAG :
                System.out.println("субота");
                break ;
            case SONNTAG:
                System.out.println("неділя");
                break;
            default :
                System.out.println("пора відпочивати");
                break ;
        }
    }
}
