package io.burkard.cdk.services.devopsguru

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResourceCollectionFilterProperty {

  def apply(
    cloudFormation: Option[software.amazon.awscdk.services.devopsguru.CfnResourceCollection.CloudFormationCollectionFilterProperty] = None
  ): software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty =
    (new software.amazon.awscdk.services.devopsguru.CfnResourceCollection.ResourceCollectionFilterProperty.Builder)
      .cloudFormation(cloudFormation.orNull)
      .build()
}
