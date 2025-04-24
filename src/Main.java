import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int dataPins[] = {2445,9876,6542,0123,1296,8803,9077,0141,7012,1066};
        int searchItem = 9077;

        Arrays.sort(dataPins);
        int position = pinSearch(dataPins,searchItem);

        if (position == -1){
            System.out.println(searchItem + " not found!!");
        }else{
            //Print
            System.out.print(Arrays.toString(dataPins));
            System.out.print("\nPosition of " + searchItem + ": " + position);
        }
    }

    public static int pinSearch(int pins[],int searchPin){
        int firstIndex = 0;
        int lastIndex = pins.length - 1;
        int midIndex;


        while(firstIndex <= lastIndex){
            midIndex = (firstIndex + lastIndex) / 2;
            if (pins[midIndex] == searchPin){
                return midIndex +1; //Add one for user interpretation
            } else if (pins[midIndex] < searchPin) {
                firstIndex = midIndex + 1;
            }else {
                lastIndex = midIndex - 1;
            }
        }

        return -1;
    }
}