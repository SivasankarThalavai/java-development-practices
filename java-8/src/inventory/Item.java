package inventory;

import java.util.Map;

public class Item {

	// stock-keeping unit
	private String sku;
	private String itemName;
	private CategoryType categoryType;
	private SubCategoryType subCategoryType;
	private Map<String, Object> specifications;
	private Vendor vendorInfo;
	private float mrPrice;
	private float vendorPrice;
	private AuditModel auditModel;

	public Item() {
		super();
	}

	public Item(String sku, String itemName, CategoryType categoryType, SubCategoryType subCategoryType,
			Map<String, Object> specifications, Vendor vendorInfo, float mrPrice, float vendorPrice,
			AuditModel auditModel) {
		super();
		this.sku = sku;
		this.itemName = itemName;
		this.categoryType = categoryType;
		this.subCategoryType = subCategoryType;
		this.specifications = specifications;
		this.vendorInfo = vendorInfo;
		this.mrPrice = mrPrice;
		this.vendorPrice = vendorPrice;
		this.auditModel = auditModel;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public CategoryType getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(CategoryType categoryType) {
		this.categoryType = categoryType;
	}

	public SubCategoryType getSubCategoryType() {
		return subCategoryType;
	}

	public void setSubCategoryType(SubCategoryType subCategoryType) {
		this.subCategoryType = subCategoryType;
	}

	public Map<String, Object> getSpecifications() {
		return specifications;
	}

	public void setSpecifications(Map<String, Object> specifications) {
		this.specifications = specifications;
	}

	public Vendor getVendor() {
		return vendorInfo;
	}

	public void setVendor(Vendor vendor) {
		this.vendorInfo = vendor;
	}

	public float getVendorPrice() {
		return vendorPrice;
	}

	public void setVendorPrice(float vendorPrice) {
		this.vendorPrice = vendorPrice;
	}

	public AuditModel getAuditModel() {
		return auditModel;
	}

	public void setAuditModel(AuditModel auditModel) {
		this.auditModel = auditModel;
	}

	public Vendor getVendorInfo() {
		return vendorInfo;
	}

	public void setVendorInfo(Vendor vendorInfo) {
		this.vendorInfo = vendorInfo;
	}

	public float getMrPrice() {
		return mrPrice;
	}

	public void setMrPrice(float mrPrice) {
		this.mrPrice = mrPrice;
	}

	@Override
	public String toString() {
		return "Item [sku=" + sku + ", itemName=" + itemName + ", categoryType=" + categoryType + ", subCategoryType="
				+ subCategoryType + ", specifications=" + specifications + ", vendor=" + vendorInfo + ", vendorPrice="
				+ vendorPrice + ", auditModel=" + auditModel + "]";
	}

}