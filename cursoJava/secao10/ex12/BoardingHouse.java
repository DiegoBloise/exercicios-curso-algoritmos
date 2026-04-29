package cursoJava.secao10.ex12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoardingHouse {

    private final Integer TOTAL_ROOMS = 9;

    private List<Student> rooms = new ArrayList<>(Collections.nCopies(TOTAL_ROOMS, null));

    public BoardingHouse() {
    }

    public String getBusyRooms() {
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i) != null) {
                buffer.append(String.format("%d: %s\n", i, rooms.get(i).toString()));
            }
        }

        return buffer.isEmpty() ? "All rooms are available." : buffer.insert(0, "\nBusy rooms:\n").toString();
    }

    public List<Integer> getAvailableRooms() {
        List<Integer> availableRooms = new ArrayList<>();

        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i) == null) {
                availableRooms.add(i);
            }
        }

        return availableRooms;
    }

    public Boolean rentRoom(Integer number, Student student) {
        if (this.rooms.get(number) == null) {
            this.rooms.set(number, student);
            return true;
        }
        return false;
    }
}