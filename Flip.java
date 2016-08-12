static int flip (int num) {
		return ((Integer.highestOneBit(num) << 1) - 1) ^ num;
	}
