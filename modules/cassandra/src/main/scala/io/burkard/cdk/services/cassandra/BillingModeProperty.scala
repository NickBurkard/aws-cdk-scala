package io.burkard.cdk.services.cassandra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BillingModeProperty {

  def apply(
    mode: String,
    provisionedThroughput: Option[software.amazon.awscdk.services.cassandra.CfnTable.ProvisionedThroughputProperty] = None
  ): software.amazon.awscdk.services.cassandra.CfnTable.BillingModeProperty =
    (new software.amazon.awscdk.services.cassandra.CfnTable.BillingModeProperty.Builder)
      .mode(mode)
      .provisionedThroughput(provisionedThroughput.orNull)
      .build()
}
