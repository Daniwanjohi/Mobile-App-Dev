package com.example.tenantmanagementsystem

data class Tenant(
    val name: String,
    val phone: String,
    val rent: String
) {
    // Task 2: Update function to show "Rent paid: KSh..."
    fun summary(): String {
        return "Tenant: $name\nPhone: $phone\nRent paid: KSh $rent"
    }
}