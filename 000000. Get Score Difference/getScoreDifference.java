class solution{
	private static int getScoreDifference(int[] numSeq, int n){
		int firstPlayer_score = 0;
		int secondPlayer_score = 0;
		boolean left_to_right = true;
		int left = 0;
		int right = numSeq.length - 1;
		boolean player_01 = true;
		int move = 0;

		while(move < n){
			if(left_to_right){
				if(left == numSeq.length){
					left = 0;
				}
				if(player_01){
					firstPlayer_score += numSeq[left];
					// switch player
					player_01 = false;
				}else{
					secondPlayer_score += numSeq[left];
					player_01 = true;
				}
				// decide reversed the seq if the removed number is even
				if(numSeq[left] % 2 == 0){
					left_to_right = false;
				}
				left++;
			}else{
				if(right == 0){
					right = numSeq.length - 1;
				}
				if(player_01){
					firstPlayer_score += numSeq[right];
					player_01 = false;
				}else{
					secondPlayer_score += numSeq[right];
					player_01 = true;
				}
				if(numSeq[right] % 2 == 0){
					left_to_right = true;
				}
				right--;
			}
			move++;
		}

		return Math.abs(firstPlayer_score - secondPlayer_score);
	}

	public static void main(String[] args) {

		int[] numSeq = {2,2};
		int n = 4;

		int result = getScoreDifference(numSeq, n);
		System.out.println(result);
		
	}
}