package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ListenerTlsCertificateProperty {

  def apply(
    sds: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsSdsCertificateProperty] = None,
    file: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsFileCertificateProperty] = None,
    acm: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsAcmCertificateProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsCertificateProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsCertificateProperty.Builder)
      .sds(sds.orNull)
      .file(file.orNull)
      .acm(acm.orNull)
      .build()
}
