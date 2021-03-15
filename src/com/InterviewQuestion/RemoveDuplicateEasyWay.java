package com.InterviewQuestion;

public class RemoveDuplicateEasyWay {

    public int removeDupl(int[] array){

        int index=1;
        for(int i=0; i<array.length-1; i++){
            if(array[i]!=array[i+1]){
                array[index++]=array[i+1];
            }
        }

        return index;
    }

    public static void main(String[] args) {
        RemoveDuplicateEasyWay obj = new RemoveDuplicateEasyWay();
        int [] array = {1,1,3,4,5,5,5,6};

        System.out.println(obj.removeDupl(array));



    }
}
