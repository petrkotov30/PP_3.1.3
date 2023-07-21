package ru.kata.spring.boot_security.demo.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.Collection;

public class UserImplDetails implements UserDetails {
    private final User user;

    public UserImplDetails(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return user.getRoles();
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    //просрочен аккаунт?
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    //заблокирован аккаунт?
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    //просрочены  данные?(пароль или логин)
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    //включен аккаунт?
    @Override
    public boolean isEnabled() {
        return true;
    }

    // Нужно, чтобы получать данные аутентифицированного пользователя
    public User getUser() {
        return user;
    }
}
