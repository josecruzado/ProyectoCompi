%{
    #include <stdio.h>
    #include <conio.h>

    #define IDENT 300
    #define ENTERO 301
    #define REAL 302
    #define CADENA 303
    #define COMENTARIO_LINEA 304
    #define COMENTARIO_MULTI 305

    #define IGUAL 400
    #define DISTINTO 401
    #define MAYOR 402
    #define MENOR 403
    #define MAYORIGUAL 404
    #define MENORIGUAL 405

    #define IF 406
    #define ELSE 407
    #define FOR 408
    #define WHILE 409

    #define READ 410
    #define WRITE 411

    #define ASIGNACION 412
%}

%option outfile="Scanner.cpp"
%option noyywrap
%option yylineno

DIGITO [0-9]
LETRA [a-zA-Z]
IGNORA " "|\t|\n

ENTERO {DIGITO}+
REAL {DIGITO}+"."{DIGITO}+
IDENTIFICADOR {LETRA}({LETRA}|{DIGITO}|"_")*
CADENA \"({LETRA}|{DIGITO}|" ")+\"
COMENTARIO_LINEA  "//"({LETRA}|{DIGITO}|"_"|"-"|" ")+
COMENTARIO_MULTI  "/*"({LETRA}|{DIGITO}|"_"|"-"|" "|\n)+"*/"

IF "if"
ELSE "else"
FOR "for"
WHILE "while"

READ "read"
WRITE "write"
%%

{IF}             {return (IF);}
{ELSE}           {return (ELSE);}
{FOR}            {return (FOR);}
{WHILE}          {return (WHILE);}

{READ}           {return (READ);}
{WRITE}          {return (WRITE);}

{ENTERO}            {return (ENTERO);}
{REAL}              {return (REAL);}
{CADENA}            {return (CADENA);}
{IDENTIFICADOR}     {return (IDENT);}
{COMENTARIO_LINEA}  {return (COMENTARIO_LINEA);}
{COMENTARIO_MULTI}  {return (COMENTARIO_MULTI);}
{IGNORA}*           {;}

"=="			{return(IGUAL);}
"!="			{return(DISTINTO);}
"<="			{return(MENORIGUAL);}
">="			{return(MAYORIGUAL);}
"<"			    {return(MENOR);}
">"			    {return(MAYOR);}

"+"				{return('+');}
"-"				{return('-');}
"*"				{return('*');}
"/"				{return('/');}
"("				{return('(');}
")"				{return(')');}
"{"				{return('{');}
"}"				{return('}');}
"["				{return('[');}
"]"				{return(']');}
"="				{return(ASIGNACION);}
","				{return(',');}
";"				{return(';');}
.				{printf("-1 ~ %d %s ~ ",yylineno,yytext);}

%%

int main()
{
    char NomArch[] = "D:\\Documentos\\UPN\\CICLO VI\\COMPI\\Semana 12 - T2\\codeTemp.txt";
    int token;
    yyin=fopen(NomArch,"rt");
    if (yyin==NULL)
        return 1;
    else
        while((token=yylex())>0)
            printf("%d ~ %s ~ ",token,yytext);
    fclose(yyin);
    return(0);
}
