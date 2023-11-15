package programers.newbi;

public class ArrayAtomLengthCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] arr = new String[3];
		solution(arr);
		
	}
	
	public static int solution(String[] arr) {
		int arrSz = 0;
		
		if(null != arr){
			arrSz = arr.length;
			for(int i = 0; i < arrSz; i++) {
				if(arrAtomSizeChk(arr[i], 100)) {
					
				}
			}
		}
		
		
		
		return 0;
	}

	
	/**
	 * 문자열 길이 체크 최대사이즈, null 검사
	 * @param str : 문자열
	 * @param strMaxSz : 문자열 최대 사이즈
	 * @return 검사 완료 true, 검사 실패 false
	 * @memo strMinSz : 문자열 최소 사이즈 1 이상
	 */
	public static boolean arrAtomSizeChk(String str, int MaxSz) {
		int strMinSz = 1; // 문자열 길이 최소 사이즈
		
		if(str != null) {
			int strSz = str.length();
			if(strMinSz <= strSz && strSz <= MaxSz)
				return true;
		}
		
		return false;
	}
}
