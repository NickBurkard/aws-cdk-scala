package io.burkard.cdk.services.servicecatalogappregistry

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAttributeGroupAssociationProps {

  def apply(
    application: String,
    attributeGroup: String
  ): software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps =
    (new software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociationProps.Builder)
      .application(application)
      .attributeGroup(attributeGroup)
      .build()
}
