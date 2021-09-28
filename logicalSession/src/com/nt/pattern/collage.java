package com.nt.pattern;

public class collage {
	private int mark;

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		if (mark<50 || mark<0) {
			System.out.println("student fail write exam again");
			this.mark = mark;

		}else if(mark>50 ||mark<100){
			System.out.println("avg result");
			this.mark = mark;

			}
			else if (mark>200) {
					System.out.println("great scored");
				this.mark = mark;
					}
			
}
}