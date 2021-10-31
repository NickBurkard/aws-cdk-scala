package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AttributeProperty {

  def apply(
    jsonPath: Option[String] = None
  ): software.amazon.awscdk.services.iotevents.CfnInput.AttributeProperty =
    (new software.amazon.awscdk.services.iotevents.CfnInput.AttributeProperty.Builder)
      .jsonPath(jsonPath.orNull)
      .build()
}
