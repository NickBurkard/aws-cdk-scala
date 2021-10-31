package io.burkard.cdk.services.servicecatalogappregistry

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceAssociationProps {

  def apply(
    application: Option[String] = None,
    resourceType: Option[String] = None,
    resource: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps =
    (new software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociationProps.Builder)
      .application(application.orNull)
      .resourceType(resourceType.orNull)
      .resource(resource.orNull)
      .build()
}
