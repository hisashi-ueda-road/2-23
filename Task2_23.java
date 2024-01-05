package task2_23;

import constants.Constants;
import language.Language;
import person.Person;


public class Task2_23 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
      //①インスタンス名「yamada」というインスタンスを作成して下さい。
        //引数には1:山田太郎 2:Java を入れて下さい。また「Java」は、Constants.javaのものを扱って下さい。
        Person yamada = new Person("山田太郎", Constants.LANGUAGE3);

        //②作成したインスタンスを利用し名前を表示して下さい。またインスタンス名は、「」で定義して下さい。
        yamada.introduce();
        //③インスタンス名「yamada1」というインスタンスを作成して下さい。
        //引数には1:山田太郎 2:Java を入れて下さい。また「Java」は、Constants.javaのものを扱って下さい。
        Language yamada1 = new Language("山田太郎", Constants.LANGUAGE3);

        //④作成したインスタンスを利用し学んでいる言語を表示して下さい。
        yamada1.studyLanguage();


    }

}
