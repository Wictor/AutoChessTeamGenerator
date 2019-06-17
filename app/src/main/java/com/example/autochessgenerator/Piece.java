package com.example.autochessgenerator;

public class Piece {

    private int id;
    private String pieceName;
    private String pieceRace;
    private String pieceRace2;
    private String pieceClass;
    private int pieceCost;

    public Piece(int id, String pieceName, String pieceRace, String pieceRace2, String pieceClass, int pieceCost) {
        this.id = id;
        this.pieceName = pieceName;
        this.pieceRace = pieceRace;
        this.pieceRace2 = pieceRace2;
        this.pieceClass = pieceClass;
        this.pieceCost = pieceCost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPieceName() {
        return pieceName;
    }

    public void setPieceName(String pieceName) {
        this.pieceName = pieceName;
    }

    public String getPieceClass() {
        return pieceClass;
    }

    public void setPieceClass(String pieceClass) {
        this.pieceClass = pieceClass;
    }

    public int getPieceCost() {
        return pieceCost;
    }

    public void setPieceCost(int pieceCost) {
        this.pieceCost = pieceCost;
    }

    public String getPieceRace() {
        return pieceRace;
    }

    public void setPieceRace(String pieceRace) {
        this.pieceRace = pieceRace;
    }

    public String getPieceRace2() {
        return pieceRace2;
    }

    public void setPieceRace2(String pieceRace2) {
        this.pieceRace2 = pieceRace2;
    }

}
