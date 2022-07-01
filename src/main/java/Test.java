

import java.util.*;



public class Test {
    public static void main(String[] args){
        /**/


     // getList();
    // twoSum();
    // sumOfElementsWithRoundVal
  /*
        for (int i = 1; i <= 10; ++i) {
            System.out.print(fibonacciNumbers(i)+" ");
        }
        */




        //System.out.println(digitOfNumbers(15456));

        //armStrong(13);

        //System.out.println("Reverse string is "+reverseString("I eat apple"));

        //System.out.println(String.valueOf(verifyAnagram("peek","keep")));

        //System.out.println("Reverse integer is "+reverseNum(153));

        System.out.println(remainder(7, 2));





    }


/*add the ceil/floor value of list elements using List interface where result will be a round value*/
    public static void sumOfElementsWithRoundVal(){
        List<Double> lt= new ArrayList<>();
        lt.add(2.5);
        lt.add(5.6);
        lt.add(8.33);
        double item,sum=0;
        int total=0;


        for(int i=0;i<lt.size();i++){
            item=Math.ceil(lt.get(i));
            sum=sum+item;
        }
        total=(int)Math.round(sum);
        System.out.println("Sum is "+total);
    }



/*
* - Create a Person class that has firstname lastname and id.
- Create a method that has an input of List<Person>
- Task is to go through list and return Map<String, List<Person>>
* where the key is the common lastname and the value is the list of people that share the same lastname.
* */

    public static void getList(){
        //create list interface with Person class to store data using Person class constructor
        List<Person> personList=new ArrayList<>();
        //adding data in list using constructor
        personList.add(new Person("5","n","e"));
        personList.add(new Person("1","a","b"));
        personList.add(new Person("2","m","b"));
        personList.add(new Person("3","z","b"));
        personList.add(new Person("7","g","f"));
        personList.add(new Person("4","i","e"));

        personList.add(new Person("6","g","e"));

      // Person mn= new Person("6","l","g");
        //create map with last name with the lists
       HashMap<String,List<Person>> mapping= new HashMap<>();



       //run a loop through the list to add list data into the map considering Lastname as keyset where lists are performed as balues
       for(int i=0;i<personList.size();i++){





                   mapping.put(personList.get(i).Lastname,personList);
       




           }

        System.out.println("Maps values "+mapping.values().size());
        System.out.println("Maps key set "+mapping.keySet());
     
        //get value of the keyset one by one using for loop
        for(String keyValue : mapping.keySet()){
            //run a loop through lists as the list is value regarding the key set
            for(int listPosition=0;listPosition<mapping.get(keyValue).size();listPosition++){
                //to compare if any key set value matchs with the lists' classes' last name
                if(mapping.get(keyValue).get(listPosition).Lastname.equals(keyValue)){
                    System.out.println("key is "+keyValue+" values    "+mapping.get(keyValue).get(listPosition).Firstname);
                }
            }
        }






       /*
       for(List<Person> k: mapping.values()){

            System.out.println("k size "+k);
           for(int l=0;l<k.size();l++){
               //String firstname = k.get(l).Firstname;
               System.out.println(k.get(l).Firstname + " with ids "+k.get(l).Id);



           }

       } */

    }


    /* Check any two of the array elements' sum is equal to target sum */
    public static void twoSum(){
      int[] arr={1,2,3,4,5,6};
      int sum =10;

      List<Integer> num2list=new ArrayList<>();
      List<Integer> num2list_2=new ArrayList<>();
      List<Integer> twoVal=new ArrayList<>();


      for(int i=0;i<arr.length;i++){
          num2list.add(arr[i]);
      }

     // num2list_2=num2list;

      for(int j=0;j<num2list.size();j++){

          int firstNum=num2list.get(j);


              Random rndm=new Random();
              int rndmIndex=rndm.nextInt(num2list.size());
              int seconNum=num2list.get(rndmIndex);
              int sumVal=firstNum+seconNum;
              if(j!=rndmIndex) {
                  if (sum == sumVal) {


                     if(j<rndmIndex){
                         twoVal.add(j);
                         twoVal.add(rndmIndex);
                     }
                     else{

                         twoVal.add(rndmIndex);
                         twoVal.add(j);
                     }

                      System.out.println(twoVal);
                     // System.out.println("third num list is "+num2list_2);
                  }

              }
              //twoVal.clear();

          //num2list.add(j,firstNum);
         // System.out.println("third num list is "+num2list);
      }

    }

    /*generate fibonacci numbers*/
    public static int fibonacciNumbers(int target){
        if(target==1 || target==2){
            return 1;
        }

        return fibonacciNumbers(target-1)+fibonacciNumbers(target-2);
    }


    /*Adding digits of an integer in recursive way*/

    public static int sumOfDigitOfNumbers(int num){
        int temp=num;
        int digit=0;
        int sum=num%10;
        if(num ==0){
            return 0;
        }

        else {

            return sum + sumOfDigitOfNumbers(num / 10);
        }
    }


    /* ArmStrong - sum of the power with size of each digit*/

    public static void armStrong(int num){
        int temp=num;
        int size=countDigit(num);
        int digit=0;
        int sum=0;

        while(temp !=0){
            digit=temp%10;
            sum=sum+(int)Math.pow(digit,size);
            temp=temp/10;
        }

        System.out.println("Armstrong sum is "+sum);

    }

    public static int countDigit(int num){
        return (int)Math.floor(Math.log10(num))+1;
    }


    /*Reverse a string using recursion*/
    public static String reverseString(String inputString){
        if(inputString.isEmpty()){
            return inputString;
        }


            String[] store=inputString.split(" ",2);
            String initialPart=store[0];
            String remainPart="";
            if(store.length==2){
                remainPart=store[1];
            }

            return reverseString(remainPart)+initialPart+" ";

    }

    /*Anagram to check string elements have the same chaar valueing ASCII*/
    public static boolean verifyAnagram(String input1, String input2){
        boolean matched=false;
        char[] sort1=input1.toCharArray();
        char[] sort2=input2.toCharArray();

        Arrays.sort(sort1);
        Arrays.sort(sort2);

        return Arrays.equals(sort1,sort2);
    }

    /*Reverse the digits of an integer*/
    public static int reverseNum(int num){
        int sum=0;
        while(num !=0){
            int lastDigit=num%10;
            sum=(sum*10)+lastDigit;
            num=num/10;
        }

        return sum;
    }


/*Write a function that can find the remainder when dividing two positive integers (int a by int b) where int a is bigger than int b. The result is returned as an integer. You are not allowed to use the standard divide (/) or Modulo (%) function in the programming language.*/
    public static int remainder(int a, int b) {
        int sum = a;

        /*
        if (sum >= b) {
            sum = remainder(sum - b, b);
        } */


        while(sum>b){
            sum=sum-b;
            System.out.println(sum);
        }


//}

        return sum;

    }



















        }




      // System.out.println(ps.get(0).Firstname);








