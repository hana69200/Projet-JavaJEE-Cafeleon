package DAO;


public abstract class DAO<T> {
protected Connect connect = null;
  public DAO(Connect conn){
    this.connect = conn;
  }
   

}

