package io.burkard.cdk.services.servicecatalogappregistry

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAttributeGroupAssociationProps {

  def apply(
    application: Option[String] = None,
    attributeGroup: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps =
    (new software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps.Builder)
      .application(application.orNull)
      .attributeGroup(attributeGroup.orNull)
      .build()
}
