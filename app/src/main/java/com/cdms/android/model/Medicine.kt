package com.cdms.android.model

import com.google.gson.annotations.SerializedName

class Medicine {
    @SerializedName("BillID")
    var billID : String? = null
    @SerializedName("billItemID")
    var billItemID: Int? = null
    @SerializedName("PatientID")
    var patientID: Int? = null
    @SerializedName("LocationID")
    var locationID: Int? = null
    @SerializedName("BillItemDate")
    var billItemDate: String? = null
    @SerializedName("ItemName")
    var itemName: String? = null
    @SerializedName("ItemId")
    var itemId: Int? = null
    @SerializedName("ItemType")
    var itemType: Int? = null
    @SerializedName("Quantity")
    var quantity: Int? = null
    @SerializedName("PaymentType")
    var paymentType: String? = null
    @SerializedName("PaymentName")
    var paymentName: String? = null
    @SerializedName("SellingPrice")
    var sellingPrice: Double? = null
    @SerializedName("Amount")
    var amount: Double? = null
    @SerializedName("Discount")
    var discount: Double? = null
    @SerializedName("PaymentStatus")
    var paymentStatus: Double? = null
    @SerializedName("PayItem")
    var payItem: String? = null
    @SerializedName("ServiceStatus")
    var serviceStatus: Double? = null
    @SerializedName("ModuleId")
    var moduleId: Double? = null
    @SerializedName("CostCenterName")
    var costCenterName: String? = null
    @SerializedName("ItemTypeName")
    var itemTypeName: String? = null
    @SerializedName("ItemSourceReferenceID")
    var itemSourceReferenceID: Double? = null

}