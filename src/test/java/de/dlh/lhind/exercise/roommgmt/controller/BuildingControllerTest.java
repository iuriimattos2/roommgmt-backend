package de.dlh.lhind.exercise.roommgmt.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import de.dlh.lhind.exercise.roommgmt.model.Building;
import de.dlh.lhind.exercise.roommgmt.service.BuildingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = BuildingController.class)
class BuildingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BuildingService mockedBuildingService;

    private static final Long BUILDING_ID = 1L;
    public static final String BUILDING_NUMBER = "001";
    public static final String BUILDING_DESCRIPTION_STRING = "Zentrale";
    public static final Boolean PUBLIC_ACCESS = true;
    public static final String BUILDING_URL = "/buildings";

    @Test
    public void shouldReturnAllBuildings_whenFindAll_givenValidGetRequest() throws Exception {
        // given
        var building = createBuilding();
        List<Building> buildings = Collections.singletonList(building);
        ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();

        // when
        when(mockedBuildingService.getAllBuildings()).thenReturn(buildings);

        // then
        mockMvc.perform(get(BUILDING_URL))
                .andExpect(status().isOk())
                .andExpect(content().json(objectWriter.writeValueAsString(buildings)));;
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






