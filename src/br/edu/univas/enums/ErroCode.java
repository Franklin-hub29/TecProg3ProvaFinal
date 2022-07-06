package br.edu.univas.enums;

public enum ErroCode {
	
	VALIDATION(1),
	FILENOTFOUD(2);
	
	int code;
	
	ErroCode(int code){
		this.code = code;
		
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	public static ErroCode fromCode(int code) {
		 
		for (ErroCode codes : ErroCode.values()) {
            if (codes.getCode().equals(code){
            	return codes;
            } 	
	          
		
		}
		return null;

}
}