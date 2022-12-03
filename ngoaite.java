/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btnhom;

/**
 *
 * @author Administrator
 */
public class ngoaite {
    private int mant;
    private String tennt;
    private float muavao,banra;
    private String chuyenkhoan;
    
 public void ngoaite(int mant,String tennt,float muavao, String chuyenkhoan, float banra){
     this.mant= mant;
     this.tennt= tennt;
     this.muavao= muavao;
     this.chuyenkhoan= chuyenkhoan;
     this.banra= banra;
 }   
 public int getmant(){
     return mant;
 }   
 public void setmant(int mant){
     this.mant=mant;  
 }
 public String tenmant(){
     return tennt;
 }   
 public void setmant(String mant){
     this.tennt=tennt;  
 }
 public float getmuavao(){
     return muavao;
 }   
 public void setmuavao(float muavao){
     this.muavao=muavao;  
 }
 public String getchguyenkhoan(){
     return chuyenkhoan;
 }   
 public void setchuyenkhoan(String chuyenkhoan){
     this.chuyenkhoan=chuyenkhoan;  
 }
 public float getbanra(){
     return banra;
 }   
 public void setbanra(float banra){
     this.banra=banra;  
 }
 
}
