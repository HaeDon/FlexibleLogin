/*
 * This file is part of FlexibleLogin
 *
 * The MIT License (MIT)
 *
 * Copyright (c) 2015-2017 contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.github.games647.flexiblelogin.config;

import com.google.common.collect.ImmutableMap;

import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;

import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.TextTemplate;
import org.spongepowered.api.text.format.TextColors;
import org.spongepowered.api.text.serializer.TextSerializers;

import static org.spongepowered.api.text.TextTemplate.arg;
import static org.spongepowered.api.text.TextTemplate.of;

@ConfigSerializable
public class TextConfig {

    @Setting(comment = "You can use the Github wiki for example configurations: "
            + "https://github.com/games647/FlexibleLogin/wiki"
            + '\n'
            + "When a non-player (i.e. Console, Command Block) tries to do a player only action.")
    private String playersOnly = "&4Only players can do this!";

    @Setting(comment = "When the account does not exist on the account database.")
    private String playersAccountNotLoaded = "&4Your account cannot be loaded.";

    @Setting(comment = "If the player is logged in, it is then pointless to use the forgot password command")
    private String playersAccountAlreadyLoggedIn = "&4You are already logged in!";

    @Setting(comment = "When the player did not or forgot to submit an email address used to recover a password.")
    private String uncommittedEmailAddress = "&4You did not submit an email address!";

    @Setting(comment = "When an unexpected error occurs. (Should not happen)")
    private String errorExecutingCommand = "&4Error executing command, see console.";

    @Setting(comment = "Whe the player successfully logs out of his/her account.")
    private String loggedOut = "&2Logged out.";

    @Setting(comment = "When the player is not logged in of his/her account.")
    private String notLoggedIn = "&4Not logged in. Type /login to login in";

    @Setting(comment = "When the player is not logged in of his/her account.")
    private String notRegistered = "&4Not registered. Type /register to register";

    @Setting(comment = "When totp is not enabled.")
    private String totpNotEnabled = "&4Totp is not enabled. You have to enter two passwords.";

    @Setting(comment = "When the two passwords typed do not match each other.")
    private String unevenPasswords = "&4The passwords are not equal.";

    @Setting(comment = "When the player successfully used the set email command and set his/her email.")
    private String emailSet = "&2Your email was set.";

    @Setting(comment = "When the player enters an email that does not exist.")
    private String notEmail = "&4You have entered in an invalid email!";

    @Setting(comment = "When the unregister process failed.")
    private String unregisterFailed = "&4Your request is neither a player name or uuid.";

    @Setting(comment = "When a player successfully logs in.")
    private String loggedIn = "&2Logged in";

    @Setting(comment = "When a player enters an incorrect password.")
    private String incorrectPassword = "&4Incorrect password";

    @Setting(comment = "When the recovery email was sent!")
    private String mailSent = "&2Email sent";

    @Setting(comment = "When a player's account does not exist.")
    private String accountNotFound = "&4Account not found";

    @Setting(comment = "When a player joined with a non Mojang valid username")
    private String invalidUsername = "&4Invalid username - Choose characters a-z,A-Z,0-9 and a length between 2 and 16";

    @Setting(comment = "When an account was successfully deleted")
    private TextTemplate accountDelete = of(
            TextColors.DARK_GREEN, "Deleted account of ", TextColors.YELLOW, arg("account").optional(), "!"
    );

    @Setting(comment = "Kick message if the case sensitive compare between the already registered " +
            "and the joining player failed")
    private TextTemplate invalidCase = of(
            TextColors.RED, "Invalid username. Please join as ", TextColors.YELLOW, arg("username").optional(), "!"
    );

    @Setting(comment = "Kick message if the case sensitive compare between the already registered " +
            "and the joining player failed")
    private TextTemplate lastOnline = of(
            TextColors.DARK_GREEN, "Account: ", TextColors.YELLOW, arg("username").optional(),
            TextColors.DARK_GREEN, " was last online at ", TextColors.YELLOW, arg("time")
    );

    @Setting(comment = "When an account already exists, and therefore cannot be created.")
    private String accountAlreadyExists = "&4Account already exists";

    @Setting(comment = "When the player successfully created his/her account.")
    private String accountCreated = "&2Account created";

    @Setting(comment = "When a secret-key is created (header).")
    private String keyGenerated = "&2SecretKey generated: ";

    @Setting(comment = "When a player registered using TOTP and the code can be scanned by clicking on it")
    private String scanQr = "&6Click here to scan the QR-Code";

    @Setting(comment = "When the user tries to execute a protected command if command only protection is enabled")
    private String protectedCommand = "&4This command is protected. Please login";

    @Setting(comment = "When the player is auto logged in by using the same ip as the last login")
    private String ipAutoLogin = "&2Auto logged in";

    @Setting(comment = "Kick message if the player doesn't logged during the configured time out seconds")
    private String timeoutReason = "&4Login timeout";

    @Setting(comment = "Message if the player changed his account password successfully")
    private String changePassword = "&2Successful changed password";

    @Setting(comment = "Message if the player has to register with a longer password")
    private String tooShortPassword = "&2Your password is too short";

    @Setting(comment = "User reached max attempts")
    private String maxAttempts = "&2You entered too many times a wrong password";

    @Setting(comment = "User reached the max ip registrations")
    private String maxIpReg = "&2You reached the max amount of registrations for this ip-address";

    @Setting(comment = "Admin reloaded the plugin")
    private String onReload = "&4Successful reloaded plugin";

    @Setting(comment = "Force register failed because the player is online")
    private String forceRegisterOnline = "&2Cannot force register player. That player is online";

    @Setting(comment = "Successfull force registered an account")
    private String forceRegisterSuccess = "&4Force register success";

    @Setting(comment = "Another player with the same name tried to join the server while that player is still online")
    private String alreadyOnline = "&2You are already online";

    @Setting(comment = "If email recovery is not enabled")
    private String emailNotEnabled = "&2Email recovery is not enabled.";

    public Text getAccountAlreadyExists() {
        return fromString(accountAlreadyExists);
    }

    public Text getInvalidUsername() {
        return fromString(invalidUsername);
    }

    public Text getAccountCreated() {
        return fromString(accountCreated);
    }

    public Text getKeyGenerated() {
        return fromString(keyGenerated);
    }

    public Text getScanQr() {
        return fromString(scanQr);
    }

    public Text getIncorrectPassword() {
        return fromString(incorrectPassword);
    }

    public Text getLoggedIn() {
        return fromString(loggedIn);
    }

    public Text getAccountNotFound() {
        return fromString(accountNotFound);
    }

    public Text getMailSent() {
        return fromString(mailSent);
    }

    public Text getPlayersOnlyAction() {
        return fromString(playersOnly);
    }

    public Text getAccountNotLoaded() {
        return fromString(playersAccountNotLoaded);
    }

    public Text getAlreadyLoggedIn() {
        return fromString(playersAccountAlreadyLoggedIn);
    }

    public Text getUncommittedEmailAddress() {
        return fromString(uncommittedEmailAddress);
    }

    public Text getErrorCommand() {
        return fromString(errorExecutingCommand);
    }

    public Text getSuccessfullyLoggedOut() {
        return fromString(loggedOut);
    }

    public Text getNotRegistered() {
        return fromString(notRegistered);
    }

    public Text getNotLoggedIn() {
        return fromString(notLoggedIn);
    }

    public Text getTotpNotEnabled() {
        return fromString(totpNotEnabled);
    }

    public Text getUnequalPasswords() {
        return fromString(unevenPasswords);
    }

    public Text getEmailSet() {
        return fromString(emailSet);
    }

    public Text getNotEmail() {
        return fromString(notEmail);
    }

    public Text getUnregisteringFailed() {
        return fromString(unregisterFailed);
    }

    public Text getAccountDeleted(String account) {
        return accountDelete.apply(ImmutableMap.of("account", account)).build();
    }

    public Text getProtectedCommand() {
        return fromString(protectedCommand);
    }

    public Text getIpAutoLogin() {
        return fromString(ipAutoLogin);
    }

    public Text getTimeoutReason() {
        return fromString(timeoutReason);
    }

    public Text getChangePassword() {
        return fromString(changePassword);
    }

    public Text getTooShortPassword() {
        return fromString(tooShortPassword);
    }

    public Text getMaxAttempts() {
        return fromString(maxAttempts);
    }

    public Text getMaxIpReg() {
        return fromString(maxIpReg);
    }

    public Text getReload() {
        return fromString(onReload);
    }

    public Text getForceRegisterOnline() {
        return fromString(forceRegisterOnline);
    }

    public Text getForceRegisterSuccess() {
        return fromString(forceRegisterSuccess);
    }

    public Text getAlreadyOnline() {
        return fromString(alreadyOnline);
    }

    public Text getInvalidCase(String username) {
        return invalidCase.apply(ImmutableMap.of("username", username)).build();
    }

    public Text getLastOnline(String username, String time) {
        return lastOnline.apply(ImmutableMap.of("username", username, "time", time)).build();
    }

    public Text getEmailNotEnabled() {
        return fromString(emailNotEnabled);
    }

    private Text fromString(String textString) {
        return TextSerializers.FORMATTING_CODE.deserialize(textString);
    }
}
