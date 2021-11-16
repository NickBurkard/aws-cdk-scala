package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccessEndpointProperty {

  def apply(
    vpceId: String,
    endpointType: String
  ): software.amazon.awscdk.services.appstream.CfnImageBuilder.AccessEndpointProperty =
    (new software.amazon.awscdk.services.appstream.CfnImageBuilder.AccessEndpointProperty.Builder)
      .vpceId(vpceId)
      .endpointType(endpointType)
      .build()
}
