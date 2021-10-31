package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProcessorParameterProperty {

  def apply(
    parameterValue: Option[String] = None,
    parameterName: Option[String] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty.Builder)
      .parameterValue(parameterValue.orNull)
      .parameterName(parameterName.orNull)
      .build()
}
