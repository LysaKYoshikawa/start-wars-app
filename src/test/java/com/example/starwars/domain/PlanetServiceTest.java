package com.example.starwars.domain;

import static com.example.starwars.common.PlanetConstants.INVALID_PLANET;
import static com.example.starwars.common.PlanetConstants.PLANET;
import static  org.assertj.core.api.Assertions.assertThat;
import static  org.assertj.core.api.Assertions.assertThatThrownBy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class PlanetServiceTest {
    @InjectMocks
    private PlanetService planetService;
    @Mock
    private PlanetRepository planetRepository;

    @Test
    public void createPlanet_WithValidData_ReturnsPlanet() {
        when(planetRepository.save(PLANET)).thenReturn(PLANET);
        // system under test
        Planet sut = planetService.create(PLANET);

        assertThat(sut).isEqualTo(PLANET);
    }

    @Test
    public void createPlanet_WithInvalidData_ThrowsException(){
        when(planetRepository.save(INVALID_PLANET)).thenThrow(RuntimeException.class);

        assertThatThrownBy(() -> planetService.create(INVALID_PLANET)).isInstanceOf(RuntimeException.class);

    }
    @Test
    public void getPlanet_ByExistingId_ReturnPlanet(){
        Long id = 1L;
        when(planetRepository.findById(id)).thenReturn(Optional.of(PLANET));

        Optional<Planet> sut = planetService.get(id);

        assertThat(sut).isPresent();
        assertThat(sut.get()).isEqualTo(PLANET);
    }
    @Test
    public void getPlanet_ByUnexistingId_ReturnPlanet(){
        Long id = 1L;
        when(planetRepository.findById(id)).thenReturn(Optional.empty());

        Optional<Planet> sut = planetService.get(id);

        assertThat(sut).isNotPresent();

    }

}