package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResourceEnvironment {

  def apply(
    region: Option[String] = None,
    account: Option[String] = None
  ): software.amazon.awscdk.ResourceEnvironment =
    (new software.amazon.awscdk.ResourceEnvironment.Builder)
      .region(region.orNull)
      .account(account.orNull)
      .build()
}
