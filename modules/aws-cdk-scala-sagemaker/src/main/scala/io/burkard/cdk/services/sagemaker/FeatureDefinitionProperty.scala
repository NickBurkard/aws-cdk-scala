package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FeatureDefinitionProperty {

  def apply(
    featureName: Option[String] = None,
    featureType: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.FeatureDefinitionProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.FeatureDefinitionProperty.Builder)
      .featureName(featureName.orNull)
      .featureType(featureType.orNull)
      .build()
}
