package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
