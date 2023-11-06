package com.example.JpaMySQL;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User implements Serializable
{
	private static final long serialVersionUID = -297553281792804396L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/* Mapping thong tin bien voi ten cot trong database */
	@Column(name = "hp")
	private int hp;
	@Column(name = "stamina")
	private int stamina;
	
	/* Neu ko danh dau @Column thi se mapping tu dong theo ten bien */
	private int atk;
	private int def;
	private int agi;
}
