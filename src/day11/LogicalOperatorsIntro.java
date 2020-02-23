package day11;

public class LogicalOperatorsIntro {
   // DAY 11
    //Create class called WarmUp1_LightOnOff
     //       Create a variable  targetOption as String and assign one of below options  for example bd
    //You have 4 switches in your home to turn on
    //Bd — bedroom
    //Lr  — living room
    //ki  — kitchen
    //Ha— Hallway
    //Use switch statement to write a program to print which room light is turned on
    //For example if Bd was targetOption
    //then print  you have turned on bedroom light
// combining multiple condition togerge r
// in java there is no range check directly like math
// for example   int x = 70
// in math  :     60 < x < 100   -->>  true < 100
// in Java  :      x > 60  && x <100
// && 2 ampersand  & 1 ampersand   -->> Logical AND operator
    // This is used to check both conditions are true at the same time
// Think about login example
// only when your username is right and your password is right at the same time
// then you will be able to login
/*                  true       true
* int x = 70 ;    x > 60  && x <100 ;  true
*
                    false      true
* int x = 10 ;    x > 60  && x <100 ;  false
*
                    true       false
 *int x = 110 ;   x > 60  && x <100 ;  false
 *
                    true       true
 *int x = 99 ;    x > 60  && x <100 ;  true
 *
 *
* */
  //||  2 pipe  or  | 1 pipe is used for compiling 2 conditions  : Logical  OR Operator
   // If you have 2 conditions to check
   // When will this be true  :  As long as one side is true , whole result will be true
// think about buying milk from 2 stores :
   // As long as you found the milk in one store , you got the milk then you get out !
    //How do I type  pile character on keyboard   |   —>> shift \
    //As long as one side is true   whole result will be true
      //      / *
      //      true             false
    //int x = 70 ;     x>10   ||   x < 5      —>> true
        //    false.      false
    //int x = 7 ;     x>10   ||   x < 5      —>> false
      //      true.      false
    //int x = 17 ;     x>10   ||   x < 5      —>> true
      //      false        true
    //int x = -8 ;     x>10   ||   x < 5      —>> true
    //        * /
}
