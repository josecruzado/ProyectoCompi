/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jose
 */
public class Token {
    final static String IDENT = "300";
    final static String ENTERO = "301";
    final static String REAL = "302";
    final static String CADENA = "303";
    final static String COMENTARIO_LINEA = "304";
    final static String COMENTARIO_MULTI = "305";

    final static String IGUAL = "400";
    final static String DISTINTO = "401";
    final static String MAYOR = "402";
    final static String MENOR = "403";
    final static String MAYORIGUAL = "404";
    final static String MENORIGUAL = "405";

    final static String IF = "406";
    final static String ELSE = "407";
    final static String FOR = "408";
    final static String WHILE = "409";

    final static String READ = "410";
    final static String WRITE = "411";

    final static String ASIGNACION = "412";
    
    final static String ERROR = "ERROR LÉXICO LINEA";
    
    public static String toString(String token){
        switch(token){
            case Token.ASIGNACION:
                return "ASIGNACION";
            case Token.CADENA:
                return "CADENA";
            case Token.COMENTARIO_LINEA:
                return "COMENTARIO LINEA";
            case Token.COMENTARIO_MULTI:
                return "COMENTARIO MULTILINEA";
            case Token.DISTINTO:
                return "DISTINTO";
            case Token.ELSE:
                return "ELSE";
            case Token.ENTERO:
                return "ENTERO";
            case Token.FOR:
                return "FOR";
            case Token.IDENT:
                return "IDENTIFICADOR";
            case Token.IF:
                return "IF";
            case Token.IGUAL:
                return "IGUAL";
            case Token.MAYOR:
                return "MAYOR";
            case Token.MAYORIGUAL:
                return "MAYOR IGUAL";
            case Token.MENOR:
                return "MENOR";
            case Token.MENORIGUAL:
                return "MENORIGUAL";
            case Token.READ:
                return "READ";
            case Token.REAL: 
                return "REAL";
            case Token.WHILE:
                return "WHILE";
            case Token.WRITE:
                return "WRITE";
            case "-1":
                return ERROR;
                
        }
        return Character.toString((char)Integer.parseInt(token));
    }
}
