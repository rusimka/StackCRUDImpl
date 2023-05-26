package com.example.stackcrudimpl.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "stack")
@Getter
@Setter
public class NodeStack {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long stackId;

    @OneToMany
    @JoinColumn(name = "nodes")
    private List<Node> nodes = new ArrayList<>();

}
