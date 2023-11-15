package programers.newbi;

public class Similarity {

	public static void main(String[] args) {
		String[] str1 = { "a", "12345678910", "c" };
		String[] str2 = {"b", "c"};
		int count = 0;
		
		boolean constraint1 = arrChk(str1, 100, 10);
        boolean constraint2 = arrChk(str2, 100, 10);
        
        if(constraint1 && constraint2){
        	int str1Sz = str1.length;
        	int str2Sz = str2.length;
        	
            for(int i = 0; i < str1Sz; i++) {
            	for(int j = 0; j < str2.length; j++) {
            		if(str1[i].equals(str2[j])) {
            			count++;
            		}
            	}
            }
        }
        System.out.println(count);
	}

	/**
	 * 배열의 길이, 원소의 길이, 널 여부 검사
	 * 
	 * @param strArr       : 검사할 배열
	 * @param arrMaxSz     : 배열 최대 사이즈
	 * @param strAtomMaxSz : 배열의 각 원소 문자열 최대 사이즈
	 * @return 검사 완료 true, 검사 실패 false
	 * @memo 
	 */
	public static boolean arrChk(String[] strArr, int arrMaxSz, int strAtomMaxSz) {
		
		if (arrSizeChk(strArr, arrMaxSz)) {
			int strArrSz = strArr.length;
			for (int i = 0; i < strArrSz; i++) {
				if(!arrAtomSizeChk(strArr[i], 10)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	/**
	 * 문자열 배열의 최대 사이즈, null 검사 
	 * @param strArr : 문자열 배열
	 * @param arrMaxSz : 문자열 배열 최대 사이즈
	 * @return 검사 완료 true, 검사 실패 false
	 * @memo arrMinSz 문자열 배열 최소 사이즈 1 이상
	 */
	public static boolean arrSizeChk(String[] strArr, int arrMaxSz) {
		int arrMinSz = 1; // 문자열 배열 최소 사이즈 1 이상
		
		if(strArr != null) {
			int strArrSz = strArr.length;
			if(arrMinSz <= strArrSz && strArrSz <= arrMaxSz)
				return true;
		}
		
		return false;
	}
	
	/**
	 * 문자열 길이 체크 최대사이즈, null 검사
	 * @param str : 문자열
	 * @param strMaxSz : 문자열 최대 사이즈
	 * @return 검사 완료 true, 검사 실패 false
	 * @memo strMinSz : 문자열 최소 사이즈 1 이상
	 */
	public static boolean arrAtomSizeChk(String str, int strMaxSz) {
		int strMinSz = 1; // 문자열 길이 최소 사이즈
		
		if(str != null) {
			int strSz = str.length();
			if(strMinSz <= strSz && strSz <= strMaxSz)
				return true;
		}
		
		return false;
	}
}
