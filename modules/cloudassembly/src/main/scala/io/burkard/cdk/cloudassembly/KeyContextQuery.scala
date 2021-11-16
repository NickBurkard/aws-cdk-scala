package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KeyContextQuery {

  def apply(
    region: String,
    account: String,
    aliasName: String,
    lookupRoleArn: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.KeyContextQuery =
    (new software.amazon.awscdk.cloudassembly.schema.KeyContextQuery.Builder)
      .region(region)
      .account(account)
      .aliasName(aliasName)
      .lookupRoleArn(lookupRoleArn.orNull)
      .build()
}
