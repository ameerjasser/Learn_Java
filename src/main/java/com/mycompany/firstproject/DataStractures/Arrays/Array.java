package com.mycompany.firstproject.DataStractures.Arrays;

import java.util.Arrays;

public class Array {
    private int count = 0;
    private int[] arr;
    public Array(int lengthA) {
        arr = new int[lengthA];
    }
    public void insert(int item){
        if(count == arr.length){
            int[] newArr = new int[arr.length+1];
            for(int i=0; i<arr.length; i++){
                newArr[i] = arr[i];
            }
            newArr[count] = item;
            arr = newArr;                  // we can also use System.arraycopy() method to copy the array
        }
        else
            arr[count] = item;

        count++;
    }

    public void insertAt(int item, int index){
        if(count <= index)
            insert(item);

        else {
            System.out.printf("count: %d + index: %d + item: %d\n", count, index, item);
            //arr[count-1] = arr[index];
            int[] m = new int[arr.length+1];
            for(int i=0; i<arr.length+1-index; i++){
                m[m.length-1-i] = arr[arr.length-1-i];
            }
            for(int k=0; k< index; k++){
                m[k] = arr[k];
            }

            m[index] = item;
            count++;
            arr = m;
        }
    }


    public void removeAt(int index){
        int[] m = new int[arr.length-1];
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();
        for(int i=0; i<arr.length-1; i++){
            if(i >= index) {
                m[i]= arr[i+1];
                //System.out.println("i: "+i);
                //continue;
            }else
                m[i]= arr[i];
        }
        count--;
        arr = m;
    }

    public int indexOf(int item){
        for(int i=0; i<count; i++){
            if(arr[i] == item)
                return i;
        }
        return -1;
    }
    public void print(){
        for(int i=0;i<count; i++){
            if( i == count-1)
                System.out.printf("%d\n",arr[i]);
            else if(i == 0)
                System.out.printf("Array: %d ", arr[i]);
            else
                System.out.printf("%d ",arr[i]);
        }
    }

    public int max(){
        int max = arr[0];
        for(int i =1; i<count; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public int[] intersect(int[] other){
        int[] intersect = new int[Math.min(arr.length, other.length)];
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<other.length; j++){
                if(arr[i] == other[j]){
                    intersect[count++] = arr[i];
                    break;
                }
            }
        }
        return Arrays.copyOf(intersect, count);
    }
    public String reverse(){
        for(int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i]= arr[arr.length-1-i];
            arr[arr.length-1-i]= temp;
        }
        return Arrays.toString(arr);
    }

}
