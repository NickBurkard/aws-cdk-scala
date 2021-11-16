package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CapacitySizeProperty {

  def apply(
    `type`: String,
    value: Number
  ): software.amazon.awscdk.services.sagemaker.CfnEndpoint.CapacitySizeProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpoint.CapacitySizeProperty.Builder)
      .`type`(`type`)
      .value(value)
      .build()
}
