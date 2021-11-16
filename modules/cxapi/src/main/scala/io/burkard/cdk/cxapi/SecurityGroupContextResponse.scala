package io.burkard.cdk.cxapi

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecurityGroupContextResponse {

  def apply(
    securityGroupId: String,
    allowAllOutbound: Boolean
  ): software.amazon.awscdk.cxapi.SecurityGroupContextResponse =
    (new software.amazon.awscdk.cxapi.SecurityGroupContextResponse.Builder)
      .securityGroupId(securityGroupId)
      .allowAllOutbound(allowAllOutbound)
      .build()
}
