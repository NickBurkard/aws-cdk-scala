package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RedirectTarget {

  def apply(
    hostName: String,
    protocol: Option[software.amazon.awscdk.services.s3.RedirectProtocol] = None
  ): software.amazon.awscdk.services.s3.RedirectTarget =
    (new software.amazon.awscdk.services.s3.RedirectTarget.Builder)
      .hostName(hostName)
      .protocol(protocol.orNull)
      .build()
}
