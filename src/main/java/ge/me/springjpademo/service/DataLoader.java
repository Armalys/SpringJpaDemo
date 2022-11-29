package ge.me.springjpademo.service;

import ge.me.springjpademo.model.Aircraft;
import ge.me.springjpademo.repository.AircraftRepository;
import lombok.AllArgsConstructor;

import javax.annotation.PostConstruct;
import java.time.Instant;

//@Component
@AllArgsConstructor
public class DataLoader {
    private final AircraftRepository aircraftRepository;

    @PostConstruct
    private void loadData() {
        aircraftRepository.deleteAll();
        aircraftRepository.save(new Aircraft(81L,
                                             "AAL608", "1451", "N754UW", "AA608", "IND-PHX", "A319", "A3",
                                             36000, 255, 423, 0, 36000,
                                             39.150284, -90.684795, 1012.8, 26.575562, 295.501994,
                                             true, false,
                                             Instant.parse("2020-11-27T21:29:35Z"),
                                             Instant.parse("2020-11-27T21:29:34Z"),
                                             Instant.parse("2020-11-27T21:29:27Z")
        ));
    }

}