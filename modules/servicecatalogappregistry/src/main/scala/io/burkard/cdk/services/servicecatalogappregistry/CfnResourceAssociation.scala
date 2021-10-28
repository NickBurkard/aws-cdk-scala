package io.burkard.cdk.services.servicecatalogappregistry

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResourceAssociation {

  def apply(
    internalResourceId: String,
    application: Option[String] = None,
    resourceType: Option[String] = None,
    resource: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociation =
    software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociation.Builder
      .create(stackCtx, internalResourceId)
      .application(application.orNull)
      .resourceType(resourceType.orNull)
      .resource(resource.orNull)
      .build()
}
