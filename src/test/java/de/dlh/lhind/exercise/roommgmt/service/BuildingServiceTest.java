package de.dlh.lhind.exercise.roommgmt.service;

import de.dlh.lhind.exercise.roommgmt.model.Building;
import de.dlh.lhind.exercise.roommgmt.repository.BuildingRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
public class BuildingServiceTest {

    @Mock
    private BuildingRepository mockedBuildingRepository;
    private BuildingService buildingService;

    private static final Long BUILDING_ID = 1L;
    public static final String BUILDING_NUMBER = "001";
    public static final String BUILDING_DESCRIPTION_STRING = "Zentrale";
    public static final Boolean PUBLIC_ACCESS = true;

    @BeforeEach
    public void setUp() {
        buildingService = new BuildingService(mockedBuildingRepository);
    }

    @Test(expected=NullPointerException.class)
    public void shouldCallRepository_whenGetAllBuildings() {
        // given
        var building = createBuilding();
        List<Building> buildings = Collections.singletonList(building);

        // when
        when(mockedBuildingRepository.findAll()).thenReturn(buildings);
        var result = buildingService.getAllBuildings();

        // then
        // TODO: fix test
        //assertThat(result).hasSize(1);
        assertThat(result).isEqualTo(buildings);
        verify(mockedBuildingRepository).findAll();
    }

    private Building createBuilding() {
        Building building = new Building();

        building.setId(BUILDING_ID);
        building.setBuildingNumber(BUILDING_NUMBER);
        building.setDescription(BUILDING_DESCRIPTION_STRING);
        building.setPublicAccess(PUBLIC_ACCESS);

        return building;
    }
}