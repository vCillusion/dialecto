package com.madeforindia.dialecto.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="apparel")
public class Apparel extends Model {
}
