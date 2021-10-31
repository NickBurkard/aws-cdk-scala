package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceProps {

  def apply(
    environmentFromArn: Option[String] = None,
    physicalName: Option[String] = None,
    region: Option[String] = None,
    account: Option[String] = None
  ): software.amazon.awscdk.ResourceProps =
    (new software.amazon.awscdk.ResourceProps.Builder)
      .environmentFromArn(environmentFromArn.orNull)
      .physicalName(physicalName.orNull)
      .region(region.orNull)
      .account(account.orNull)
      .build()
}
