package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualGatewayTlsValidationContextTrustProperty {

  def apply(
    sds: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty] = None,
    file: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty] = None,
    acm: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextAcmTrustProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty.Builder)
      .sds(sds.orNull)
      .file(file.orNull)
      .acm(acm.orNull)
      .build()
}
