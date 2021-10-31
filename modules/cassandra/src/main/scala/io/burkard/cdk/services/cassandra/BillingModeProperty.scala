package io.burkard.cdk.services.cassandra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BillingModeProperty {

  def apply(
    provisionedThroughput: Option[software.amazon.awscdk.services.cassandra.CfnTable.ProvisionedThroughputProperty] = None,
    mode: Option[String] = None
  ): software.amazon.awscdk.services.cassandra.CfnTable.BillingModeProperty =
    (new software.amazon.awscdk.services.cassandra.CfnTable.BillingModeProperty.Builder)
      .provisionedThroughput(provisionedThroughput.orNull)
      .mode(mode.orNull)
      .build()
}
