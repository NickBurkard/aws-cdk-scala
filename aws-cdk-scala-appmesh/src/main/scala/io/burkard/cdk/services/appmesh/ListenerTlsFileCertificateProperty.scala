package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ListenerTlsFileCertificateProperty {

  def apply(
    privateKey: Option[String] = None,
    certificateChain: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsFileCertificateProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsFileCertificateProperty.Builder)
      .privateKey(privateKey.orNull)
      .certificateChain(certificateChain.orNull)
      .build()
}
