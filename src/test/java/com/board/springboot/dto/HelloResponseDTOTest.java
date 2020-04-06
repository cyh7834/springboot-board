package com.board.springboot.dto;

import com.board.springboot.web.dto.HelloResponseDTO;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class HelloResponseDTOTest {

    @Test
    public void 롬복_기능_테스트() {
        String name = "test";
        int amount = 1000;

        HelloResponseDTO dto = new HelloResponseDTO(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
