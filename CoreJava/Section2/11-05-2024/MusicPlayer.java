

public class MusicPlayer {
    public static void main(String[] args) {

        System.out.println("#############################");
        System.out.println("Welcome To My Program\n\n");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int flag = 1;
        int appChoice;

        while(flag!=0){
            System.out.println("Music Services You want to Enjoy\n    1. YTMusic\n    2. Spotify\n    3. Wynk\n    0. Exit the Program");
            System.out.print("Enter Choice:- ");
            appChoice = sc.nextInt();

            switch(appChoice){
                case 1:
                    factoryServices(new YTMusic());
                    System.out.println("Using YTMusic Services");
                    break;
                case 2:
                    factoryServices(new Spotify());
                    System.out.println("Using Spotify Services");
                    break;
                case 3:
                    factoryServices(new Wynk());
                    System.out.println("Using Wynk Services");
                    break;
                case 0:
                    System.out.println("Thank for Using My Program....❤❤❤❤👌");
                    flag = 0;
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }

    }
    public static void factoryServices(MediaPlayer m1){
        java.util.Scanner sc2 = new java.util.Scanner(System.in);

        int flagApp = 1;
        int appMethod;
        System.out.println("Using "+m1.getClass().getSimpleName()+" Services");

        while(flagApp!=0){
            System.out.println("\n What You Would like to do:- \n    1. Play    2. Pause    3. Stop    4. Prev    5. Next    6. Shuffle    0. To Main Menu");
            System.out.print("Enter Option:- ");
            appMethod = sc2.nextInt();
            System.out.println();
            switch(appMethod){
                case 1:
                    m1.play();
                    break;
                case 2:
                    m1.pause();
                    break;
                case 3:
                    m1.stop();
                    break;
                case 4:
                    m1.prev();
                    break;
                case 5:
                    m1.next();
                    break;
                case 6:
                    m1.shuffle();
                    break;
                case 0:
                    System.out.println("Thank You for Using YTMusic");
                    System.out.println("Going Back to Main Menu\n");
                    flagApp = 0;
                    break;
                default:
                    System.out.println("Invalid Options");
            }
        }
        }
    }
