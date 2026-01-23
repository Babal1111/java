class Spotify {
    public synchronized void playSong(int n, String type) {
        for (int i = 1; i <= n; i++) {
            System.out.println(type + " played");
        }
    }
}

class MyList1 implements Runnable {
    int n;
    String type;
    Spotify spotify;

    public MyList1(int n, String type, Spotify spotify) {
        this.n = n;
        this.type = type;
        this.spotify = spotify;
    }

    @Override
    public void run() {
        spotify.playSong(n, type);
    }
}

class MyList2 implements Runnable {
    int n;
    String type;
    Spotify spotify;

    public MyList2(int n, String type, Spotify spotify) {
        this.n = n;
        this.type = type;
        this.spotify = spotify;
    }

    @Override
    public void run() {
        spotify.playSong(n, type);
    }
}

public class Main {
    public static void main(String[] args) {
        Spotify spotify = new Spotify();

        MyList1 list1 = new MyList1(5, "Rock song", spotify);
        MyList2 list2 = new MyList2(5, "Pop song", spotify);

        Thread t1 = new Thread(list1);
        Thread t2 = new Thread(list2);

        t1.start();
        t2.start();
    }
}
