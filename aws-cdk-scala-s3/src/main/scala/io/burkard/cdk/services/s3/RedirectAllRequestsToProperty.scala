package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RedirectAllRequestsToProperty {

  def apply(
    hostName: Option[String] = None,
    protocol: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.RedirectAllRequestsToProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.RedirectAllRequestsToProperty.Builder)
      .hostName(hostName.orNull)
      .protocol(protocol.orNull)
      .build()
}
