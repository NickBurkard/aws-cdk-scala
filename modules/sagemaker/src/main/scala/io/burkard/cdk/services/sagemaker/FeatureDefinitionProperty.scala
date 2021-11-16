package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FeatureDefinitionProperty {

  def apply(
    featureName: String,
    featureType: String
  ): software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.FeatureDefinitionProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.FeatureDefinitionProperty.Builder)
      .featureName(featureName)
      .featureType(featureType)
      .build()
}
