package io.burkard.cdk.services.servicecatalogappregistry

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAttributeGroupAssociation {

  def apply(
    internalResourceId: String,
    application: String,
    attributeGroup: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociation =
    software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupAssociation.Builder
      .create(stackCtx, internalResourceId)
      .application(application)
      .attributeGroup(attributeGroup)
      .build()
}
