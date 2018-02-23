import java.util.*;
import java.*;


public class Lab2Methods {

    public static void main(String[] args) {

        //all of the arrays are for testing purposes only. I left them there to make it easier on the TA to test my code.

        List<String> array1 = new ArrayList<>();//arrray test type 1
        List<Integer> array2 = new ArrayList<>();//array test type 2
        List<String> arrayunique = new ArrayList<>();//array for unique

        List<Integer> perm1 = new ArrayList<>();// list one for permutation method
        List<Integer> perm2 = new ArrayList<>();// list two for permutation method

        String forlistofwords = "hi this is Anthony's string and it should be split after you run this!!";

        array1.add("tiny"); array1.add("program"); array1.add("computer"); array1.add("small"); array1.add("shy"); array1.add("shy");

        array2.add(2); array2.add(4); array2.add(6); array2.add(8); array2.add(10); array2.add(12);

        arrayunique.add("happy");  arrayunique.add("happy");  arrayunique.add("happy");  arrayunique.add("happy");

        perm1.add(1);  perm1.add(9);  perm1.add(5);  perm1.add(9);  perm1.add(7);  perm1.add(2);
        perm2.add(1);  perm2.add(5);  perm2.add(1);  perm2.add(7);  perm2.add(9);  perm2.add(2);





       // System.out.println(unique(arrayunique));

       // System.out.println(allMultiples(array2, 4));

       // System.out.println(allStringsOfSize(array1, 3));

        System.out.println(isPermutation(perm1, perm2));

       // System.out.println(stringToListOfWords(forlistofwords));

       // removeAllInstances(array1, "shy");
       // System.out.println(array1);





    }

    public static <E> boolean unique(List<E> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i != j && list.get(i) == list.get(j))
                    return false;
            }
        }
        return true;
    }


    public static List allMultiples(List<Integer> inputlist, int inputInt) {

        List<Integer> newList = new ArrayList<>();


        for (int i = 0; i < inputlist.size(); i++) {
            int numb;
            if (inputlist.get(i) <= inputInt) {
                numb = inputInt % inputlist.get(i);
                if (numb == 0 && inputlist.get(i) >= inputInt) {
                    newList.add(inputlist.get(i));
                }
            }
            if (inputlist.get(i) > inputInt) {
                numb = inputlist.get(i) % inputInt;
                if (numb == 0 && inputlist.get(i) >= inputInt) {
                    newList.add(inputlist.get(i));
                }
            }
        }
        return newList;

    }

    public static List allStringsOfSize(List<String> string, int numb) {

        List<String> newList = new ArrayList<>();

        for (int i = 0; i < string.size(); i++) {
            if (string.get(i).length() == numb) {
                newList.add(string.get(i));

            }
        }
        return newList;

    }

    public static <E> boolean isPermutation(List<E> listOne, List<E> listTwo) {

        boolean same = true;

        if(listOne.size() != listTwo.size()){
            same = false;
        }

        List<E> comparedList = new ArrayList<E>(listOne);
        List<E> comparedList2 = new ArrayList<E>(listTwo);

        while(same) {
            for (int i = 0; i <comparedList.size(); i++) {
                for (int j = 0; j < comparedList2.size(); j++) {
                    if (!comparedList.get(j).equals(comparedList2.get(i))) {
                        same=true;
                        break;
                    }
                    }

                }
            }
        }
        return same;
    }

    public static List stringToListOfWords(String userString) {


        List<String> userList = new ArrayList<>();

        Scanner in = new Scanner(userString).useDelimiter("[^\\p{Alpha}'0-9]+");

        while (in.hasNext()) {
            String word2 = in.next();
            userList.add(word2);

        }return userList;
    }

    public static <E> void removeAllInstances(List<E> userList, E item){

        for(int i=0; i < userList.size(); i++){
            if(userList.get(i) == item){
                userList.remove(item);
                i--;
            }
        }
    }

}