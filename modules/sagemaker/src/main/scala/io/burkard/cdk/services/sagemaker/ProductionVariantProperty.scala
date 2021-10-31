package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProductionVariantProperty {

  def apply(
    variantName: Option[String] = None,
    instanceType: Option[String] = None,
    modelName: Option[String] = None,
    initialVariantWeight: Option[Number] = None,
    acceleratorType: Option[String] = None,
    initialInstanceCount: Option[Number] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.ProductionVariantProperty.Builder)
      .variantName(variantName.orNull)
      .instanceType(instanceType.orNull)
      .modelName(modelName.orNull)
      .initialVariantWeight(initialVariantWeight.orNull)
      .acceleratorType(acceleratorType.orNull)
      .initialInstanceCount(initialInstanceCount.orNull)
      .build()
}
