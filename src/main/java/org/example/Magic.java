package org.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "magic") 
public class Magic {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "название")
  private String name;

  @Column(name = "повреждение")
  private int damage;

  @Column(name = "атака")
  private int attBonus;

  @Column(name = "броня") 
  private int armor;

 
  public Magic() {
  }

 
  public Magic(String name, int damage, int attBonus, int armor) {
    this.name = name;
    this.damage = damage;
    this.attBonus = attBonus;
    this.armor = armor;
  }

 
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public int getAttBonus() {
    return attBonus;
  }

  public void setAttBonus(int attBonus) {
    this.attBonus = attBonus;
  }

  public int getArmor() {
    return armor; 
  }

  public void setArmor(int armor) { 
    this.armor = armor;
  }
}
