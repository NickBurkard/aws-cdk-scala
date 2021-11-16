package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecurityGroupContextQuery {

  def apply(
    securityGroupId: String,
    region: String,
    account: String,
    lookupRoleArn: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery =
    (new software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery.Builder)
      .securityGroupId(securityGroupId)
      .region(region)
      .account(account)
      .lookupRoleArn(lookupRoleArn.orNull)
      .build()
}
