package io.burkard.cdk.cxapi

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EnvironmentPlaceholderValues {

  def apply(
    partition: Option[String] = None,
    accountId: Option[String] = None,
    region: Option[String] = None
  ): software.amazon.awscdk.cxapi.EnvironmentPlaceholderValues =
    (new software.amazon.awscdk.cxapi.EnvironmentPlaceholderValues.Builder)
      .partition(partition.orNull)
      .accountId(accountId.orNull)
      .region(region.orNull)
      .build()
}
