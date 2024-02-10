package com.swadeshi.app.dto;

public record AuthenticationResponse(String username,String jwtToken,int role) {

}
