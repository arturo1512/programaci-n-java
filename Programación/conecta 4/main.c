/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: TELMEX
 *
 * Created on 22 de noviembre de 2016, 01:20 AM
 */

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

char conecta[10][10];
FILE *fp;

print_fecha() {


    int i, j;
    int ficha;
    struct tm tiempo;
    int dia;
    int mes;
    int anio;
    int hora;
    int min;

    time_t fecha_sistema;
    time(&fecha_sistema);
    tiempo = localtime(&fecha_sistema);

    anio = tiempo->tm_year + 1900;
    mes = tiempo->tm_mon + 1;
    dia = tiempo->tm_mday;
    hora = tiempo->tm_hour;
    min = tiempo->tm_min;

    time_t current_time;
    char* c_time_string;
    current_time = time(NULL);
    c_time_string = ctime(&current_time);

    char name[200];

    sprintf(name, "%d-%d-%d  %d-%d.jgo", dia, mes, anio, hora, min);

    fp = fopen(name, "w");

    fprintf(fp, "Dia: %d  ", dia);
    fprintf(fp, "Mes: %d", mes);
    fprintf(fp, "  Anio: %d\n\n", anio);

    fprintf(fp, "\n");
    for (j = 0; j < 18; j++) fprintf(fp, " ");

    fprintf(fp, "TABLERO GUARDADO DE LA PARTIDA");
    fprintf(fp, "\n");
    fprintf(fp, "   ");
    for (j = 0; j < 10 + 1; j++) fprintf(fp, "----");
    fprintf(fp, "\n");

    for (i = 0; i < 10; i++) {
        fprintf(fp, " ");
        fprintf(fp, " ");

        fprintf(fp, " %d |", i + 1);

        for (j = 0; j < 10; j++) {
            fprintf(fp, " ");
            fprintf(fp, "%c", conecta[i][j]);
            fprintf(fp, " |");
        }
        fprintf(fp, " ");
        fprintf(fp, "\n  ");
        fprintf(fp, " -");
        for (j = 0; j < 10 + 1; j++) fprintf(fp, "----");
        fprintf(fp, "\n");
    }
    fprintf(fp, "       ");
    for (j = 0; j < 10; j++)
        fprintf(fp, "%d   ", j + 1);
    fprintf(fp, "\n");
}

void tab_vacio() {
    int i, j;

    for (i = 0; i < 10; i++)
        for (j = 0; j < 10; j++)
            conecta[i][j] = ' ';
}

int manejo_errores(int fila, int col) {
    int excepcion = 1;
    if (fila >= 10 || fila < 0 || col >= 10 || col < 0)
        excepcion = 0;
    if (excepcion == 1) {
        if (conecta[fila][col - 1] == '0' || conecta[fila][col - 1] == 'X')
            excepcion = 0;
    }

    if (excepcion == 1) {
        if (fila != 10 - 1 && conecta[fila + 1][col - 1] == ' ')
            excepcion = 0;
    }

    return excepcion;
}

int hacer_jugada(int jug) {
    int fila, col;
    int i;
    char ficha, salida;
    int resultado_jugada;
    resultado_jugada = 1;

    if (jug == 0) {
        ficha = '0';
        printf("\nTURNO JUGADOR 1\n");
        do {
            if (resultado_jugada == 0) printf("Movimiento incorrecto\n\n");
            printf("En que columna colocas tu ficha: Del 1 al 10\n");
            printf("Prefieres terminar el juego? Presiona 0\n");
            printf("Para guardar la partida introduce el numero 11\n");
            printf("Dime o Elije: ");
            scanf("%d", &col);

            if (col == 0) {
                system("cls");
                printf("\n  JUEGO TERMINADO\n\n   GRACIAS POR JUGAR\n\n\n");
                exit(0);
            }

            if (col == 11) {
                print_fecha();
                printf("\n  JUEGO ACTUAL GUARDADO\n\n   CONSULTAR EN ARCHIVO CREADO EN LA CARPETA (Tiene por nombre la fecha y hora)\n\n");
            }

            i = 10 - 1;
            if (conecta[10 - 1][col - 1] != ' ') {
                while (i < 10 && (conecta[i][col - 1] == 'X' || conecta[i][col - 1] == '0'))
                    i--;
            }
            fila = i;
            resultado_jugada = manejo_errores(fila, col);
        } while (resultado_jugada == 0);
    } else {
        ficha = 'X';
        do {
            printf("\nTURNO DE JUGADOR 2\n");
            printf("En que columna colocas tu ficha: Del 1 al 10\n");
            printf("Prefieres terminar el juego? Presiona 0\n");
            printf("Para guardar la partida introduce el numero 11\n");
            printf("Dime: ");
            scanf("%d", &col);

            if (col == 0) {
                system("cls");
                printf("\n  JUEGO TERMINADO\n\n   GRACIAS POR JUGAR\n\n\n");
                exit(0);
            }

            if (col == 11) {
                print_fecha();
                printf("\n  JUEGO ACTUAL GUARDADO\n\n   CONSULTAR EN ARCHIVO CREADO EN LA CARPETA (Tiene por nombre la fecha y hora)\n\n");
            }

            i = 10 - 1;
            if (conecta[10 - 1][col - 1] != ' ') {
                while (i < 10 && (conecta[i][col - 1] == 'X' || conecta[i][col - 1] == '0'))
                    i--;
            }
            fila = i;
            resultado_jugada = manejo_errores(fila, col);
        } while (resultado_jugada == 0);
    }

    if (resultado_jugada == 1) conecta[fila][col - 1] = ficha;
    return resultado_jugada;
}

