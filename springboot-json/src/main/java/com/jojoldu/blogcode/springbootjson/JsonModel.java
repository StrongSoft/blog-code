package com.jojoldu.blogcode.springbootjson;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by jojoldu@gmail.com on 2018-12-14
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@ToString
@Getter
@Setter
@NoArgsConstructor
public class JsonModel {
    private String name;

//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "Asia/Seoul")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime requestDateTime;
}
