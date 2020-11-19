/*
 * The MIT License
 *
 * Copyright 2020 Intuit Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.intuit.karate.resource;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

/**
 *
 * @author pthomas3
 */
public class JarResource implements Resource {

    private final byte[] bytes;
    private final String relativePath;

    public JarResource(byte[] bytes, String relativePath) {
        this.bytes = bytes;
        this.relativePath = relativePath;
    }

    @Override
    public boolean isFile() {
        return false;
    }

    @Override
    public boolean isClassPath() {
        return true;
    }

    @Override
    public File getFile() {
        return null;
    }

    @Override
    public String getRelativePath() {
        return relativePath;
    }      

    @Override
    public InputStream getStream() {
        return new ByteArrayInputStream(bytes);
    }
    
    @Override
    public String toString() {
        return getPrefixedPath();
    }    

}
