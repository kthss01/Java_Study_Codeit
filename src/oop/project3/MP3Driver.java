package oop.project3;

/*
  MP3 플레이리스트

  구조
  아티스트는 여러 앨범을 가지고 있음
  한 앨범은 여러 노래를 담고 있음

  아티스트
    변수
        이름, 앨범 리스트
    메소드
        생성자(이름)
        addAlbum(Album)
        getAlbums()
  앨범
    변수
        제목, 발매년도, 가수, 노래 리스트
    메소드
        생성자(제목, 발매년도, 가수)
        addTrack(Song)
        getTrack()
  노래
    변수
        제목, 가수, 앨범
    메소드
        생성자(제목, 가수, 앨범)
        toString()
        노래 제목 - 가수 이름
        앨범 제목(발매년도)
*/

public class MP3Driver {
    public static void main(String[] args) {
        Artist keithJarrett = new Artist("Keith Jarrett");

        Album theMelodyAtNightWithYou = new Album("The Melody At Night With You", 1999, keithJarrett);
        theMelodyAtNightWithYou.addTrack(new Song("I Loves You, Porgy", keithJarrett, theMelodyAtNightWithYou));
        theMelodyAtNightWithYou.addTrack(new Song("I Got It Bad (and That Ain't Good)", keithJarrett, theMelodyAtNightWithYou));
        theMelodyAtNightWithYou.addTrack(new Song("Don't Ever Leave Me", keithJarrett, theMelodyAtNightWithYou));
        theMelodyAtNightWithYou.addTrack(new Song("Someone to Watch over Me", keithJarrett, theMelodyAtNightWithYou));

        Album insideOut = new Album("Inside Out", 2001, keithJarrett);
        insideOut.addTrack(new Song("From the Body", keithJarrett, insideOut));
        insideOut.addTrack(new Song("Inside Out", keithJarrett, insideOut));

        keithJarrett.addAlbum(theMelodyAtNightWithYou);
        keithJarrett.addAlbum(insideOut);

        Artist bts = new Artist("방탄소년단");

        Album darkAndWild = new Album("DARK & WILD", 2014, bts);
        darkAndWild.addTrack(new Song("Intro: What am I to You", bts, darkAndWild));
        darkAndWild.addTrack(new Song("Danger", bts, darkAndWild));

        Album wings = new Album("WINGS", 2016, bts);
        wings.addTrack(new Song("Intro: Boy Meets Evil", bts, wings));
        wings.addTrack(new Song("피 땀 눈물", bts, wings));
        wings.addTrack(new Song("Begin", bts, wings));
        wings.addTrack(new Song("Lie", bts, wings));


        bts.addAlbum(darkAndWild);
        bts.addAlbum(wings);

        System.out.println(keithJarrett.getAlbums().get(0).getTrack(2).toString());
        System.out.println();
        System.out.println(bts.getAlbums().get(1).getTrack(3).toString());
    }
}
