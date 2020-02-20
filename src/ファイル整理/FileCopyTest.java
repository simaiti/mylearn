package ファイル整理;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FileCopyTest {
	FileCopy c = new FileCopy();
	FileDelete d = new FileDelete();

	void testGetList() {
		String destinationDir = "C:\\Users\\am\\Documents\\memo\\";
		c.setWord();

		c.setList(destinationDir);

		fail("まだ実装されていません");
	}


	void testSetTarget() {
		//		System.out.println(FileCopy.setTarget());

		fail("まだ実装されていません");
	}

	@Test
	void makedir() {

		c.setWord();

		c.makeDir();

		fail("まだ実装されていません");
	}

}
