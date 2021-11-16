package io.burkard.cdk.services.devopsguru

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceCollectionProps {

  def apply(
    resourceCollectionFilter: software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty
  ): software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps =
    (new software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps.Builder)
      .resourceCollectionFilter(resourceCollectionFilter)
      .build()
}
