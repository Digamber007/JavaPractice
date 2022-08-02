package JumpProblems;

class JumpGame {

    public boolean canJump(int[] nums) {
		int end=nums.length-1;
		int jump=0;
		for(int i=nums.length-2;i>=0;i--) {
			jump=nums[i]+i;
			if(jump>=end)
				end=i;
		}
		return end==0;
	}
	public boolean canJump1(int[] nums) {
		if (nums.length <= 1)
			return true;

		// the largest index that can be reached.
		int largestIndex = nums[0];

		for (int i = 0; i < nums.length; i++) {
			if (largestIndex <= i && nums[i] == 0)
				return false;

			if (i + nums[i] > largestIndex) {
				largestIndex = i + nums[i];
			}

			// is max is enough to reach the end?
			if (largestIndex >= nums.length - 1)
				return true;
		}
		return false;
	}
    
    public static void main(String[] args) {
       
       // int[] nums= {2,3,1,1,4};
		int[] nums= {3,2,1,0,4};
		
		System.out.println("Can jump? "+new JumpGame().canJump(nums));
    }

}
