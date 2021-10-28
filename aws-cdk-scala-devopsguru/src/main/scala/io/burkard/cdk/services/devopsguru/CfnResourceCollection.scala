package io.burkard.cdk.services.devopsguru

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResourceCollection {

  def apply(
    internalResourceId: String,
    resourceCollectionFilter: Option[software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.devopsguru.CfnResourceCollection =
    software.amazon.awscdk.services.devopsguru.CfnResourceCollection.Builder
      .create(stackCtx, internalResourceId)
      .resourceCollectionFilter(resourceCollectionFilter.orNull)
      .build()
}
