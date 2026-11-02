class twosum2{
     public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        System.out.println("hello world");
        int [] ans= new int[2];
        int start=0; int end=arr.length-1;
        while(start<end){
            if(arr[start]+arr[end]==target){
                ans[0]=start+1;
                ans[1]=end+1;
                break;
            }else if(arr[start]+arr[end]<target){
                start++;
            }else{
                end--;
            }
        }

        for(int i :ans)
            System.out.print(i+" ");

    }
}