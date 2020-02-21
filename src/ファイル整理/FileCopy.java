package ファイル整理;

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCopy {
	private String targetName;
	private String destinationDir;
	private File dir = new File(destinationDir);
	private File[] list = dir.listFiles();

	public void setWord() {
		//		後々GUIにする
		System.out.println("検索する単語を入力してください");

		targetName = new java.util.Scanner(System.in).nextLine();
	}

	public void setDestinationDir(String destinationDir) {
		//		後々GUIにする
		System.out.println("コピー先のフォルダを指定してください");

		this.destinationDir = destinationDir;
	}

	public void setList(String destinationDir) {

		//		値の確認用
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		System.out.println(targetName + "で絞りこみます");

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
		//		値の確認用
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

	private void copyFile() {
		// TODO 自動生成されたメソッド・スタブ



	}

	public void recordListToText(String lastList, File[] list) {
		try {
			FileWriter file = new FileWriter(lastList);
			PrintWriter pw = new PrintWriter(file);
			for (int i = 0; i > list.length; i++) {
				pw.println(list[i]);
			}
			pw.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void makeDir() {
		File targetDir = new File("./" + targetName);

		if (!targetDir.exists()) {
			targetDir.mkdir();
		}
	}

}