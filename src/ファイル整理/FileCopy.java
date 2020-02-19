package ファイル整理;

import java.io.File;
import java.io.FilenameFilter;

public class FileCopy {
	//該当するファイル・フォルダがなくなるまで繰り返しコピーさせる
	//1度処理を行ったファイルは無視する
	private String targetName;

	public File[] getList(String destinationDir) {
		File dir = new File(destinationDir);
		File[] list = dir.listFiles();

		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}

		System.out.println(targetName);

		FilenameFilter filter = new FilenameFilter() {
			@Override
			public boolean accept(File dir, String str) {
				if (str.indexOf(targetName) != -1) {
					return true;
				} else {
					return false;
				}
			}
		};
		list = dir.listFiles(filter);
		for (int i = 0; i < list.length; i++) {
			//			System.out.println(list[i]);//ここをリストに書き込みに変更する

		}
		return list;
	}

	public void copy(File[] list) {
		for (int i = 0; i > list.length; i++) {
			
		}
	}

	public String setTarget() {
		//		後々GUIにする
		System.out.println("検索する単語を入力してください");
		targetName = new java.util.Scanner(System.in).nextLine();
		return targetName;
	}

	public void makeDir() {
		File targetDir = new File("./" + targetName);

		if (!targetDir.exists()) {
			targetDir.mkdir();
		}
	}

}
