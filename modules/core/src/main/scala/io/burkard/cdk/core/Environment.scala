package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Environment {

  def apply(
    region: Option[String] = None,
    account: Option[String] = None
  ): software.amazon.awscdk.Environment =
    (new software.amazon.awscdk.Environment.Builder)
      .region(region.orNull)
      .account(account.orNull)
      .build()
}
