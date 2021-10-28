package io.burkard.cdk.cxapi

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Environment {

  def apply(
    name: Option[String] = None,
    region: Option[String] = None,
    account: Option[String] = None
  ): software.amazon.awscdk.cxapi.Environment =
    (new software.amazon.awscdk.cxapi.Environment.Builder)
      .name(name.orNull)
      .region(region.orNull)
      .account(account.orNull)
      .build()
}
