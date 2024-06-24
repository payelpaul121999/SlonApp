package com.pal.slonapp.ExpenceTracker.model

data class ExpenseSummary(
    val type: String,
    val date: String,
    val total_amount: Double
)