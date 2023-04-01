package com.sree.dao;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SaveRequest {
    private String name;
    private String yourEmail;
    private int yourPhone;
    private String subject;
    private String message;
}
