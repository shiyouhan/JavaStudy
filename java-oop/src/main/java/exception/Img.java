package exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-11-07 14:39
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Img {
    private String id;
    private String url;
    private LocalDateTime createTime;

    public Img(String s) {
    }
}
