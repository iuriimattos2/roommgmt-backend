package de.dlh.lhind.exercise.roommgmt.service;

import de.dlh.lhind.exercise.roommgmt.repository.BuildingRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
public class BuildingServiceTest {

    @Mock
    private BuildingRepository mockedBuildingRepository;
    private BuildingService buildingService;

    @BeforeEach
    public void setUp() {
        buildingService = new BuildingService(mockedBuildingRepository);
    }

    @Test(expected=NullPointerException.class)
    public void shouldCallRepository_whenGetAllBuildings_givenNullObject() {
        // when
        when(mockedBuildingRepository.findAll()).thenReturn(null);
        var result = buildingService.getAllBuildings();

        // then
        assertThat(result).hasSize(1);
        verify(mockedBuildingRepository).findAll();
    }

}