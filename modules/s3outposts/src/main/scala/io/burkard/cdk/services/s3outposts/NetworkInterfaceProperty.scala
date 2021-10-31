package io.burkard.cdk.services.s3outposts

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkInterfaceProperty {

  def apply(
    networkInterfaceId: Option[String] = None
  ): software.amazon.awscdk.services.s3outposts.CfnEndpoint.NetworkInterfaceProperty =
    (new software.amazon.awscdk.services.s3outposts.CfnEndpoint.NetworkInterfaceProperty.Builder)
      .networkInterfaceId(networkInterfaceId.orNull)
      .build()
}
