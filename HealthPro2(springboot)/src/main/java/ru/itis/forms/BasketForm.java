package ru.itis.forms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.models.User;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BasketForm {
    private Long user_id;
    private Long productId;
}