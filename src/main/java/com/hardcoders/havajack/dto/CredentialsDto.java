package com.hardcoders.havajack.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class CredentialsDto implements Serializable {
    private String phone;
    private String password;
}
