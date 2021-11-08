package exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-11-07 14:37
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article {
    private String id;
    private String title;
    private String content;
    private List<Img> imgList;


}
