package com.codecool.termlib;

import java.io.Console;
import java.io.IOException;
import java.io.Reader;
import java.lang.Runtime;

public class Input {

    public void raw() throws IOException {
        Runtime.getRuntime().exec(new String[]{"/bin/sh", "-c", "stty raw -echo </dev/tty"});
    }
}