int print_tab() {
    int i, j;
    int ficha;

    system("cls");
    printf("\n");
    for (j = 0; j < 18; j++) printf(" ");

    printf("TABLERO ACTUAL");
    printf("\n");
    printf("   ");
    for (j = 0; j < 10 + 1; j++) printf("----");
    printf("\n");

    for (i = 0; i < 10; i++) {
        printf(" ");
        printf(" ");

        printf(" %d |", i + 1);

        for (j = 0; j < 10; j++) {
            printf(" ");
            printf("%c", conecta[i][j]);
            printf(" |");
        }
        printf(" ");
        printf("\n  ");
        printf(" -");
        for (j = 0; j < 10 + 1; j++) printf("----");
        printf("\n");
    }
    printf("       ");
    for (j = 0; j < 10; j++)
        printf("%d   ", j + 1);
    printf("\n");
}

int jugador() {
    int i, j;
    int jugador;
    jugador = -1;

    for (i = 0; i < 10; i++) {
        for (j = 0; j < 10 - 3; j++) {
            if (conecta[i][j] == 'X' && conecta[i][j + 1] == 'X' && conecta[i][j + 2] == 'X' && conecta[i][j + 3] == 'X')
                jugador = 0;
            else if (conecta[i][j] == '0' && conecta[i][j + 1] == '0' && conecta[i][j + 2] == '0' && conecta[i][j + 3] == '0')
                jugador = 1;
        }
    }
    if (jugador == -1) {
        for (i = 0; i < 10 - 3; i++) {
            for (j = 0; j < 10; j++) {
                if (conecta[i][j] == 'X' && conecta[i + 1][j] == 'X' && conecta[i + 2][j] == 'X' && conecta[i + 3][j] == 'X')
                    jugador = 0;
                else if (conecta[i][j] == '0' && conecta[i + 1][j] == '0' && conecta[i + 2][j] == '0' && conecta[i + 3][j] == '0')
                    jugador = 1;
            }
        }
    }

    if (jugador == -1) {
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if (i + 3 < 10 && j + 3 < 10) {
                    if (conecta[i][j] == 'X' && conecta[i + 1][j + 1] == 'X' && conecta[i + 2][j + 2] == 'X' && conecta[i + 3][j + 3] == 'X')
                        jugador = 0;
                    else if (conecta[i][j] == '0' && conecta[i + 1][j + 1] == '0' && conecta[i + 2][j + 2] == '0' && conecta[i + 3][j + 3] == '0')
                        jugador = 1;
                }
            }
        }
    }

    if (jugador == -1) {
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
            
                    if (i + 3 < 10 && j - 3 >= 0) {
                    if (conecta[i][j] == 'X' && conecta[i + 1][j - 1] == 'X' && conecta[i + 2][j - 2] == 'X' && conecta[i + 3][j - 3] == 'X')
                        jugador = 0;
                    else if (conecta[i][j] == '0' && conecta[i + 1][j - 1] == '0' && conecta[i + 2][j - 2] == '0' && conecta[i + 3][j - 3] == '0')
                        jugador = 1;
                }
            }
        }
    }
    return jugador;
}

int main(int argc, char **argv) {
    printf("CONECTA4 ELABORADO POR: JOSE ARTURO ZAMUDIO PEÑA\n");
    printf("GRUPO C DE LOS TELETON XD\n");
    printf("ELABORADO PARA LA MATERIA DE METODOLOGIA DE PROGRAMACION\n");
    printf("PROFESOR: ALFONSO\n");
    int player;
    int total_jugadas;
    total_jugadas = 0;

    tab_vacio();

    do {
        if (total_jugadas % 2 == 0)
            player = 0;
        else
            player = 1;

        total_jugadas++;
        print_tab();

        if (hacer_jugada(player) == 0) {
            printf("Jugada incorrecta.\n\n");
        }
    } while (jugador() == -1);

    print_tab();
    if (jugador() == 1)
        printf("GANA JUGADOR 1\n\n");
    else
        printf("GANA JUGADOR 2\n\n");
    getchar();

    int col;
    printf("PRESIONA 1 PARA GUARDAR RESULTADO: ");
    scanf("%d", &col);
    if (col == 1) {
        print_fecha();
        printf("\n  JUEGO ACTUAL GUARDADO\n\n   CONSULTAR EN ARCHIVO: CONECTA4.jgo\n\n");
    } else printf("\n\nJUEGO TERMINADO SIN GUARDAR\n\n");
}
