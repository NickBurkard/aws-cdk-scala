package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProductionVariantProperty {

  def apply(
    variantName: String,
    instanceType: String,
    modelName: String,
    initialVariantWeight: Number,
    initialInstanceCount: Number,
    acceleratorType: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty.Builder)
      .variantName(variantName)
      .instanceType(instanceType)
      .modelName(modelName)
      .initialVariantWeight(initialVariantWeight)
      .initialInstanceCount(initialInstanceCount)
      .acceleratorType(acceleratorType.orNull)
      .build()
}
