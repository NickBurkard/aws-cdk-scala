package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TlsCertificateConfig {

  def apply(
    tlsCertificate: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsCertificateProperty] = None
  ): software.amazon.awscdk.services.appmesh.TlsCertificateConfig =
    (new software.amazon.awscdk.services.appmesh.TlsCertificateConfig.Builder)
      .tlsCertificate(tlsCertificate.orNull)
      .build()
}
