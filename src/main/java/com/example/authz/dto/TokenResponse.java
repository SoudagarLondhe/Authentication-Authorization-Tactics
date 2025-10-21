package com.example.authz.dto;

public class TokenResponse {
    private String tokenType;
    private String token;
    private long expiresInSeconds;

    public TokenResponse() {}

    public TokenResponse(String tokenType, String token, long expiresInSeconds) {
        this.tokenType = tokenType;
        this.token = token;
        this.expiresInSeconds = expiresInSeconds;
    }

    // Getters and setters
    public String getTokenType() { return tokenType; }
    public void setTokenType(String tokenType) { this.tokenType = tokenType; }
    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }
    public long getExpiresInSeconds() { return expiresInSeconds; }
    public void setExpiresInSeconds(long expiresInSeconds) { this.expiresInSeconds = expiresInSeconds; }
}