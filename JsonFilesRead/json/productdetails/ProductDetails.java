package com.json.productdetails;

public class ProductDetails {
    private String id;
    private long price;
    private long basePrice;
    private String promoEndDate;
    private long pricePer;
    private String sellByWeight;
    private String averageWeight;
    private String maxWeight;
    private String upc;
    private boolean edited;
    private long versionid;
    private String lineadded;
    private String aisleId;
    private  String name;
    private String image;
    private long estimatedDiscount;
    private String departmentName;
    private String aisleName;
    private String shelfName;
    private String promoDescription;
    private String promoType;
    private String promoText;
    private long triggerQuantity;
    private String comment;
    private String substitutionValue;
    private String inlinePromoId;
    private String inlinePromoImage;
    private long quantity;
    private long displayType;
    private String unitOfMeasure;
    private long restrictedValue;
    private long salesRank;
    private long width;
    private long depth;
    private long height;
    private String zonecode;
    private String prop65WarningTypeCD;
    private String prop65WarningText;
    private boolean prop65WarningIconRequired;
    private String productDetailsUrl;
    private String similarItemsUrl;


    public ProductDetails(){
    }

    public ProductDetails(String id, long price, long basePrice, String promoEndDate, long pricePer, String sellByWeight,
                          String averageWeight, String maxWeight, String upc, boolean edited, long versionid, String lineadded,
                          String aisleId, String name, String image, long estimatedDiscount, String departmentName, String aisleName,
                          String shelfName, String promoDescription, String promoType, String promoText, long triggerQuantity,
                          String comment, String substitutionValue, String inlinePromoId, String inlinePromoImage, long quantity,
                          long displayType, String unitOfMeasure, long restrictedValue, long salesRank, long width, long depth, long height,
                          String zonecode, String prop65WarningTypeCD, String prop65WarningText, boolean prop65WarningIconRequired,
                          String productDetailsUrl, String similarItemsUrl) {
        this.id = id;
        this.price = price;
        this.basePrice = basePrice;
        this.promoEndDate = promoEndDate;
        this.pricePer = pricePer;
        this.sellByWeight = sellByWeight;
        this.averageWeight = averageWeight;
        this.maxWeight = maxWeight;
        this.upc = upc;
        this.edited = edited;
        this.versionid = versionid;
        this.lineadded = lineadded;
        this.aisleId = aisleId;
        this.name = name;
        this.image = image;
        this.estimatedDiscount = estimatedDiscount;
        this.departmentName = departmentName;
        this.aisleName = aisleName;
        this.shelfName = shelfName;
        this.promoDescription = promoDescription;
        this.promoType = promoType;
        this.promoText = promoText;
        this.triggerQuantity = triggerQuantity;
        this.comment = comment;
        this.substitutionValue = substitutionValue;
        this.inlinePromoId = inlinePromoId;
        this.inlinePromoImage = inlinePromoImage;
        this.quantity = quantity;
        this.displayType = displayType;
        this.unitOfMeasure = unitOfMeasure;
        this.restrictedValue = restrictedValue;
        this.salesRank = salesRank;
        this.width = width;
        this.depth = depth;
        this.height = height;
        this.zonecode = zonecode;
        this.prop65WarningTypeCD = prop65WarningTypeCD;
        this.prop65WarningText = prop65WarningText;
        this.prop65WarningIconRequired = prop65WarningIconRequired;
        this.productDetailsUrl = productDetailsUrl;
        this.similarItemsUrl = similarItemsUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(long basePrice) {
        this.basePrice = basePrice;
    }

    public String getPromoEndDate() {
        return promoEndDate;
    }

    public void setPromoEndDate(String promoEndDate) {
        this.promoEndDate = promoEndDate;
    }

    public long getPricePer() {
        return pricePer;
    }

    public void setPricePer(long pricePer) {
        this.pricePer = pricePer;
    }

    public String getSellByWeight() {
        return sellByWeight;
    }

    public void setSellByWeight(String sellByWeight) {
        this.sellByWeight = sellByWeight;
    }

    public String getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(String averageWeight) {
        this.averageWeight = averageWeight;
    }

    public String getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(String maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public boolean isEdited() {
        return edited;
    }

    public void setEdited(boolean edited) {
        this.edited = edited;
    }

    public long getVersionid() {
        return versionid;
    }

    public void setVersionid(long versionid) {
        this.versionid = versionid;
    }

    public String getLineadded() {
        return lineadded;
    }

    public void setLineadded(String lineadded) {
        this.lineadded = lineadded;
    }

    public String getAisleId() {
        return aisleId;
    }

    public void setAisleId(String aisleId) {
        this.aisleId = aisleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getEstimatedDiscount() {
        return estimatedDiscount;
    }

    public void setEstimatedDiscount(long estimatedDiscount) {
        this.estimatedDiscount = estimatedDiscount;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getAisleName() {
        return aisleName;
    }

    public void setAisleName(String aisleName) {
        this.aisleName = aisleName;
    }

    public String getShelfName() {
        return shelfName;
    }

    public void setShelfName(String shelfName) {
        this.shelfName = shelfName;
    }

    public String getPromoDescription() {
        return promoDescription;
    }

    public void setPromoDescription(String promoDescription) {
        this.promoDescription = promoDescription;
    }

    public String getPromoType() {
        return promoType;
    }

    public void setPromoType(String promoType) {
        this.promoType = promoType;
    }

    public String getPromoText() {
        return promoText;
    }

    public void setPromoText(String promoText) {
        this.promoText = promoText;
    }

    public long getTriggerQuantity() {
        return triggerQuantity;
    }

    public void setTriggerQuantity(long triggerQuantity) {
        this.triggerQuantity = triggerQuantity;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getSubstitutionValue() {
        return substitutionValue;
    }

    public void setSubstitutionValue(String substitutionValue) {
        this.substitutionValue = substitutionValue;
    }

    public String getInlinePromoId() {
        return inlinePromoId;
    }

    public void setInlinePromoId(String inlinePromoId) {
        this.inlinePromoId = inlinePromoId;
    }

    public String getInlinePromoImage() {
        return inlinePromoImage;
    }

    public void setInlinePromoImage(String inlinePromoImage) {
        this.inlinePromoImage = inlinePromoImage;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getDisplayType() {
        return displayType;
    }

    public void setDisplayType(long displayType) {
        this.displayType = displayType;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public long getRestrictedValue() {
        return restrictedValue;
    }

    public void setRestrictedValue(long restrictedValue) {
        this.restrictedValue = restrictedValue;
    }

    public long getSalesRank() {
        return salesRank;
    }

    public void setSalesRank(long salesRank) {
        this.salesRank = salesRank;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    public long getDepth() {
        return depth;
    }

    public void setDepth(long depth) {
        this.depth = depth;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public String getZonecode() {
        return zonecode;
    }

    public void setZonecode(String zonecode) {
        this.zonecode = zonecode;
    }

    public String getProp65WarningTypeCD() {
        return prop65WarningTypeCD;
    }

    public void setProp65WarningTypeCD(String prop65WarningTypeCD) {
        this.prop65WarningTypeCD = prop65WarningTypeCD;
    }

    public String getProp65WarningText() {
        return prop65WarningText;
    }

    public void setProp65WarningText(String prop65WarningText) {
        this.prop65WarningText = prop65WarningText;
    }

    public boolean isProp65WarningIconRequired() {
        return prop65WarningIconRequired;
    }

    public void setProp65WarningIconRequired(boolean prop65WarningIconRequired) {
        this.prop65WarningIconRequired = prop65WarningIconRequired;
    }

    public String getProductDetailsUrl() {
        return productDetailsUrl;
    }

    public void setProductDetailsUrl(String productDetailsUrl) {
        this.productDetailsUrl = productDetailsUrl;
    }

    public String getSimilarItemsUrl() {
        return similarItemsUrl;
    }

    public void setSimilarItemsUrl(String similarItemsUrl) {
        this.similarItemsUrl = similarItemsUrl;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", basePrice=" + basePrice +
                ", promoEndDate='" + promoEndDate + '\'' +
                ", pricePer=" + pricePer +
                ", sellByWeight='" + sellByWeight + '\'' +
                ", averageWeight='" + averageWeight + '\'' +
                ", maxWeight='" + maxWeight + '\'' +
                ", upc='" + upc + '\'' +
                ", edited=" + edited +
                ", versionid=" + versionid +
                ", lineadded='" + lineadded + '\'' +
                ", aisleId='" + aisleId + '\'' +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", estimatedDiscount=" + estimatedDiscount +
                ", departmentName='" + departmentName + '\'' +
                ", aisleName='" + aisleName + '\'' +
                ", shelfName='" + shelfName + '\'' +
                ", promoDescription='" + promoDescription + '\'' +
                ", promoType='" + promoType + '\'' +
                ", promoText='" + promoText + '\'' +
                ", triggerQuantity=" + triggerQuantity +
                ", comment='" + comment + '\'' +
                ", substitutionValue='" + substitutionValue + '\'' +
                ", inlinePromoId='" + inlinePromoId + '\'' +
                ", inlinePromoImage='" + inlinePromoImage + '\'' +
                ", quantity=" + quantity +
                ", displayType=" + displayType +
                ", unitOfMeasure='" + unitOfMeasure + '\'' +
                ", restrictedValue=" + restrictedValue +
                ", salesRank=" + salesRank +
                ", width=" + width +
                ", depth=" + depth +
                ", height=" + height +
                ", zonecode='" + zonecode + '\'' +
                ", prop65WarningTypeCD='" + prop65WarningTypeCD + '\'' +
                ", prop65WarningText='" + prop65WarningText + '\'' +
                ", prop65WarningIconRequired=" + prop65WarningIconRequired +
                ", productDetailsUrl='" + productDetailsUrl + '\'' +
                ", similarItemsUrl='" + similarItemsUrl + '\'' +
                '}';
    }
}
