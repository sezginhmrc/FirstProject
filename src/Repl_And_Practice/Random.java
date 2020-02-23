package Repl_And_Practice;

public class Random {
    public static void main(String[] args) {

        //EMPLOYEE TASK

        // TASK 1
        //   System.out.println("JOB TITTLES " + "\n");
        //        for (int i = 0; i < employees.length; i++) {
        //
        //            int firstIndex = employees[i].indexOf("[");
        //            int lastIndex = employees[i].lastIndexOf("]");
        //
        //            String jobTittles = employees[i].substring(firstIndex + 1, lastIndex);
        //            System.out.println(i + 1 + "." + jobTittles);
        //        }

        //TASK 1
        //for(String each : employees){
        //            System.out.println(each.substring(each.indexOf("[")+1,each.indexOf("]")));
        //     }

        //TASK 1
        // for (String eachOne : employees){
        //            String jobTittle = eachOne.substring(eachOne.indexOf("[")+1,eachOne.indexOf("]"));
        //            System.out.println("jobTittle = " + jobTittle);
        //        }

        //TASK 2
        // for (int z = 0; z < employees.length; z++) {
        //
        //            String first = employees[z].substring(0, employees[z].indexOf(" "));
        //            String last = employees[z].substring(employees[z].indexOf(" ") + 1, employees[z].indexOf("[") - 1);
        //            String job = employees[z].substring(employees[z].indexOf("[") + 1, employees[z].indexOf("]"));
        //            System.out.println(first + "-" + last + " " + job);
        //            //     String firstAndLastNameFixed = employees[z].replace(" ","-");
        //
        //        }


        //TASK 2
        // for (String eachOne : employees) {
        //
        //            String firstName = eachOne.substring(0, eachOne.indexOf(" "));
        //            String lastName = eachOne.substring(eachOne.indexOf(" ") + 1, eachOne.indexOf("[") - 1);
        //            String jobTittle = eachOne.substring(eachOne.indexOf("[") + 1, eachOne.indexOf("]"));
        //            System.out.println(firstName + "-" + lastName + " " + jobTittle);
        //
        //        }

        // TASK 3
        // for (String twoempl:employees) {
        //            if (twoempl.toLowerCase().contains("tracy bartle")){
        //                if(twoempl.toLowerCase().contains("geological engineer")){
        //                    System.out.println("PASS: Verification successful. Tracy Bartle's job is Geological Engineer");
        //                }else{
        //                    System.out.println("FAIL: Verification error:  Tracy Bartle's job is NOT Geological Engineer");
        //                }
        //            }
        //            if (twoempl.toLowerCase().contains("skipper abrahamsson")){
        //                if(twoempl.toLowerCase().contains("financial advisor")){
        //                    System.out.println("PASS: Verification successful. Skipper Abrahamsson's job is Financial Advisor");
        //                }else{
        //                    System.out.println("FAIL: Verification error:  Skipper Abrahamsson's job is NOT Financial Advisor");
        //                }
        //            }
        //
        //    }
        //}



        // TASK 3
        // //"Valerye Abarrow [Senior Editor] vabarrow25@last.fm",
        //        String verification="false", verify="false";
        //        for (int i = 0; i <employees.length ; i++) {
        //            String firstLast=employees[i].substring(0,employees[i].indexOf("[")-1);
        //            String job=employees[i].substring(employees[i].indexOf("[")+1,employees[i].indexOf("]"));
        //            if((firstLast.equals("Tracy Bartle")) && job.equals("Geological Engineer"))
        //                verification="true";
        //            if((firstLast.equals("Skipper Abrahamsson"))&& job.equals("Financial Advisor"))
        //                verify="true";
        //        }
        //        if(verification.equals("true")) {
        //            System.out.println("PASS: Verification successful. Tracy Bartle's job is Geological Engineer");
        //        }else System.out.println("FAIL: Verification error:  Tracy Bartle's job is NOT Geological Engineer");
        //        if(verify.equals("true")) {
        //            System.out.println("PASS: Verification successful. Skipper Abrahamsson's job is Financial Advisor");
        //        }else System.out.println("FAIL: Verification error:  Skipper Abrahamsson's job is NOT Financial Advisor");
        //    }


        //TASK 4
        //for(String eachC : employees){
        //           String firstNameFixed = eachC.substring(0,1) ;
        //           String lastNameFixed = eachC.substring(eachC.indexOf(" ")+1,eachC.indexOf(" ")+2);
        //           String jobTittleFixed = eachC.substring(eachC.indexOf("[")+1,eachC.indexOf("]"));
        //            System.out.println(firstNameFixed+""+lastNameFixed+" "+jobTittleFixed);
        //        }

    }
}