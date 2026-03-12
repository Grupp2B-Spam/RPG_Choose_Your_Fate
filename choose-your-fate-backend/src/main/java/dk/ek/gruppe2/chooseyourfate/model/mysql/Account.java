package dk.ek.gruppe2.chooseyourfate.model.mysql;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String username;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(name = "character_limit", nullable = false)
    private Integer characterLimit;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false, length = 100)
    private String salt;

    @OneToMany(mappedBy = "account")
    private List<CharacterAvatar> characters = new ArrayList<>();

    public Account() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Integer getCharacterLimit() { return characterLimit; }
    public void setCharacterLimit(Integer characterLimit) { this.characterLimit = characterLimit; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSalt() { return salt; }
    public void setSalt(String salt) { this.salt = salt; }

    public List<CharacterAvatar> getCharacters() { return characters; }
    public void setCharacters(List<CharacterAvatar> characters) { this.characters = characters; }
}
