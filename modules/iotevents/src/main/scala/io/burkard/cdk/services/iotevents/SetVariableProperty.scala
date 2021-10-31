package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SetVariableProperty {

  def apply(
    variableName: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetVariableProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetVariableProperty.Builder)
      .variableName(variableName.orNull)
      .value(value.orNull)
      .build()
}
