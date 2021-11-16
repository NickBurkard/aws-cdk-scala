package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProductionVariant {

  def apply(
    variantName: String,
    instanceType: software.amazon.awscdk.services.ec2.InstanceType,
    modelName: String,
    initialVariantWeight: Option[Number] = None,
    acceleratorType: Option[software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorType] = None,
    initialInstanceCount: Option[Number] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.ProductionVariant =
    (new software.amazon.awscdk.services.stepfunctions.tasks.ProductionVariant.Builder)
      .variantName(variantName)
      .instanceType(instanceType)
      .modelName(modelName)
      .initialVariantWeight(initialVariantWeight.orNull)
      .acceleratorType(acceleratorType.orNull)
      .initialInstanceCount(initialInstanceCount.orNull)
      .build()
}
