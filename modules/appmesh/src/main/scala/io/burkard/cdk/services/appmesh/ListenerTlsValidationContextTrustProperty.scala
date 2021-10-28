package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ListenerTlsValidationContextTrustProperty {

  def apply(
    sds: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextSdsTrustProperty] = None,
    file: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextFileTrustProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextTrustProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextTrustProperty.Builder)
      .sds(sds.orNull)
      .file(file.orNull)
      .build()
}
