package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TlsCertificateConfig {

  def apply(
    tlsCertificate: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsCertificateProperty] = None
  ): software.amazon.awscdk.services.appmesh.TlsCertificateConfig =
    (new software.amazon.awscdk.services.appmesh.TlsCertificateConfig.Builder)
      .tlsCertificate(tlsCertificate.orNull)
      .build()
}
