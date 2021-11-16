package io.burkard.cdk.cxapi

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EnvironmentPlaceholderValues {

  def apply(
    partition: String,
    accountId: String,
    region: String
  ): software.amazon.awscdk.cxapi.EnvironmentPlaceholderValues =
    (new software.amazon.awscdk.cxapi.EnvironmentPlaceholderValues.Builder)
      .partition(partition)
      .accountId(accountId)
      .region(region)
      .build()
}
