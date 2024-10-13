class Playlist {
    private class Node {
        String title;
        String artist;
        Node next;
        Node prev;

        Node(String title, String artist) {
            this.title = title;
            this.artist = artist;
            next = null;
            prev = null;
        }
    }

    private Node current; 
    public void addSong(String title, String artist) {
        Node newNode = new Node(title, artist);

        if (current == null) {
            current = newNode;
            current.next = current;
            current.prev = current;
        } else {
            Node last = current.prev;
            last.next = newNode;
            newNode.prev = last;
            newNode.next = current;
            current.prev = newNode;
        }

        System.out.println("Song added: " + title + " by " + artist);
    }
    public void removeSong(String title) {
        if (current == null) {
            System.out.println("No songs in the playlist.");
            return;
        }

        Node temp = current;
        boolean found = false;
        do {
            if (temp.title.equals(title)) {
                found = true;
                if (temp.next == temp) { 
                    current = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                    if (current == temp) {
                        current = temp.next; 
                    }
                }
                System.out.println("Song removed: " + title);
                break;
            }
            temp = temp.next;
        } while (temp != current);

        if (!found) {
            System.out.println("Song not found: " + title);
        }
    }

    public void playNext() {
        if (current != null) {
            current = current.next;
            System.out.println("Now playing: " + current.title + " by " + current.artist);
        } else {
            System.out.println("No songs in the playlist.");
        }
    }

    public void playPrevious() {
        if (current != null) {
            current = current.prev;
            System.out.println("Now playing: " + current.title + " by " + current.artist);
        } else {
            System.out.println("No songs in the playlist.");
        }
    }
    public void displayCurrentSong() {
        if (current != null) {
            System.out.println("Currently playing: " + current.title + " by " + current.artist);
        } else {
            System.out.println("No song is currently playing.");
        }
    }

    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSong("Chuttamalle", "Shilpa Rao");
        playlist.addSong("Naatu Naatu", "Kaala Bhairava and Rahul Sipligunj");
        playlist.addSong("Ramuloo Ramulaa", "Anurag Kulkarni");

        playlist.displayCurrentSong();
        playlist.playNext();
        playlist.playPrevious();

        playlist.removeSong("Ramuloo Ramulaa");
        playlist.displayCurrentSong();
        playlist.playNext();

        
    }
}
