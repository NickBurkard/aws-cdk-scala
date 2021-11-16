package io.burkard.cdk.services.servicecatalogappregistry

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceAssociation {

  def apply(
    internalResourceId: String,
    application: String,
    resourceType: String,
    resource: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociation =
    software.amazon.awscdk.services.servicecatalogappregistry.CfnResourceAssociation.Builder
      .create(stackCtx, internalResourceId)
      .application(application)
      .resourceType(resourceType)
      .resource(resource)
      .build()
}
