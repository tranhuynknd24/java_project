package com.example.model;

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
public class User
{
	private static final long serialVersionUID = -297553281792804396L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "hp")
	private String hp;
	@Column(name = "stamina")
    private int stamina;

    // Nếu không đánh dấu @Column thì sẽ mapping tự động theo tên biến
    private int atk;
    private int def;
    private int agi;
}
