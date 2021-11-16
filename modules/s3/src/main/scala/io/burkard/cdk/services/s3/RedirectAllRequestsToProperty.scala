package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RedirectAllRequestsToProperty {

  def apply(
    hostName: String,
    protocol: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.RedirectAllRequestsToProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.RedirectAllRequestsToProperty.Builder)
      .hostName(hostName)
      .protocol(protocol.orNull)
      .build()
}
