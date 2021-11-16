package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ListenerTlsSdsCertificateProperty {

  def apply(
    secretName: String
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsSdsCertificateProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsSdsCertificateProperty.Builder)
      .secretName(secretName)
      .build()
}
