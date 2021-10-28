package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AccessEndpointProperty {

  def apply(
    vpceId: Option[String] = None,
    endpointType: Option[String] = None
  ): software.amazon.awscdk.services.appstream.CfnImageBuilder.AccessEndpointProperty =
    (new software.amazon.awscdk.services.appstream.CfnImageBuilder.AccessEndpointProperty.Builder)
      .vpceId(vpceId.orNull)
      .endpointType(endpointType.orNull)
      .build()
}
