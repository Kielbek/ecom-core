package com.example.ecom.token;

import com.example.ecom.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Token {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(unique = true)
    private String accessToken;
    @Column(unique = true)
    private String refreshToken;
    private LocalDateTime createdAt;
    private LocalDateTime expiresAt;
    private LocalDateTime validatedAt;

    public boolean revoked;
    public boolean expired;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;
}