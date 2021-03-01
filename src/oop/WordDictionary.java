package oop;

/*
    나의 영어 사전

    addWord 메소드로 key, value 값을 파라미터로 받아 HashMap의 저장
    find 메소드로 key를 입력받으면 해당 value를 리턴
 */

import java.util.HashMap;

public class WordDictionary {

    private HashMap<String, String> dict;

    public WordDictionary() {
        dict = new HashMap<>();
    }

    public void addWord(String eng, String kor) {
        dict.put(eng.toLowerCase(), kor);
    }

    public String find(String eng) {
        return dict.get(eng.toLowerCase());
    }

    public static void main(String[] args) {
        WordDictionary dictionary = new WordDictionary();
        dictionary.addWord("Movie", "영화");
        dictionary.addWord("cat", "고양이");
        dictionary.addWord("Dog", "개");
        dictionary.addWord("book", "책");
        dictionary.addWord("soap", "비누");
        dictionary.addWord("Glasses", "안경");

        System.out.println(dictionary.find("Book"));
        System.out.println(dictionary.find("glasses"));
        System.out.println(dictionary.find("hello"));
    }
}
