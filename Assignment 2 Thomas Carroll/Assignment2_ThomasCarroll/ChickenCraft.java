package Assignment2_ThomasCarroll;

public class ChickenCraft {

    // The name of the chicken
    String name = "Nancy";

    // Whether the chicken is alive
    boolean alive = true;

    // The chicken's happiness level
    boolean happiness = true;

    // The chicken's health level
    int hearts = 4;

    //The amount of eggs a chicken can lay
    double eggs = 0;

    //How much seeds the chicken has eaten
    double seeds = 1.20;


    /*
     * This method is used to feed the chicken
     *
     * @param seeds and how many times the user wants to feed the chicken
     * @return  how much seeds a chicken has eaten
     */
    public void Feed(int numTimes) {

        while (numTimes >= 0) {
            seeds = seeds + 0.10;
            numTimes--;
        }
        System.out.println(name + " has " + seeds + " seeds in its stomach");

        if (seeds > 2.00) {
            alive = false;
        }
    }

    /*
     * This method is used to hurt the chicken
     *
     * @param hearts and how many times the user wants to hit the chicken
     * @return  how healthy the chicken is
     */
    public void Hit(int hits) {
        System.out.println(name + " is now sad");
        while (hits >= 0) {
            hearts = hearts - 1;
            hits--;
        }
        if (hearts == 0) {
            alive = false;
            System.out.println(name + " has died");
            System.out.println(" ");
        }
        System.out.println(name + " has " + hearts + " hearts left");
    }

    /*
     * This method is used to play with the chicken
     *
     * @param happiness and alive
     * @return  a happy chicken, assuming it is not dead
     */
    public void Play() {
        if (alive == true) {
            if (happiness == true) {
                System.out.println(name + " is already happy");
                return; // This is used to stop the if statement from running
            }
            happiness = true;
            System.out.println(name + " is now happy");
        }
    }

    /*
     * This method is used to get eggs from the chicken
     *
     * @param eggs and alive
     * @return  the amount of eggs the chicken has laid
     */
    public void GetEggs() {
        eggs = seeds / 0.25;
        seeds = seeds / 0.25;
        eggs = Math.floor(eggs);
        System.out.println(name + " has laid " + eggs + " eggs");
        System.out.println(name + " is now sad");
        happiness = false;

    }
}
