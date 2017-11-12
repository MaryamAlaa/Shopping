package com.example.mariam.shopping;

/**
 * Created by Domtyyyyyy on 8/24/2017.
 */

public interface Authenticator {
    void signIn(String email, String password, SignInListener listener);
    void signUp(String email, String password, SignUpListener listener);
    void signOut();
}
