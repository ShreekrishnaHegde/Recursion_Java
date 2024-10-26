package Enum;

public class EnumExample {
    public static void main(String[] args) {
        WEEK week;

        week=WEEK.Monday;
//        for(WEEK day: WEEK.values())
//            System.out.println(day);
//        System.out.println(WEEK.ordinal());


    }
    enum WEEK{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        //This is not public or protected, it is default or final, because we don't want to create new objects.
        WEEK(){
            System.out.println("Constructor called for "+this.toString());
        }

        //These are public static and final
        //You cannot create child enum since it its final
        //Type of all these are "WEEK"

    }
}
/*
->enum cannot be the superclass
->Enum can implement as many interfaces but not classes
->Enum interface

 */
