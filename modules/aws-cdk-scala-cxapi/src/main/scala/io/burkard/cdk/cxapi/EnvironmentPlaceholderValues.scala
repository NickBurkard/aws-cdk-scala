package io.burkard.cdk.cxapi

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
