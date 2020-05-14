package com.olheiros.dateOlheiros;

public class Jogador {
    private String celularJogador;
    private String dataNascimento;
    private String emailJogador;
    private String nomeCompleto;
    private String uid;
    private String urlFotoPerfil;
    private Boolean usuarioPremium;
    private int videosPublicados;


    public String getCelularJogador() {
        return celularJogador;
    }

    public void setCelularJogador(String celularJogador) {
        this.celularJogador = celularJogador;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmailJogador() {
        return emailJogador;
    }

    public void setEmailJogador(String emailJogador) {
        this.emailJogador = emailJogador;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUrlFotoPerfil() {
        return urlFotoPerfil;
    }

    public void setUrlFotoPerfil(String urlFotoPerfil) {
        this.urlFotoPerfil = urlFotoPerfil;
    }

    public Boolean getUsuarioPremium() {
        return usuarioPremium;
    }

    public void setUsuarioPremium(Boolean usuarioPremium) {
        this.usuarioPremium = usuarioPremium;
    }

    public int getVideosPublicados() {
        return videosPublicados;
    }

    public void setVideosPublicados(int videosPublicados) {
        this.videosPublicados = videosPublicados;
    }
}
