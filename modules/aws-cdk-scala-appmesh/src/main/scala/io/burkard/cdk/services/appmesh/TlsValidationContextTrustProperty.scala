package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TlsValidationContextTrustProperty {

  def apply(
    sds: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextSdsTrustProperty] = None,
    file: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextFileTrustProperty] = None,
    acm: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextAcmTrustProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextTrustProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextTrustProperty.Builder)
      .sds(sds.orNull)
      .file(file.orNull)
      .acm(acm.orNull)
      .build()
}
