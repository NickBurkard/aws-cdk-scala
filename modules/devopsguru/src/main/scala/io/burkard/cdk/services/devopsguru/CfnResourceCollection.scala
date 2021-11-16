package io.burkard.cdk.services.devopsguru

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceCollection {

  def apply(
    internalResourceId: String,
    resourceCollectionFilter: software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.devopsguru.CfnResourceCollection =
    software.amazon.awscdk.services.devopsguru.CfnResourceCollection.Builder
      .create(stackCtx, internalResourceId)
      .resourceCollectionFilter(resourceCollectionFilter)
      .build()
}
