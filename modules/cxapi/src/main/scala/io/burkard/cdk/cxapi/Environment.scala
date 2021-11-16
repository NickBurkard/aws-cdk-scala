package io.burkard.cdk.cxapi

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Environment {

  def apply(
    name: String,
    region: String,
    account: String
  ): software.amazon.awscdk.cxapi.Environment =
    (new software.amazon.awscdk.cxapi.Environment.Builder)
      .name(name)
      .region(region)
      .account(account)
      .build()
}
