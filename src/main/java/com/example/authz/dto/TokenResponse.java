package com.example.authz.dto;

public class TokenResponse {
    private String tokenType;
    private String token;
    private long expiresInSeconds;

    public TokenResponse(String tokenType, String token, long expiresInSeconds) {
        this.tokenType = tokenType;
        this.token = token;
        this.expiresInSeconds = expiresInSeconds;
    }

    public String getTokenType() { return tokenType; }
    public String getToken() { return token; }
    public long getExpiresInSeconds() { return expiresInSeconds; }
}
