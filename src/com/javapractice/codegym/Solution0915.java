package com.javapractice.codegym;
import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class Solution0915 {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {
        try{
            handleExceptions();
        }catch(FileSystemException e){
            System.out.println(e.getMessage());
            BEAN.log(e);
        }
    }

    public static void handleExceptions() throws FileSystemException {

        try{
            BEAN.throwExceptions();
        }catch(FileSystemException e){
            BEAN.log(e);
            System.out.println(e.getMessage());
            throw e;

        }catch(CharConversionException e){
            BEAN.log(e);
            System.out.println(e.getMessage());
        }catch(IOException e){
            BEAN.log(e);
            System.out.println(e.getMessage());
        }
    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void throwExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0) {
                throw new CharConversionException();
            }
            if (i == 1) {
                throw new FileSystemException("");
            }
            if (i == 2) {
                throw new IOException();
            }
        }
    }
}
