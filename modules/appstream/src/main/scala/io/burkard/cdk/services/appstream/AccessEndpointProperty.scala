package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccessEndpointProperty {

  def apply(
    vpceId: Option[String] = None,
    endpointType: Option[String] = None
  ): software.amazon.awscdk.services.appstream.CfnStack.AccessEndpointProperty =
    (new software.amazon.awscdk.services.appstream.CfnStack.AccessEndpointProperty.Builder)
      .vpceId(vpceId.orNull)
      .endpointType(endpointType.orNull)
      .build()
}
