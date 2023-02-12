package edu.miu.cs.cs425.swe_online_market_project.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UpdateUserDTO {
    private String id;
    private boolean approved;
}
