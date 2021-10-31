package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
