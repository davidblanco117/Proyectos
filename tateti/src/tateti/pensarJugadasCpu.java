package tateti;

public class pensarJugadasCpu {

    public pensarJugadasCpu() {
    }

    private final int[] jugador = new int[9];
    public final int[] cpu = new int[9];
    private final int[] total = new int[9];
    private boolean segundaJugada;
    private final int[] grupoE = {0, 2, 6, 8};
    @SuppressWarnings("MismatchedReadAndWriteOfArray")
    private final int[] grupoC = {1, 3, 5, 7};

    public void resetear() {
        for (int i = 0; i < 9; i++) {
            jugador[i] = 0;
            cpu[i] = 0;
            total[i] = 0;
        }
    }

    public int pensar(int presionadoJ1, boolean primeraJugada) {
        int i;
        jugador[presionadoJ1] = 1;
        total[presionadoJ1] = 1;

        if (primeraJugada) {

            if (presionadoJ1 == 4) {
                int res = (int) (Math.random() * 100) % 4;
                total[grupoE[res]] = 1;
                cpu[grupoE[res]] = 1;
                segundaJugada = true;
                return grupoE[res];
            } else {
                //if (presionadoJ1==0||presionadoJ1==2||presionadoJ1==6||presionadoJ1==9) {

                total[4] = 1;
                cpu[4] = 1;
                segundaJugada = true;
                return 4;
            }

        }

        if (segundaJugada) {
            if (jugador[1] == 1) {
                if (jugador[3] == 1) {
                    total[0] = 1;
                    cpu[0] = 1;
                    segundaJugada = false;
                    return 0;
                }
                if (jugador[5] == 1) {
                    total[2] = 1;
                    cpu[2] = 1;
                    segundaJugada = false;
                    return 2;
                }
            }
            if (jugador[7] == 1) {
                if (jugador[3] == 1) {
                    total[6] = 1;
                    cpu[6] = 1;
                    segundaJugada = false;
                    return 6;
                }
                if (jugador[5] == 1) {
                    total[8] = 1;
                    cpu[8] = 1;
                    segundaJugada = false;
                    return 8;
                }
            }
            if (jugador[3] == 1) {
                if (jugador[1] == 1) {
                    total[0] = 1;
                    cpu[0] = 1;
                    segundaJugada = false;
                    return 0;
                }
                if (jugador[7] == 1) {
                    total[6] = 1;
                    cpu[6] = 1;
                    segundaJugada = false;
                    return 6;
                }
            }
            if (jugador[5] == 1) {
                if (jugador[1] == 1) {
                    total[2] = 1;
                    cpu[2] = 1;
                    segundaJugada = false;
                    return 2;
                }
                if (jugador[7] == 1) {
                    total[8] = 1;
                    cpu[8] = 1;
                    segundaJugada = false;
                    return 8;
                }
            }

            if (jugador[0] + jugador[8] == 2) {
                int res = (int) (Math.random() * 100) % 4;
                total[grupoC[res]] = 1;
                cpu[grupoC[res]] = 1;
                segundaJugada = false;
                return grupoC[res];

            }

            if (jugador[2] + jugador[6] == 2) {
                int res = (int) (Math.random() * 100) % 4;
                total[grupoC[res]] = 1;
                cpu[grupoC[res]] = 1;
                segundaJugada = false;
                return grupoC[res];

            }

            if (jugador[4] == 1 && (total[0] + total[8] == 2 || total[2] + total[6] == 2)) {
                int res;
                do {
                    res = (int) (Math.random() * 100) % 4;
                } while (total[grupoE[res]] == 1);
                total[grupoE[res]] = 1;
                cpu[grupoE[res]] = 1;
                segundaJugada = false;
                return grupoE[res];

            }

        }

        segundaJugada = false;

        for (i = 0; i < 3; i++) {
            if (cpu[(i * 3)] + cpu[1 + (i * 3)] + cpu[2 + (i * 3)] == 2) {
                if (total[(i * 3)] + total[1 + (i * 3)] + total[2 + (i * 3)] != 3) {
                    if (total[(i * 3)] == 0) {
                        total[(i * 3)] = 1;
                        cpu[i * 3] = 1;
                        return (i * 3);

                    }
                    if (total[1 + (i * 3)] == 0) {
                        total[1 + (i * 3)] = 1;
                        cpu[1 + (i * 3)] = 1;
                        return (1 + (i * 3));

                    }
                    if (total[2 + (i * 3)] == 0) {
                        total[2 + (i * 3)] = 1;
                        cpu[2 + (i * 3)] = 1;
                        return (2 + (i * 3));

                    }

                }

            }
        }

        for (i = 0; i < 3; i++) {
            if (cpu[i] + cpu[i + 3] + cpu[i + 6] == 2) {
                if (total[i] + total[i + 3] + total[i + 6] != 3) {

                    if (total[(i)] == 0) {
                        total[(i)] = 1;
                        cpu[i] = 1;
                        return (i);

                    }
                    if (total[i + 3] == 0) {
                        total[i + 3] = 1;
                        cpu[i + 3] = 1;
                        return (i + 3);

                    }
                    if (total[i + 6] == 0) {
                        total[i + 6] = 1;
                        cpu[i + 6] = 1;
                        return (i + 6);

                    }

                }

            }
        }

        if (cpu[0] + cpu[4] + cpu[8] == 2) {
            if (total[0] + total[4] + total[8] != 3) {

                if (total[0] == 0) {
                    total[0] = 1;
                    cpu[0] = 1;
                    return (0);

                }
                if (total[4] == 0) {
                    total[4] = 1;
                    cpu[4] = 1;
                    return (4);

                }
                if (total[8] == 0) {
                    total[8] = 1;
                    cpu[8] = 1;
                    return (8);

                }

            }
        }

        if (cpu[2] + cpu[4] + cpu[6] == 2) {
            if (total[2] + total[4] + total[6] != 3) {

                if (total[(2)] == 0) {
                    total[(2)] = 1;
                    cpu[2] = 1;
                    return (2);

                }
                if (total[4] == 0) {
                    total[4] = 1;
                    cpu[4] = 1;
                    return (4);

                }
                if (total[6] == 0) {
                    total[6] = 1;
                    cpu[6] = 1;
                    return (6);

                }

            }

        }

        for (i = 0; i < 3; i++) {
            if (jugador[(i * 3)] + jugador[1 + (i * 3)] + jugador[2 + (i * 3)] == 2) {
                if (total[(i * 3)] + total[1 + (i * 3)] + total[2 + (i * 3)] != 3) {
                    if (total[(i * 3)] == 0) {
                        total[(i * 3)] = 1;
                        cpu[i * 3] = 1;
                        return (i * 3);

                    }
                    if (total[1 + (i * 3)] == 0) {
                        total[1 + (i * 3)] = 1;
                        cpu[1 + (i * 3)] = 1;
                        return (1 + (i * 3));

                    }
                    if (total[2 + (i * 3)] == 0) {
                        total[2 + (i * 3)] = 1;
                        cpu[2 + (i * 3)] = 1;
                        return (2 + (i * 3));

                    }

                }

            }
        }

        for (i = 0; i < 3; i++) {
            if (jugador[i] + jugador[i + 3] + jugador[i + 6] == 2) {
                if (total[i] + total[i + 3] + total[i + 6] != 3) {

                    if (total[(i)] == 0) {
                        total[(i)] = 1;
                        cpu[i] = 1;
                        return (i);

                    }
                    if (total[i + 3] == 0) {
                        total[i + 3] = 1;
                        cpu[i + 3] = 1;
                        return (i + 3);

                    }
                    if (total[i + 6] == 0) {
                        total[i + 6] = 1;
                        cpu[i + 6] = 1;
                        return (i + 6);

                    }

                }

            }
        }

        if (jugador[0] + jugador[4] + jugador[8] == 2) {
            if (total[0] + total[4] + total[8] != 3) {

                if (total[0] == 0) {
                    total[0] = 1;
                    cpu[0] = 1;
                    return (0);

                }
                if (total[4] == 0) {
                    total[4] = 1;
                    cpu[4] = 1;
                    return (4);

                }
                if (total[8] == 0) {
                    total[8] = 1;
                    cpu[8] = 1;
                    return (8);

                }

            }
        }

        if (jugador[2] + jugador[4] + jugador[6] == 2) {
            if (total[2] + total[4] + total[6] != 3) {

                if (total[(2)] == 0) {
                    total[(2)] = 1;
                    cpu[2] = 1;
                    return (2);

                }
                if (total[4] == 0) {
                    total[4] = 1;
                    cpu[4] = 1;
                    return (4);

                }
                if (total[6] == 0) {
                    total[6] = 1;
                    cpu[6] = 1;
                    return (6);

                }

            }

        }

        return -1;

    }

}
