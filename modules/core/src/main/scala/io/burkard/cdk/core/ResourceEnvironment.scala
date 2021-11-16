package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceEnvironment {

  def apply(
    region: String,
    account: String
  ): software.amazon.awscdk.ResourceEnvironment =
    (new software.amazon.awscdk.ResourceEnvironment.Builder)
      .region(region)
      .account(account)
      .build()
}
