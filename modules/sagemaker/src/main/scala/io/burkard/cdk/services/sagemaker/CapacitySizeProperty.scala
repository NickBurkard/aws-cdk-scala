package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CapacitySizeProperty {

  def apply(
    `type`: Option[String] = None,
    value: Option[Number] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpoint.CapacitySizeProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpoint.CapacitySizeProperty.Builder)
      .`type`(`type`.orNull)
      .value(value.orNull)
      .build()
}
