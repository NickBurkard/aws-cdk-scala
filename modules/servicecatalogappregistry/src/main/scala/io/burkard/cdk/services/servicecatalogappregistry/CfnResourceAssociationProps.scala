package io.burkard.cdk.services.servicecatalogappregistry

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceAssociationProps {

  def apply(
    application: String,
    resourceType: String,
    resource: String
  ): software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps =
    (new software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps.Builder)
      .application(application)
      .resourceType(resourceType)
      .resource(resource)
      .build()
}
