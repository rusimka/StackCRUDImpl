package com.example.stackcrudimpl.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity(name = "node")
public class Node {

    @Id
    private Long nodeId;

    @Column(name = "node_data")
    private Integer data;

    @ManyToOne
    @JoinColumn(name = "next_node_id")
    private Node next;

    @Column(name = "node_index")
    private int index = -1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stack_id")
    private NodeStack stack;

}
