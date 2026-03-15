package dk.ek.gruppe2.chooseyourfate.dto;

public class AccountResponseDTO {

    private Integer id;
    private String username;
    private Integer characterLimit;
    private String email;

    public AccountResponseDTO() {
    }

    public AccountResponseDTO(Integer id, String username, Integer characterLimit, String email) {
        this.id = id;
        this.username = username;
        this.characterLimit = characterLimit;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getCharacterLimit() {
        return characterLimit;
    }

    public void setCharacterLimit(Integer characterLimit) {
        this.characterLimit = characterLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}