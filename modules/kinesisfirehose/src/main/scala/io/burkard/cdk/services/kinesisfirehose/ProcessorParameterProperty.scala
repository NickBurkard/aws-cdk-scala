package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProcessorParameterProperty {

  def apply(
    parameterValue: String,
    parameterName: String
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorParameterProperty.Builder)
      .parameterValue(parameterValue)
      .parameterName(parameterName)
      .build()
}
