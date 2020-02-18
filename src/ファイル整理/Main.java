package ファイル整理;

public class Main {




	public static void main(String[] args) {
		/*単語を入力して検索し、該当するファイル・フォルダを指定したフォルダにコピーor移動
		 * させる、コピーの場合は元のフォルダ・ファイルを削除する。
		 * 移動先のフォルダがない場合は確認後に作成or中断
		 * 検索先ディレクトリの指定
		 *
		 *損失が出ないようにするには？
		 *実行速度・容量を制限するには？　←　実行速度の調整などはjavaが勝手にやってくれるらしい
		 *隠しファイルなどは移動させないようにする
		 *
		 *削除・移動の操作をデバッグする場合には十分に注意して行う。（OSが起動しなくなる可能性あり）
		 *
		 *指定した文字列を含む行を
		 *
		 *
		 *
		 *以下、特に必要はない機能＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
		 *
		 *前回実行時の値を入力欄に保持して起動する
		 *
		 * */


		//コマンドの選択画面
		String destinationDir = null;
		String selectAct = "default";
		String currentList = null ;

		FileCopy c = new FileCopy();
		FileDelete d = new FileDelete();

		destinationDir = "C:\\Users\\am\\Documents\\memo\\";
		System.out.println("コマンドを入力してください");
		selectAct = new java.util.Scanner(System.in).nextLine();
		if(selectAct == "copy" ) {
			c.getList(destinationDir);
		}else if(selectAct == "delete") {
			d.fileDelete(currentList);
		}else {

		}

	}

}
