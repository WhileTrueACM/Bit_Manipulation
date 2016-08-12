static int flip (int num) {
		if (num == 0) return 1;
		return ((Integer.highestOneBit(num) << 1) - 1) ^ num;
	}
