package io.burkard.cdk.cxapi

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SecurityGroupContextResponse {

  def apply(
    securityGroupId: Option[String] = None,
    allowAllOutbound: Option[Boolean] = None
  ): software.amazon.awscdk.cxapi.SecurityGroupContextResponse =
    (new software.amazon.awscdk.cxapi.SecurityGroupContextResponse.Builder)
      .securityGroupId(securityGroupId.orNull)
      .allowAllOutbound(allowAllOutbound.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
