class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                nums[++j]=nums[i];
            }
            
        }return ++j;
    }
    public static void main(String[] args) {
       removeDuplicates r1=new removeDuplicates();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int k = r1.removeDuplicates(nums);

        System.out.println("unique elements: " + k);
    }
}